//배열을 메소드의 매개변수로 전달해 코딩

//main()에서 배열의 크기를 입력받아 배열 생성 후, 배열에 점수를 저장하는 메소드 getValue()와 평균을 구하는 getAverage(),
//배열의 요소를 출력하는 printArray()을 작성
package day0720;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
		}
		
		String strarr= args[0];
		int num = Integer.parseInt(strarr);
		int[] arr = new int[num];
		int score;
		
		getValue(arr, num);
		getAverage(arr, num);
		System.out.println(arr + ", " );

	}

	 // 배열에 점수를 입력받는 메소드
    public static void getValue(int[] arr, int num) {
        Scanner scan = new Scanner(System.in);
        System.out.println(num + "개의 점수를 입력하세요:");
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }
    }
    
    public static void getAverage(int[] arr, int num) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int size = scan.nextInt();
        for (int i = 0; i < size; i++) {
            sum += i;
        }
        
        System.out.println("평균 : " + sum /size);
    }
    
    public static void printArray(int arr, int num) {
    	for (int i = 0; i < num; i++)
    		System.out.print(arr + " ");
    }
    
}
