package day0724;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		List<Member> list = new ArrayList<>();
		
		
		while(run) {
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println("1.로그인 | 2.추가 | 3.삭제 | 4.조회 | 5.종료");
			System.out.println("--------------------------------------");		
			
			System.out.print("선택> ");
			int num = scan.nextInt();
			
			switch(num) {
			case 1: 
				
				System.out.print("ID를 입력하세요 : ");
				String write_id = scan.next();
				
				for(int i = 0; i < list.size(); i++) {
								
					if(list.get(i).getId().equals(write_id)) {
						
						System.out.print("로그인 성공");
						break;
					}else {
						System.out.print("로그인 실패");
						break;
					}
					
				}
				break;
				
				
			case 2:

				System.out.print("추가할 이름 입력 : ");
				String r_name = scan.next();
				System.out.print("추가할 id 입력 : ");
				String r_id = scan.next();
				System.out.print("추가할 password 입력 : ");
				String r_pw = scan.next();
				System.out.print("추가할 나이 입력 : ");
				int r_age = scan.nextInt();
			
				list.add(new Member(r_name, r_id, r_pw, r_age));
				break;
					
				
			case 3:
				System.out.print("삭제할 id 입력 : ");
				String d_id = scan.next();
				
				for(int i = 0; i <list.size(); i++) {
					Member m = list.get(i);
					if(d_id.equals(m.getId()) == true) {
						System.out.println(d_id + "가 아이디인 계정이 삭제");
						list.remove(i);
						break;
					}
					if(d_id.equals(m.getId()) == false) {
						System.out.println("다시 삭제해주세요.");
					}
				}
				break;
				
			case 4:
				for(int i =0; i<list.size(); i++) {
					Member m = list.get(i);
					list.get(i);
					System.out.println(m.getName() + "\t" + m.getId() + "\t" + m.getPw() + "\t" + m.getAge());
				}
				break;
				
			default:
				run = false;
				break;
			}
	}

}
}
