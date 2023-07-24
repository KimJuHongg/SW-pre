//System.arraycopy(Object src, int scPos, Object dest, int destPos, int length); 사용
//Arrays.copyOf(int[] original, int newLength); 사용
//arraycopy() 와 copyOf() 를 이용하여 배열arrA 에서 배열arrB 로 복사하여 내용을 출력하여 확인
package day0721;

import java.util.Arrays;

public class ex1 {

	public static void main(String[] args) {

		String[] oldStrArray= {"java", "array", "copy" };
		
		String[] newStrArray = new String[5];
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i =0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}
		
		System.out.println();
		
		String[] arr2 = Arrays.copyOf(oldStrArray, oldStrArray.length);
		
		for(int i =0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ",");
		}
	}

}
