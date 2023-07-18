//주민번호를 입력받아 남자,여자인지 출력하시오 ex)991122-1234567
//뒷자리 첫번째 수가 1,3이면 남자, 2,4면 여자
//while, switch사용, 다음과 같이 입력하면 반복을 끝냄.
//ex)입력을 계속하시겠습니까?(YES/NO)

package day0718;

import java.util.Scanner;

public class SSN {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("주민번호 입력 : ");
			char str = scan.nextLine().charAt(7);
			
			switch(str) {
				
				case '1','3' -> {
					System.out.println("남자입니다.");
					break;
				}
				
				case '2','4' -> {
					System.out.println("여자입니다.");
					break;
				}
				
				default ->{
					System.out.println("잘못된 주민번호입니다.");
				}
				
			}
			
			System.out.print("입력을 계속하시겠습니까(Y/N) : ");
			char yesno = scan.nextLine().charAt(0);
			System.out.println();
			
			if(yesno == 'y' || yesno == 'Y')
				continue;
			else
				break;
			
		}
	}
}
