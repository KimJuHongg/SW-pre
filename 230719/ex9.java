package day0719;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total_money = 0;
		
		
//		System.out.println("-------------------------------------------------------------------");
//		System.out.println("\t1.예금\t|\t2.출금\t|\t3.잔고\t|\t4.종료");
//		System.out.println("-------------------------------------------------------------------");
//		System.out.println();

		while(true) {
			System.out.println();
			System.out.println("-------------------------------------------------------------------");
			System.out.println("\t1.예금\t|\t2.출금\t|\t3.잔고\t|\t4.종료");
			System.out.println("-------------------------------------------------------------------");
		
			System.out.print("선택> ");
			int num = scan.nextInt();
			
			if(num == 1) {
				System.out.print("예금액> ");
				int deposit_money = scan.nextInt();
				total_money += deposit_money;
			} else if(num == 2) {
				System.out.print("출금액> ");
				int withdrawal_money = scan.nextInt();
				total_money -= withdrawal_money;
			} else if(num == 3) {
				System.out.print("잔고> "+total_money);
			} else if(num == 4)
				break;
		}
	}

}
