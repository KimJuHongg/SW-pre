package day0727;

import java.util.Scanner;

public class ShapeExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Shape[] shapeArray = new Shape[3];
		int width, height, base, radius;
		
		System.out.print("사각형의 가로 입력 >");
		width = scan.nextInt();
		
		System.out.print("사각형의 세로 입력 >");
		height = scan.nextInt();
		shapeArray[0] = new Rectangle(width, height);
		
		
		System.out.print("삼각형의 가로 입력 >");
		base = scan.nextInt();
		
		System.out.print("삼각형의 세로 입력 >");
		height = scan.nextInt();
		shapeArray[1] = new Triangle(base, height);
		
		System.out.print("원의 반지름 입력 >");
		radius = scan.nextInt();
		
		shapeArray[2] = new Circle(radius);
		
		for(Shape shape : shapeArray) 
			System.out.printf("\n%.1f", shape.getArea());
		
		scan.close();
	}

}
