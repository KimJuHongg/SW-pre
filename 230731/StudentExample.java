package day0731;

import java.util.HashSet;

public class StudentExample {

	public static void main(String[] args) {

		//Student를저장하는 HashSet 생성
		HashSet<StudentEx> hashSet = new HashSet<StudentEx>();
		
		//Student저장
		hashSet.add(new StudentEx("1"));
		hashSet.add(new StudentEx("1"));
		hashSet.add(new StudentEx("2"));
		
		//저장된 Student 수 출력
		System.out.println("저장된 Student 수 : " + hashSet.size());
	}

}
