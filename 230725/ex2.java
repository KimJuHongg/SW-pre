package day0725;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 : " );
		String num = scan.nextLine();
		
		StringBuilder sb = new StringBuilder();
		
		
		
		for(int i = 0; i < num.length(); i++) {
			sb.append(num.charAt(num.length()-(i+1))+" ");
			
		}
		System.out.println("[ "+sb+"]");
		
	}

}
