//３．　사용자로부터　두 개의　정수를　받아서　합，　차，　곱，　평균，　큰 수，　작은 수를　계산하여　출력하는　프로그램을　작성하시오．　

package day0717;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int a = scan.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int b = scan.nextInt();
		
		int bn;
		int sn;
		
		if(a > b) {
			bn = a;
			sn = b;
		}
		else {
			bn = b;
			sn = a;
		}
		System.out.println("합 : " + (a+b) + "\n차 : " + (a - b) + "\n곱 : " + (a*b) + "\n평균 : " + ((a+b)/2) + "\n큰 수 : " + bn + "\n작은 수 : " + sn);
		scan.close();
	}

}
