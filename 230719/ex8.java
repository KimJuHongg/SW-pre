//n명의 점수를 입력받은 후, 평균 출력 -> 평균을 가로막대로 그래프 (*)출력
package day0719;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score;
		int sum = 0;
		int average = 0;
		int cnt = 0;
		
		System.out.print("학생 수 : ");
		int n = scan.nextInt();
		
		System.out.print("점수 입력 : ");
		for(int i = 0; i < n; i++) {
			
			score = scan.nextInt();
			sum += score;
			cnt += 1;
			
			if(n == cnt) 
				break;
			
		}
		average = sum / n;
		
		System.out.print("[*그래프]\t\t");
		for(int i = 0; i < average/10; i ++) {
			System.out.print("*");
		}
		
		scan.close();

	}

}
