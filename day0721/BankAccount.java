package day0721;

public class BankAccount {

	int accountNumber;	//계좌번호
	String name = null;		//예금주
	int balance = 0;		//잔액

	//생성자
	public BankAccount(int accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;	        
        this.name = name;
        this.balance = balance;
	}

	
	void register(int accountNumber, String name) {
		System.out.println("계좌번호> " + accountNumber + "\t예금주> " + name);
	}
	//입금
	void deposit(String name, int deposit_money) {
		balance += deposit_money;
		System.out.println(name + "에게 " + deposit_money + "원을 입금했습니다. ");

	}
	
	//출금
	void withdraw(String name, int withdraw_money) {
		if(balance - withdraw_money < 0) {
			System.out.println("잔액이 부족합니다 ");
		}
		else {
			balance -= withdraw_money;
			System.out.println(withdraw_money + "원을 출금했습니다. ");
		}
	}
	
	//출력
	void print(int balance2) {
		System.out.print("현재 잔액은 " + balance + "원 입니다.");
	}

	
}
