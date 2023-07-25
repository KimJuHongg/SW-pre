//객체 배열
package day0725;

import java.util.Scanner;

import day0724.Movie;

public class MemberExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
			
		int count = 0;
		int num = 10;
		Member[] members = new Member[num];	
		
		

	      while (run)
	      {
	    	  System.out.println("=====================================");
	         System.out.println("\t** 회원 관리 프로그램 **");
	         System.out.println("1.로그인  2.추가  3.삭제  4.조회  5.종료");
	    	  System.out.println("=====================================");


	         System.out.print("선택> ");
	         int input = scan.nextInt();
        	 boolean check = false;

	         
	 		 
	         switch(input) {
	         case 1: 
	        	 System.out.print("로그인할 아이디 입력 : ");
	        	 String login_id = scan.next();
	        	 for(int i = 0; i< members.length; i++) {
	        		 if(members[i].getId().equals(login_id)) {
	        			 check = true;
	        			 break;
	        		 }
	        	 }
	        	 if(check) {
	        		 System.out.print("로그인 성공");
	        		 System.out.println();
	        	 }
	        	 else {
	        		 System.out.print("로그인 실패");
	        		 System.out.println();
	        	 }
	        	 break;
	        	 
	         case 2:
	        	 if (count == num) {
                     num *= 2; // Double the array capacity if it's full
                     members = resizeArray(members, num);
                 }
	        	 System.out.print("name > ");
	             String name = scan.next();

	             System.out.print("id > ");
	             String id = scan.next();

	             System.out.print("password > ");
	             String password = scan.next();

	             System.out.print("age > ");
	             int age = Integer.parseInt(scan.next());
	             
	             
	             members[count] = new Member(name, id, password, age);
	             count++;
	             
	        	 break;
	        	 
	         case 3:
	        	 System.out.print("삭제할 아이디 입력 > ");
	        	 String delete_id = scan.next();
	        	 
	        	 for(int i =0; i <members.length; i++) {
	        		 if(members[i].getId().equals(delete_id)) {
	        			 int d_num = i; 
	        			 members[i] = null;
	        			 check = true;
	        			 break;
	        		 }
	        	 }
	        	 if(check) {
	        		 System.out.print("삭제 성공");
	        		 System.out.println();
	        		
	        	 }
	        	 	 
	        	 else {
	        		 System.out.print("삭제 실패");
	        		 System.out.println();
	        	 }
	        	 break;
	        	 
	         case 4:
	        	 
		        	 if(count==0) {
		        		 System.out.println("멤버가 없으니 다시 추가하고 조회해주세요");
		        		 break;
		        	 }
		        	 else {
//				        	 for(int i =0; i<members.length; i++) {
//				        		 if(members[i] != null) {
//				                 	System.out.println( members[i].getName() + ", " + members[i].getId() + ", " + members[i].getPassword() + ", "+ members[i].getAge());
//				                 	break;
//				        		 }
//				                 else 
//					        		System.out.print("잘못된 것");
//				        		 
//				        	 }
		        		 for(Member member: members)
		        			 if(member != null) {
		        				System.out.println("name id pw age");
		        				System.out.print(member);
		        			 }
			        	 break;
		        	 }	
		         

	         default:
	        	 run = false;
	        	 break;
	         
	         }
	      }
	}

	private static Member[] resizeArray(Member[] arr, int num) {
        Member[] newArray = new Member[num];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        return newArray;
    }
	
	
}
