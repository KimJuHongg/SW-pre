package day0718;

public class ex8 {

	public static void main(String[] args) {
		System.out.println("1-100의 범위에서 세 수를 랜덤으로 발생시켜 젤 큰수 찾기");
		int num1 = 0;
		int num2 = 0;
		for(int i =0; i<3; i++) {
			
			num1 = (int)((Math.random()*100)+1);
			
			System.out.println((i+1) + "번째 숫자 : " + num1);
			
			if(num1 > num2) 
				num2 = num1;
			
		}
		
		System.out.println("3개의 숫자 중 가장 큰 수 : "+ num2);
	}

}
