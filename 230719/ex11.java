//369게임 프로그램 작성

package day0719;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력 : ");
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			if(i % 3 == 0) {
				System.out.print("짝 ");
			} else
				System.out.print("" + i + " ");
			
			
		}
		
	}

}
