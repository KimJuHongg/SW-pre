//삼각형 별찍기

package day0719;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {	//가로줄 개수
			for(int j = num-1; j > i; j--)	{	//빈칸 수
					System.out.print(" ");
			
			}
			
			for (int z = 0; z < 2*i+1; z++) {	//별 개수
				System.out.print("*");	
			}
		
		System.out.println();	
		}

		scan.close();

	}
	
}
