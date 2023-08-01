package 230801;

import java.util.Scanner;

public class PersonApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int menuNum;
		
		PersonService service = new PersonService();
		
		while(run) {
			menu();
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 -> service.insertPerson();
			
			case 2 -> service.searchPersonByName();
			
			case 3 -> service.deletePerson();
			
			case 4 -> service.printPersonSet();
			
			default -> run = false;
			}
		}
		
		System.out.println("종료");
		sc.close();
	}
	
	public static void menu() {
		System.out.println("** 회원 관리 프로그램 **");
		System.out.println("1.회원가입 2.회원검색 3.회원탈퇴 4.전체출력 5.종료");
		
		System.out.println("선택하려는 메뉴의 번호를 입력 > ");
	}
}
