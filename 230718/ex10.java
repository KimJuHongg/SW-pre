package day0718;

import java.math.*;

public class ex10 {

	public static void main(String[] args) {

		int num1;
		for(int i = 0; i<=2; i++) {
			
			num1 = (int)((Math.random()*2));
			
			if(num1 == 1) {
				System.out.print("앞");
			} else if(num1 == 0) {
				System.out.print("뒤");
			}
				
		}
	}

}
