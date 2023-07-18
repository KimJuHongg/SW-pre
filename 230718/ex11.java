//입력한 단어의 첫글자가 대문자, 소문자인지를 판별(charAt())

package day0718;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어를 입력하시오 : ");
		
		char word = scan.nextLine().charAt(0);
		
		if(word <= 'Z' & word >= 'A') {
			System.out.println("대문자입니다");
		}
		else if(word >= 'a' & word <= 'z'){
			System.out.println("소문자입니다");
		}
		
		scan.close();
	}

}
