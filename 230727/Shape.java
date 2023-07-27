//shape 추상클래스(getArea() 추상 메소드)를 만들고, 각 도형은 shape를 상속받아 넓이를 구한다
//크기가 3인 객체배열로 구성, 각 도형은 필요한 수치를 입력받아 넓이를 구한다. - 사각형(가,세), 원(반지름), 삼각형(밑변,높이)

package day0727;

public abstract class Shape {
	protected int a, b;
	
	public abstract double getArea();
}
