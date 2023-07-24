package exercise;

public class RectArrayTest {

	public static void main(String[] args) {

		Rect[] list; //1 : 참조 변수 선언
		
		list = new Rect[5];	//2 : 참조값 저장할 공간 생성
		
		for(int i=0; i<list.length; i++)	//3 : 배열 객체 생성
			list[i] = new Rect(i, i);
		
		for(int i = 0 ; i<list.length; i++) 
			System.out.println(i + "번째 사각형의 면적="+list[i].calcArea());
	}

}
