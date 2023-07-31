package day0731;

import java.util.Arrays;
import java.util.Scanner;

import day0728.Person;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 입력 > ");
		int count = sc.nextInt();
		
		Person[] list = new Person[count];
		String name;
		int height;
		
		for(int i =0; i<list.length; i++) {
			System.out.print(i+1 + "번째 이름 입력 > ");
			name = sc.next();
			System.out.print("키 입력 > ");
			height = sc.nextInt();
			
			list[i] = new Person(name, height);
		}
		
		for(Person p : list)
			System.out.println(p.toString());
		
		System.out.println(getMaximum(list));
		
		
		for(Person p : list) 
			System.out.println(p.toString());
			
		System.out.println(getMaximum2(list));
	}
	
	public static int getMaximum(Person[] array) {
		int Max = 0;
		
		for(Person p : array) {
			if(Max < p.height) {
				Max = p.height;
			}
		}
		return Max;
	}
	
	public static int getMaximum2(Person[] array) {
		Arrays.sort(array);
		return array[array.length-1].height;
	}

}
