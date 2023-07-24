package day0721;

import java.util.Scanner;

public class MovieTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
        System.out.print("영화 제목: " );
		String name = scan.nextLine();
		
        System.out.print("영화 발표 연도: " );
        int year = scan.nextInt();
        
        Movie movie = new Movie(name, year);

	
		movie.toString();
		
		
	}

}
