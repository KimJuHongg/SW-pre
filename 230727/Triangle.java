package day0727;

public class Triangle extends Shape {
	
	private int base, height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return base*height*0.5;
	}
}
