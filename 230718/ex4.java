//사용자가 번개로부터 얼마나 떨어져 있는지를 계산하는 프로그램을 작성한다. 소리는 공기를 통해 초당 약 340m를 이동한다. 빛은 초당 300,000km를 이동한다. 
//번개를 본 시간과 소리가 도달하는 시간 사이의 간격을 알면 번개까지의 거리를 계산할 수 있다. 시간간격은 입력받는다.
package day0718;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시간 간격을 입력하시오(단위: 초):");
		int sec = scan.nextInt();
		
		int air = sec * 340;
		
		System.out.println("번개가 발생한 곳까지의 거리:"+ air );
		
	}
}
