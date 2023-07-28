package day0727;

public class SealedExample {

	public static void main(String[] args) {

		Person p = new Person();
		Employee1 e = new Employee1();
		Manager m = new Manager();
		Director d = new Director();
		
		p.work();
		e.work();
		m.work();
		d.work();
	}

}
