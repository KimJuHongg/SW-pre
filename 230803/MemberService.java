package JavaProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberService {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;



	public void jdbcConnection() {
		con = JdbcConnection.makeConnection();
	}
	
	
	
	  // 회원 정보를 데이터베이스에 저장하는 메서드
    public static void regist(Member member) {
    	
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "scott", "tiger");
            String query = "INSERT INTO member (member_id, name, password, role) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, member.getMember_id());
            pstmt.setString(2, member.getName());
            pstmt.setString(3, member.getPassword());
            pstmt.setString(4, member.getRole());

            pstmt.executeUpdate();
            pstmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 로그인 기능을 수행하는 메서드
    public static Member login(String username, String password) {
        Member member = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "scott", "tiger");
            String query = "SELECT * FROM member WHERE name = ? AND password = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                int member_id = resultSet.getInt("member_id");
                String name = resultSet.getString("name");
                String role = resultSet.getString("role");
                member = new Member(member_id, name, password, role);
            }

            resultSet.close();
            pstmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return member;
    }

   }
	

