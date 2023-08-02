package day0802;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {
	public static void main(String[] args) {
		try {
			// 드라이버들이 읽히기만 하면 자동객체가 생성되고 DriverManager에 등록된다.
			Class.forName("com.mysql.cj.jdbc.Driver");	//MYSQL드라이버 로드
			//mysql과 연결시키기
			String url = "jdbc:mysql://localhost:3306/studentdb";
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");//JDBC연결
			System.out.println("DB 연결 완료");
		}	catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} 	catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
}
