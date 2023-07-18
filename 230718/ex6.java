//10이하의 숫자로 정수를 2진수로 변환하는 프로그램을 작성하시오.

package day0718;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("10이하의 정수를 입력하시오 : ");
		int num = scan.nextInt();
		
		String bin_num ="";
		
		while(num > 0) {
			int i = num % 2;
			
			if(i ==0) 
				bin_num += "0";
			else
				bin_num += "1";
			
			num /=2;
		}
		
		System.out.println("2진수:" + bin_num);
		scan.close();
	}

}
