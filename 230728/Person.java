//Person은 Comparable 인터페이스를 구현하고 이 인터페이스를 이용해 이름순으로 출력

package day0728;

public class Person implements Comparable<Person> {
	public String name;
	public int height;
	
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

	
	@Override
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);
	}
	
	@Override
	public String toString() {
		return "이름 : " + name +", 키 : " + height;
	}
}
