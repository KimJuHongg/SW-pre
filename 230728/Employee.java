//직원들의 급여를 계산하는 프로그램을 상속과 메소드 재정의를 이용하여 작성
//(arraylist의 크기는 5, 매개변수의 다형성을 이용해 작성)
/*
 직원들의 급여를 계산하는 프로그램을 추상 클래스 Employee 를 상속받고, 메소드 재정의를 이용하여 작성
(ArrayList 로 구현,   매개변수의 다형성을 이용하여 작성)

 **  사원 관리 **
1. 추가     2. 조회(id)   3. 삭제(id)    4. 전체사원출력   5. 종료    


Abstract Employee클래스
필드(private): 이름(name), 직원번호(id), 직급(position)
추상메소드 computeSalary()
toString() : 이름(직급, 직원번호) 의 형태로 출력

SalariedEmployee 클래스: Employee 클래스를 상속받는다.
필드(private): 월급(monthly)
computeSalary() : 1년치 연봉을 계산하여 반환
toString(): 사원의 정보 출력

HourlyEmployee 클래스: Employee 클래스를 상속받는다.
필드(private): 시급(rate), 근무시간(hours)
computeSalary(): 시급 * 근무시간으로 급여를 계산해서 반환
toString() : 사원 정보 출력
 */
package day0728;

public abstract class Employee {
	private String name;
	private String id;
	private String position;
	protected static final int MONTH = 12;
	
	public Employee(String name, String id, String position) {
		this.name = name;
		this.id = id;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	 abstract int computeSalary(Employee employee);
	
	
	@Override
	public String toString() {
		return name+"("+position+","+id+")";
	}
}
