//단어 하나 입력해 모음, 자음 개수 세기

package day0718;

import java.util.Scanner;

/*public class ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어를 입력하시오 : ");
		String word = scan.nextLine();
		
		
		int consonants_num = 0;
		int vowels_num = 0;
		
		
		  for(int i = 0; i < word.length(); i++) { 
			  if(word.charAt(i) == 'a' || word.charAt(i) == 'u' || word.charAt(i) == 'i' || word.charAt(i) == 'e' || word.charAt(i) == 'o') {
		  
				  vowels_num += 1; 
			  
			  } else {
		  
				  consonants_num += 1; 
				  }
		  }
	
		System.out.println("모음개수 : " + vowels_num + ", 자음 개수 : " + consonants_num);
		scan.close();
	}

}*/

public class ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어를 입력하시오 : ");
		String str = scan.nextLine();
		
		int cntA = 0;
		int cntB = 0;
		for(int i =0; i< str.length(); i++) {
			switch(str.charAt(i)) {
			case 'a','e','o','u','i', 'A', 'E', 'O', 'U', 'I' -> cntA++;
			default -> cntB++;
			}
		}
		System.out.println("모음개수 : " + cntA + ", 자음 개수 : " + cntB);
		scan.close();
		
		
	}

}
