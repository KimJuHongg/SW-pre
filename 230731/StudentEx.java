//12장 연습문제5번

package day0731;

public class StudentEx {
	private String studentNum;
	
	public StudentEx(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	
	//코드 삽입
	@Override
	public int hashCode() {
		int hashCode = studentNum.hashCode();
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof StudentEx target) {
			if(studentNum.equals(target.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
}
