//Scanner클래스를 이용해 키보드에서 영문자한자를 입력받아 소문자 <-> 대문자로 변환해 출력하는 프로그램 작성
package day0719;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = scan.nextLine();
		
		for(int i = 0; i <= str.length()-1; i++) {
			char ctr = str.charAt(i);
			if ( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				
				ctr = (char)(ctr-32);
				System.out.print(ctr);
				
			} 
			else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
			
				ctr = (char)(ctr+32);
				System.out.print(ctr);

			}
			else //영문자가 아닌경우
				System.out.println("%");
			
			
		}
		
		scan.close();

		
		
	}

}
