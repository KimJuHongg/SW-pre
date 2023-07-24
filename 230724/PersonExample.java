package day0724;

import java.util.ArrayList;
import java.util.List;

public class PersonExample {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		
		list.add(new Person("홍길동", "01012345678"));
		list.add(new Person("김유신", "01045678912"));
		list.add(new Person("최자영", "01001234567"));
		list.add(new Person("김영희", "01087654321"));
		
		for(int i = 0; i<list.size(); i++) {
			Person p = list.get(i);
			System.out.println("(" + p.getName() + "," + p.getTel()+")");
		}
		
		System.out.println();
		
		//toString 사용
		for(Person p : list) {
			System.out.println(p);
		}
	}

}
