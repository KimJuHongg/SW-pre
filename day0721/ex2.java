//삼각형의 꼭대기에서 바닥까지 이어지는 경로 중, 거쳐간 숫자의 합이 가장 큰경우를 찾아보려고 함 아래칸으로 이동할 때 대각선 방향으로 한칸 오른쪽또는 왼쪽으로만 이동 가능
//삼각형의 정보가 담긴 배열 triangle이 매개변수로 주어질 때, 거쳐간 숫자의 최댓값을 return, 답 30
//반대로 생각해서 풀기

package day0721;

import java.util.Arrays;

public class ex2 {

	public static void main(String[] args) {
		int[][] arr = {	{7}, 
						{3,8}, 
						{8,1,0}, 
						{2,7,4,4}, 
						{4,5,2,6,5} };
		
		int[][] copyarr = Arrays.copyOf(arr,  arr.length);
		
	
		for(int i = arr.length-1; i >= 1; i--) {
			for(int j = 0; j <arr[i].length-1; j++) {
				copyarr[i-1][j] += (copyarr[i][j] > copyarr[i][j+1]) ? copyarr[i][j] : copyarr[i][j+1];
			}
		}   
		
		System.out.println("최댓값 : " + copyarr[0][0]);
		
		
		
		
	}

}
