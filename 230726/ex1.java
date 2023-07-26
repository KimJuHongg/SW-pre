/*
 * 암호만들기
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸어 암호화하려고 함
 * ex) AB 1칸 밀면 BC, 3만큼 밀면 DE
 * z는 1만큼 밀면 a, Z는 1만큼 밀면 A
 * 
 * 문자열 s와 거리n을 입력받아 s를 n만큼 민 암호문을 출력하도록 코딩을하시오
 * 
 */
package day0726;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		StringBuilder result = new StringBuilder();
		System.out.print("문자열 입력 > ");
		String s = scan.next();
		sb.append(s);
		
		System.out.print("숫자 입력 >");
		int n = scan.nextInt();
		
		for(int i =0; i<sb.length(); i++) {
			if(Character.isLowerCase(sb.charAt(i)))
				result.append((char) (sb.charAt(i) + n % ('z' + 1)));
			else
				result.append(sb.charAt(i));
		}
		
		System.out.println(result.toString());
	}

}
