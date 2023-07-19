//구구단 가로로 출력

package day0719;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {


		for(int i = 2; i <= 9; i++) 
			System.out.print(i+"단\t\t");
		
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 2; j <= 9; j++) {
				
				
				System.out.print(j + " * " + i + " = " + i*j +"\t");
				
				if(j == 9)
					System.out.println();
			}
		}
		

	}

}
