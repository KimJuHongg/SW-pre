//5장 연습문제 9번

package day0720;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int num = 0;
		int score;
		int scores[] = null;
		boolean run = true;
		
		
		while(run) {
			
			System.out.println("-----------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			int grade = scan.nextInt();
			
			
			switch(grade) {
				
				case 1:
					System.out.print("학생수> ");
					num = scan.nextInt();
					scores = new int[num];
					break;
					
				case 2:
					for(int i = 0; i < num; i++) {
						System.out.print("scores[" + i + "] : ");
						scores[i] = scan.nextInt();
					}
					break;
				case 3:
					for(int i = 0; i < num; i++) {
						System.out.println("scores[" + i + "] : " + scores[i]);
					}
					break;
					
				case 4:
					int highscore= 0;
					int sum = 0;
					for(int i = 0; i < num; i++) {
						sum += scores[i];
						if(scores[i] > highscore) {
							highscore = scores[i];
						}
					}
					
					System.out.print("최고 점수: " + highscore);
					System.out.println("평균 점수: " + (double)sum/num);
					break;
					
				default :
					run = false;
					break;
			}
			
		}
	}

}
