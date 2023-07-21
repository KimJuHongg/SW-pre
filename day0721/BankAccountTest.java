package day0721;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int accountNumber = 0;
		String name = null;
		int balance = 0;
		int balance2 = 0;
		boolean run = true;
		BankAccount bankaccount = new BankAccount(accountNumber, name, balance);
		

		while(run) {
			
			System.out.println();
			System.out.println("----------------------------------------------------------------------");
			System.out.println("\t1.계좌등록\t|\t2.예금\t|\t3.출금\t|\t4.잔고\t|\t5.종료");
			System.out.println("----------------------------------------------------------------------");
		
			System.out.print("선택> ");
			int num = scan.nextInt();
			
			switch(num) {
			
			case 1: 
				System.out.print("계좌번호와 예금주명를 입력하세요:");
				accountNumber = scan.nextInt();
				scan.nextLine();
				name = scan.nextLine();
				bankaccount.register(accountNumber, name);
				break;
			
			case 2:
				System.out.print("입금액을 입력하세요:");
				int deposit_money = scan.nextInt();
				bankaccount.deposit(name,deposit_money);
				break;
			
			case 3:
				System.out.print("출금액을 입력하세요:");
		        int withdraw_money = scan.nextInt();
		        bankaccount.withdraw(name,withdraw_money);
		        break;
				
			case 4:
				bankaccount.print(balance2);
				break;
				
			default:
				run = false;
				break;
			}
		}
		
		
	}

}
