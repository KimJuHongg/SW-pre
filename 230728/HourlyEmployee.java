package day0728;

public class HourlyEmployee extends Employee {
	private int rate;
	private int hours;
	private int salary;
	
	public HourlyEmployee(String name, String id, String position, int rate, int hours) {
		super(name, id, position);
		this.rate = rate;
		this.hours = hours;
	}
	
	
	public int getRate() {
		return rate;
	}


	public void setRate(int rate) {
		this.rate = rate;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	@Override
	int computeSalary(Employee employee) {
		salary = rate * hours * MONTH;
		return salary;
	}
	
	@Override
	public String toString() {
		return super.toString() + " 연봉 : " + salary;
	}
	
}
