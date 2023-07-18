package day0718;

public class ex9 {

	public static void main(String[] args) {

		int random_num1;
		int random_num2;
		int num = 0;
		
		while(true) {
			random_num1 = (int)((Math.random()*2));
			random_num2 = (int)((Math.random()*2));
			num += 1; 
			
			System.out.println("동전 2개를 던져서 둘다 나온 면 : " + random_num1 + random_num2);
			
			if( random_num1 == 1 && random_num2 == 1) 
				break;
			
		}
		System.out.println("동전 2개를 던져서 둘다 앞면이 나올때까지 던진 횟수 : " + num);
	}

}
