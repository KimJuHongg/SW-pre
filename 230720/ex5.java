package day0720;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		
//		System.out.print("이름 입력 : ");
//		String name = scan.nextLine();
//		
//		System.out.print("전화번호 입력 : ");
//		String p_number = scan.nextLine();
	
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
		}
		
		String strName = args[0];
		String strphone = args[1];
		
		System.out.println(strName + ", " + strphone);
	}

}
