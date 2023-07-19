//문자열을 입력받아 거꾸로 출력하시오.

package day0719;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = scan.nextLine();
		
		for(int i = str.length()-1; i >= 0; i--) {
			//char reverse_str = str.charAt(i);
			System.out.print(str.charAt(i));
		}
		
		scan.close();

		
		
	}

}
