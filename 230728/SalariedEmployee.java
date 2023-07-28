package day0728;

public class SalariedEmployee extends Employee {
	private int monthly;
	private int salary;
	
	public SalariedEmployee(String name, String id, String position, int monthly)
	{
		super(name, id, position);
		this.monthly = monthly;
	}
	
	public int getMonthly() {
		return monthly;
	}

	public void setMonthly(int monthly) {
		this.monthly = monthly;
	}

	@Override
	int computeSalary(Employee employee) {
		salary = this.monthly * MONTH;
		return salary;
	}
	
	@Override
	public String toString() {
		return super.toString() + " 연봉 : " + salary;
	}
}
