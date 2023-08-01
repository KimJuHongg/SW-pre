package telephone;

import java.util.Scanner;

public class StudentApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentService service = new StudentService();
		boolean run = true;
		while(run) {
			System.out.println("** 전화번호 관리 프로그램 **");
			System.out.println("1.추가 2.조회 3.삭제 4.전체 출력 5.종료");
			System.out.println("메뉴 선택 >");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 ->
			{
				service.addStudent();
				break;
			}
							
			case 2 ->
			{
				service.findStudent();
				break;
			}
			case 3 ->
			{
				service.removeStudent();
				break;
			}
			case 4 ->
			{
				service.printAll();
				break;
			}
			case 5 ->
			{
				run = false;
				System.out.println("프로그램 종료");
				
			}
			}
			
			
		}
		sc.close();
		
	}
}
