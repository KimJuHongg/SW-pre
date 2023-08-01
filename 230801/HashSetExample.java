package day0801;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		//객체저장
		set.add("JAVA");
		set.add("JDBC");
		set.add("JSP");
		set.add("JAVA");	//중복 객체라 저장 x
		set.add("SPRING");
		
		//저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체 수: "+ size);
	}		

}
