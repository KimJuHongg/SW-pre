package day0728;

import java.util.List;
import java.util.Scanner;


public class EmployeeService {

	static HourlyEmployee hourlyEmployee;
	static SalariedEmployee salariedEmplyoee;
	
	public static void addEmployee(List<Employee> list) {
		Scanner scan = new Scanner(System.in);
		System.out.print("월급 사원일 경우에는 m, 시근 사원일 경우에는 h를 입력");
		String emCase = scan.next();
		switch(emCase) {
		case "m","M":
			addSalariedEmployee(list);
			break;
			
		case "h","H":
			addHourlyEmployee(list);
			break;
			
		default:
			System.out.println("잘못된 입력입니다");
		
		}
	}
	
	public static void addSalariedEmployee(List<Employee> list) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("추가할 직원 이름 입력 >");
		String name = scan.next();
		System.out.print("추가할 직원 ID 입력 >");
		String id = scan.next();
		System.out.print("추가할 직원 직급 입력 >");
		String position = scan.next();
		System.out.print("월급 입력 >");
		int monthly = scan.nextInt();
		SalariedEmployee salariedEmployee = new SalariedEmployee(name, id, position, monthly);
		list.add(salariedEmployee);
		salariedEmployee.computeSalary(salariedEmployee);
	}
	
	public static void addHourlyEmployee(List<Employee> list) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("추가할 직원 이름 입력 >");
		String name = scan.next();
		System.out.print("추가할 직원 ID 입력 >");
		String id = scan.next();
		System.out.print("추가할 직원 직급 입력 >");
		String position = scan.next();
		System.out.print("시급 입력 >");
		int rate = scan.nextInt();
		System.out.print("근무시간 입력");
		int hours = scan.nextInt();
		
		HourlyEmployee hourlyEmployee = new HourlyEmployee(name, id, position, rate, hours);
		list.add(hourlyEmployee);
		hourlyEmployee.computeSalary(hourlyEmployee);
	}
	
	public static void printEmployee(List<Employee> list) {
		if(list.size() < 1) {
			System.out.println("직원 목록에 직원이 없습니다. 직원 등록 먼저 해주세요");
		} else {
			for(int i =0; i<list.size(); i++) {
				Employee e = list.get(i);
				System.out.println(e);
			}
		}
	}
	
	
	public static void deleteEmployee(List<Employee> list) {
		if(list.size() <1 ) {
			System.out.println("직원 목록에 직원이 없습니다. 직원 등록 먼저 해주세요");
		} else {
			System.out.print("삭제할 직원의 id 입력 > ");
			Scanner scan = new Scanner(System.in);
			String id = scan.next();
			for(int i = 0; i <list.size(); i++) {
				if(id.equals(list.get(i).getId())) {
					list.remove(i);
				}
			}
		}
	}
	
	
	public static void showEmployee(List<Employee> list) {
		if(list.size() < 1) {
			System.out.println("직원 목록에 직원이 없습니다. 직원 등록 먼저 해주세요");
		}else {
			System.out.print("조회할 직원의 id 입력 > ");
			Scanner scan = new Scanner(System.in);
			String id = scan.next();
			for(int i = 0; i <list.size(); i++) {
				if(id.equals(list.get(i).getId())) {
					Employee e = list.get(i);
					System.out.println(e);
				}
			}
		}
	}
	
}
