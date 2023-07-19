//입력받아 구구단 출력
package day0719;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("출력할 구구단의 숫자 입력 : ");
		int num = scan.nextInt();
		
		System.out.println(num+"단");
		for(int i = 1; i <= 9; i++) {
			
			System.out.println(num + " * " + i + " = " + num*i);
		}
		
		scan.close();
	}

}
