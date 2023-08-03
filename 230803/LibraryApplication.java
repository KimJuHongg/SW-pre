package JavaProject;

import java.util.Scanner;

public class LibraryApplication {
	
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MemberService service = new MemberService();
        // 회원 가입 테스트
        System.out.println("회원 가입 정보 입력");
        System.out.print("ID: ");
        int member_id = sc.nextInt();

        System.out.print("이름: ");
        String name = sc.next();

        System.out.print("비밀번호: ");
        String password = sc.next();

        System.out.print("역할(user/admin): ");
        String role = sc.next();

        Member member = new Member(member_id, name, password, role);
        service.regist(member);

        // 로그인 테스트
        System.out.println("로그인 정보 입력");
        System.out.print("이름: ");
        String loginName = sc.next();

        System.out.print("비밀번호: ");
        String loginPassword = sc.next();

        Member loggedInMember = service.login(loginName, loginPassword);
        if (loggedInMember != null) { 
            System.out.println("로그인 성공!");
        } else {
            System.out.println("로그인 실패!");
        }

        sc.close();
    }
}

