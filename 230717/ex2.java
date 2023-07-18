//２．　마일을　킬로미터로　변환하는　프로그램을　작성하시오．입력을　받아서　변환함．　ｎｅｘｔＤｏｕｂｌｅ（）　이용
package day0717;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("마일 입력 : ");
		Double a = scan.nextDouble();
		double b = a * 1.60934;
		
		System.out.println(b);
		scan.close();
		
	}

}
