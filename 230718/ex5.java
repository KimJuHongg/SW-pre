//영수증에는 10% 부가세와 잔돈이 인쇄되어 있다. 구입한 상품의 가격과 받은 금액을 입력하면 부가세와 잔돈을 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class text5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구입한 상품의 가격 : ");
		int price = scan.nextInt();
		
		
		System.out.print("받은 금액 : ");
		int money = scan.nextInt();
		
		System.out.print("부가세 : " + (price/10) + "\n잔돈 : "+ (money-price));
		
				
	}
}
