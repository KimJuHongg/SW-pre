//Person은 Comparable 인터페이스를 구현하고 이 인터페이스를 이용해 이름순으로 출력하고, 가장 키 큰 사람을 출력하는 메소드getMaximum(Person[] array)를 구현

package day0731;

public class Person implements Comparable<Person> {
	String name;
	int height;
	
	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	

	public void setHeight(int height) {
		this.height = height;
	}


	public void getMaximum(){
		
	}
	
	@Override
	public int compareTo(Person p) {
		return this.height- p.height;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name +", 키 : " + height;
	}
}
