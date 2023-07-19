package day0719;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
//간단한 계산기를 구현하는 프로그램을 작성
//연산자와 피연산자 2개를 입력받은 후 결과를 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = scan.nextInt(); 
		
		System.out.print("부호 입력 : ");
		String cal = scan.next();
		
		//System.out.println();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = scan.nextInt();
		
		int sum = 0;
		
		switch(cal) {
			case "+":
				sum = num1 + num2;
				break;
				
			case "-":
				sum = num1 - num2;
				break;
				
			case "*":
				sum = num1 * num2;
				break;
				
			case "/":
				sum = num1 / num2;
				break;
				
			case "%":
				sum = num1 % num2;
				break;
				
			default :
				break;
		}
		
		System.out.println("계산 결과 : " + sum);
	}

}
