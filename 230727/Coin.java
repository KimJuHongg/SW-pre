package day0727;

public class Coin {

	public static void main(String[] args) {
		int a, b, c, d;
		int m = 4620;
		
		a = m/1000;
		b = m%1000/500;
		c = m%500/100;
		d = m%100/10;
		
		System.out.println(a);	//1000원 지폐의 개수 출력(4)
		System.out.println(b);	//500원 동전의 개수 출력(1)
		System.out.println(c);	//100원 동전의 개수 출력(1)
		System.out.println(d);	//10원 동전의 개수 출력(2)

	}

}
