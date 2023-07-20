//피보나치 수열

package day0720;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		
		final int[] arr = new int[100];
	
		for(int i = 2; i <=num; i++) {
			arr[0] = 0;
			arr[1] = 1;
			arr[i] = arr[i-1] + arr[i-2];
			
		}
		for (int i = 0; i <= num; i++) 
			System.out.print(arr[i] + " ");
		

	}

}
