//문자열을 StringTokenizer 클래스를 이용해 입력받은 문장에서 각 단어를 분리해 출력하고 단어의 개수 출력
//엔터키까지 한 줄 입력 , 입력된 문자열에서 hasMoreTokens()로 토큰 남아있는지 판별, nextToken()으로 토큰을 하나씩 가져와 출력

package day0731;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		System.out.print("문자열 입력 > ");
//		String str = sc.next();
//		
//		String[] arr = str.split("");
//		
//		for(String token : arr) 
//		{
//			System.out.println(token);
//		}
//		System.out.println();
		//----------------------------------------
		System.out.print("문자열 입력 > ");
		String str = sc.nextLine();
		int count = 0;
		StringTokenizer st = new StringTokenizer(str, " ");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			count++;
			
		} 
		System.out.println(count);
		
		
		//--------------------------------
		System.out.print("문자열 입력 > ");
		String str_1 = sc.nextLine();
		StringTokenizer str1 = new StringTokenizer(str_1, " ");
		System.out.println("단어의 갯수 : "+ str1.countTokens());
	}
}
