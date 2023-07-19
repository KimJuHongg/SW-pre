package day0719;

import java.util.Scanner;
import java.math.*;

public class ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("개수 : ");
		int num = scan.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i < num; i++) {
			int num1 = (int)((Math.random()*num)+1);
			if(num1 % 3 != 0)
				sum += num1;
				System.out.print(" "+ num1+ " ");
		}
		System.out.println();
		System.out.print("3이 배수를 제외한 난수들의 합 : " + sum);
		
		scan.close();

	}

}
