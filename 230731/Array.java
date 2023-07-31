package day0731;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("[array] 숫자 입력 : ");
	String a_num = sc.next();
	
	String[] array = a_num.split("");
	System.out.print("[commands] 숫자 입력 : ");
	
	String c_num = sc.next();
	String[] commands = c_num.split("");
	
	int[] sum = new int[10];
	for(int i =0; i < array.length; i++) {
		
		System.out.print(array[i] );
		
	}
	System.out.println();
	for(int j=Integer.parseInt(commands[0]); j <= Integer.parseInt(commands[1]); j++) {
		for(int i =0; i < array[j-1].length(); i++) {
			System.out.print(array[j-1]);
			sum[i] = Integer.parseInt(array[j-2]);
		}
	}
	
	Arrays.sort(sum);
	System.out.println();
	for(int i =0; i < sum.length; i++) {
		System.out.print(sum[i]);
	}
	
	
	
	
	
	
	
	}
}
