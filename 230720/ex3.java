//2와 100사이에 있는 모든 소수를 찾는 프로그램을 작성
//주어진 정수 k를 2부터 k-1까지의 숫자로 나우어서 나머지가 0인 것이 하나라도 있으면 소수가 아니다

package day0720;

public class ex3 {

	public static void main(String[] args) {
		
		
		for(int i =2; i <= 100; i++) {
			int cnt = 0;
			
			for(int j = 2; j <= i; j++) {
				
				if(i % j == 0) {
					cnt++;		
				}		
			}
			
			if(cnt == 1) 
				System.out.print(i + " ");//소수 o
			
		}
		
	}

}
