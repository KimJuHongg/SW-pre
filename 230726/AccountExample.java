package day0726;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean check = false;
		boolean run = true;
		int money = 0;
		int sum = 0;
		List<Account> list = new ArrayList<>();
		
		while(run) {
			System.out.println("=========================================");
			System.out.println(" \t **계좌 관리 프로그램**");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.이체|6.종료");
			System.out.println("=========================================");
			
			System.out.print("선택>");
			int num = scan.nextInt();
			
			switch(num) {
			case 1:
			
				System.out.print("이름 입력 > ");
				String name = scan.next();
				
				int account = (int)((Math.random()*900)+100);
				
				System.out.println("계좌번호 : " + account + ", 이름 : "+ name);
				System.out.println("[" + account + "-"+ name + "]");
				
				list.add(new Account(Integer.toString(account), name, money));
				break;
			
			case 2:
				for(Account p: list)
					System.out.println(p);
				break;
				
			case 3:
				System.out.print("입금할 계좌번호 입력 > ");
				int account_deposit = scan.nextInt();
				
				System.out.print("입금할 금액 입력 > ");
				int money_deposit = scan.nextInt();
				
				  
				for(int i = 0; i< list.size(); i++) {
					Account a = list.get(i);
					if(a.getAccount().equals(Integer.toString(account_deposit)) == true) {
	        			 check = true;
	        			 a.money += money_deposit;
	        				 break;
	        		 }
				
					else {
	        			check = false;
	        			System.out.print("올바르지 않은 계좌번호입니다.");
	        			break;
	        		}
				}
				
	        	 if(check) {
	        		 
	        		 System.out.print("입금 성공!");
	        		 System.out.println();
	        	 }
	        	 else {
	        		 System.out.print("에러");
	        		 System.out.println();
	        	 }
	        	 break;
			      
			case 4:
				System.out.print("출금할 계좌번호 입력 > ");
				int account_withdraw = scan.nextInt();
				
				System.out.print("출금할 금액 입력 > ");
				int money_withdraw = scan.nextInt();
	        	 
				for(int i = 0; i< list.size(); i++) {
					Account a = list.get(i);
		        		if(a.getAccount().equals(Integer.toString(account_withdraw)) == true) {
		        			 check = true;
		        			 
		        			 
		        			 if(a.money - money_withdraw < 0) {
		        				 System.out.println("잔액이 부족합니다.");
		        				 check = false;
		        				 break;
		        			 }
		        			 else {
		        				 a.money -= money_withdraw;
		        				 check = true;
		        			 }
		        				 
		        		 }
		        		else {
		        			check = false;
		        			System.out.print("올바르지 않은 계좌번호입니다.");
		        			break;
		        		}
					}
				
	        	 if(check) {
	        		 
	        		 System.out.print("출금 성공!");
	        		 System.out.println();
	        	 }
	        	 else {
	        		 System.out.print("에러");
	        		 System.out.println();
	        	 }
	        	 break;
				
				
			case 5:
				

				System.out.print("자신의 계좌번호 입력 > ");
				int send_account = scan.nextInt();
				
				for(int i = 0; i< list.size(); i++) {
					Account a = list.get(i);
		        		if(a.getAccount().equals(Integer.toString(send_account)) == true) {
		        			 check = true;
		        			 
		        			 System.out.print("이체할 계좌번호 입력 > ");
		     				int account_transfer = scan.nextInt();
		     				
		     				for(int j = 0; j <list.size(); j++) {
     							Account c = list.get(j);
     							
  			     				if(c.getAccount().equals(Integer.toString(account_transfer)) == true) {
			     					check = true;
			     					System.out.print("입금할 금액 입력 > ");
			     					int money_transfer = scan.nextInt();
			     					
			     					if(a.money - money_transfer < 0) {
			     		   				 System.out.println("잔액이 부족합니다.");
			     		   				 check = false;
			     		   				 break;
			     		   			 }
			     		   			 else {
			     		   				 a.money -= money_transfer;
			     		   				 c.money += money_transfer;
			     		   				 check = true;
			     		   				 break;
			     		   			 }
			     				}
			     				else {
				        			check = false;
				        			System.out.println("올바르지 않은 계좌번호입니다.");
				        			break;
				        		}
		     				}
			        	}
		        		else {
		        			check = false;
		        			System.out.println("올바르지 않은 계좌번호입니다.");
		        			
		        		}
					}
				break;
				
			case 6:
				run = false;
				break;
	        	 
			}
		}
	}

}
