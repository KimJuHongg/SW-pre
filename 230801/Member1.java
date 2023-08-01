package day0801;

public class Member1 {
	public String name;
	public int age;
	
	public Member1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//hashCode 재정의
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member1 target) {
			return target.name.equals(name) && (target.age == age);
		}
		else {
			return false;
		}
	}
}
