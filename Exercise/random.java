//random을 이용한 로또 번호 뽑기 -> 0.0 <= number < 1.0
//1~10난수
//주사위
package example;

import java.math.*;

public class random {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			System.out.println((i+1)+"번째 로또 번호 : "+ num);
		}
		
		System.out.println();
		System.out.println();

		
		int num1 = (int)((Math.random()*10)+1);
		System.out.println("1~10 난수 뽑기 : "+ num1);

		System.out.println();
		System.out.println();

		int num2 = (int)((Math.random()*6)+1);
		System.out.println("주사위 1~6 난수 뽑기 : " + num2);
		
	}

}
