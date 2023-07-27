package day0727;

public class Rectangle extends Shape {
	
	private int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width*height;
	}

	
}
