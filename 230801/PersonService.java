package 230801;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;



public class PersonService {
	Scanner sc = new Scanner(System.in);
	
	TreeSet<Person> persons = new TreeSet<>();
	Iterator<Person> iterator = persons.iterator();
	String name;
	int age;
	
	//회원 정보 추가
	public void insertPerson() {
		System.out.println("회원가입 정보 >>");
		System.out.println("추가할 회원의 이름 >");
		name = sc.nextLine();
		System.out.println("추가할 회원의 나이 >");
		age = sc.nextInt();
		sc.nextLine();
		
		Person newPerson = searchPersonInfo(name);
		if(newPerson != null) {
			System.out.println("이미 가입된 회원");
			return;
		}
		
		newPerson = new Person(name, age);
		persons.add(newPerson);
		System.out.println("신규가입 회원 정보");
		System.out.println(newPerson);
		
	}
	
	//회원 정보 삭제
	public void deletePerson() {
		System.out.println("회원정보 탈퇴 >>");
		System.out.print("탈퇴하려는 회원 이름 >" );
		name = sc.nextLine();
		System.out.print("탈퇴하려는 회원 나이 > ");
		age = sc.nextInt();
		sc.nextLine();
		
		Person person = searchPersonInfo(name, age);
		if(person == null) {
			System.out.println(name +":" + age + "회원이 존재하지 않습니다.");
			return;
		}
		System.out.println("삭제완료\n삭제한회원 정보 >>");
		System.out.println(person);
		persons.remove(person);
		
	}
	
	//전체 회원 정보 조회
	public void printPersonSet() {
		if(persons.isEmpty()) {
			System.out.println("회원 정보가 존재하지 않습니다");
			return;
		}
		
		System.out.println("전체 회원정보 조회 >>");
		iterator = persons.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person);
		}
	}
	
	//이름으로 특정 회원 정보 조회
	public void searchPersonByName() {
		System.out.println("이름으로 회원정보 조회 >>");
		System.out.print("조회하려는 회원 이름 입력 >> ");
		name = sc.nextLine();
		
		Person person = searchPersonInfo(name);
		if(person == null) {
			System.out.println("조회할 회원정보 존재X");
			return;
		}
		System.out.println("이름으로 조회한 회원 정보");
		System.out.println(person);
	}
	
	//이름으로 회원 존재 여부 판단
	public Person searchPersonInfo(String name) {
		if(persons.isEmpty()) {
			return null;
		}
		iterator = persons.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			if(person.getName().equals(name))
				return person;
		}
		return null;
	
	}
	//이름,나이로 회원 존재 여부 판단
	public Person searchPersonInfo(String name, int age) {
		if(persons.isEmpty()) 
			return null;
		iterator = persons.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			if(person.getName().equals(name) && person.getAge() == age)
				return person;
		}
		return null;
	}
	
}
