package day0728;

import java.util.Arrays;
import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생수 입력 > ");
		int count = sc.nextInt();
		Person[] list = new Person[count];
		String name;
		int height;
		
		for(int i = 0; i < list.length; i++) {
			System.out.print(i+1 + "번째 이름 입력 > ");
			name = sc.next();
			System.out.print("키 입력 > ");
			height = sc.nextInt();
			
			list[i] = new Person(name, height);
		}
		Arrays.sort(list);
		
		System.out.println("<가나다순 정렬>");
		System.out.println(Arrays.toString(list));
	}

}
