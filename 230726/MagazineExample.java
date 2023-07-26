package day0726;

import java.util.Scanner;

public class MagazineExample {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("잡지 이름은? ");
		String title = scan.nextLine();
		
		System.out.println("페이지수는? ");
		 int pages = Integer.parseInt(scan.nextLine());
		
		System.out.print("저자는? ");
		String writer = scan.nextLine();
		
		System.out.println("발매일은? ");
		String date = scan.nextLine();
		
		Magazine magazine = new Magazine(title, pages, writer, date);
		magazine.printInfo();
		
		scan.close();
		
	}
}
