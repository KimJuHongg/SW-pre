//1차 방정식 3x+10y=100을 만족하는 모든해를 구하는 프로그램을 작성
//-x,y는 정수이고 0<=x,y<=10라고 가정
//(0,10) (10,7)

package day0720;

public class ex2 {

	public static void main(String[] args) {
		
		
		for(int i = 0; i <= 10; i++ ) {
			for(int j = 0; j <= 10; j++ ) {
				
				if( 3 * i + 10 * j == 100)
					System.out.println("방정식의 해( " + i + "," + j + ")");
		
			}
		}
	}
}
