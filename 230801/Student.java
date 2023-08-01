package telephone;

public class Student {
	private String name;
	private String tel;
	
	public Student(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "전화번호 : " + tel;
	}
}
