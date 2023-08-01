package day0801;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MemberExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		Set<Member> set = new HashSet<Member>();
		while(run) {
			System.out.println("** 회원 관리 프로그램 **");
			System.out.println("1.회원추가");
			System.out.println("2.회원삭제");
			System.out.println("3.전체 회원 출력");
			System.out.println("4.종료");
			System.out.print("선택하려는 메뉴의 번호를 입력하세요>>");
			int num = sc.nextInt();
			
			Iterator<Member> iterator = set.iterator();
			
			
			switch(num) {
			case 1:
				
				System.out.print("추가할 회원의 아이디는 : ");
				String id = sc.next();
				
				System.out.print("추가할 회원의 이름은 : ");
				String name = sc.next();
				if (set.size() == 0)
				{
					set.add(new Member(id, name));
					System.out.println("회원 추가 성공");
				}
				else {
					for(Member m : set) {	
						if(m.getId().equals(id)) {
							System.out.println("이미 존재하는 id입니다");
							
						} else {
							set.add(new Member(id, name));
							System.out.println("회원 추가 성공");
						}
						
					}
				}
				break;
				
			case 2:
				
				System.out.println("삭제하려는 회원의 아이디는 :");
				String delete_id = sc.next();
				
				while(iterator.hasNext()) {
					Member element = iterator.next();
					if(element.getId().equals(delete_id)) {
						iterator.remove();
						System.out.println(delete_id + "회원님의 아이디가 삭제되었습니다.");
						
					} else {
						System.out.println(delete_id+"가 존재하지 않니다.");
						System.out.println();
					}
				}
				
				break;
				
				
			case 3:
				for(Member m : set) {
					System.out.println(m.getName() + " 회원님의 아이디는 "+ m.getId() + " 입니다.");
					
				}
				System.out.println();
				break;
				
			case 4: 
				run = false;
				break;
			}
			
		}
	}
}
