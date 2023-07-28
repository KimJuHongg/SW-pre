package day0728;

import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Employee> list = new ArrayList<>();
		boolean run = true;
		
		
		while(run) {
			System.out.println("===============================");
			System.out.println("** 사원 관리 **");
			System.out.println("1.추가 2.조회(id) 3.삭제(id) 4.전체사원출력 5.종료");
			System.out.println("===============================");
			
			System.out.print("선택 > ");
			int num = scan.nextInt();
					
			
			switch(num) {
			case 1:
				
				EmployeeService.addEmployee(list);
				break;
				
			case 2:
				EmployeeService.showEmployee(list);
				break;
					
				
			case 3:
				 EmployeeService.deleteEmployee(list);
				
				 
			case 4:
				EmployeeService.printEmployee(list);
				break;
			
				
			case 5:
				run = false;
				break;
					
			}
			
		}
	}
	
}
