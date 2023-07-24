package day0724;

import java.util.Scanner;

public class MovieExample {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.print("영화 개수 입력 : ");
		num = scan.nextInt();
		Movie[] list = new Movie[num];
		
		for(int i = 0; i < list.length; i++) {
			System.out.print("영화제목 : ");
			String name = scan.next();
			
			System.out.print("영화감독 : ");
			String director = scan.next();
			
			list[i] = new Movie(name, director);
			
		}
		
		for(int i = 0; i < list.length; i++) {
			list[i].print();
		}
		
		System.out.println();
		
		for(Movie movie: list)
			System.out.print(movie);
		
		scan.close();

	}
}
