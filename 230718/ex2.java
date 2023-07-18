//단어 하나 입력해 모음, 자음 개수 세기

package day0718;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어를 입력하시오 : ");
		String word = scan.nextLine();
		
		
		int consonants_num = 0;
		int vowels_num = 0;
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'a' || word.charAt(i) == 'u' || word.charAt(i) == 'i' || word.charAt(i) == 'e' || word.charAt(i) == 'o' ||word.charAt(i) == 'A' || word.charAt(i) == 'U' || word.charAt(i) == 'I' || word.charAt(i) == 'E' || word.charAt(i) == 'O') {
				
				vowels_num += 1;
			}
			else { 
				
				consonants_num += 1;
			}
		
		}
		
		System.out.println("모음개수 : " + vowels_num + ", 자음 개수 : " + consonants_num);
		scan.close();
	}

}
