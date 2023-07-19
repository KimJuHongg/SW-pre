//전체 구구단 출력
package day0719;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("출력할 구구단의 숫자 입력 : ");
		int num = scan.nextInt();
		
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i+"단");
			
			for(int j = 1; j <= 9; j++) {
				
				System.out.println(i + " * " + j + " = " + i*j);
		
			}
		}
		scan.close();
	}

}
