package telephone;

import java.util.Scanner;
import java.util.TreeMap;

public class StudentService {
	private TreeMap<String, String> phoneBook;
	
	public StudentService() {
		phoneBook = new TreeMap<>();
	}
	
	public void addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 > ");
		String name = sc.nextLine();
		System.out.print("전화번호 입력 > ");
		String tel = sc.nextLine();
		
		phoneBook.put(name,  tel);
		System.out.println("전화번호 추가 성공");
	}
	
	public void findStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 이름 입력 > ");
		String name = sc.nextLine();
		
		String tel = phoneBook.get(name);
		if(tel != null)
			System.out.println("전화번호 : "+ tel);
		else
			System.out.println("해당하는 이름의 전화번호가 없습니다");
		
	}
	
	public void removeStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 이름 입력 > ");
		String name = sc.nextLine();
		
		String tel = phoneBook.remove(name);
		if(tel != null)
			System.out.println("전화번호가 삭제되었습니다");
		else
			System.out.println("해당하는 이름의 전화번호가 없습니다");
	}
	
	public void printAll() {
		System.out.println("전체 전화번호 목록");
		for(String name : phoneBook.keySet()) {
			String tel = phoneBook.get(name);
			System.out.println("[이름] "+ name + "\t[전화번호] " +tel);
		}
	}
}
