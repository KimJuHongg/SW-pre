//학생(Student)의  이름(name)과 전화번호(tel)를  입력받아 TreeMap을 이용하여 전화번호 리스트를 구현하는 프로그램을 작성하시오.

//** 전화번호 관리 프로그램 **

//1. 추가    2.조회    3.삭제    4.전체 출력   5.종료

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
