package member_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class dbtest {
	private Connection conn; // DB 커넥션 연결 객체
	private final String USERNAME = "root";// DBMS접속 시 아1이디
	private final String PASSWORD = "1234";// DBMS접속 시 비밀번호
	private final String URL = "jdbc:mysql://localhost:3306/jindb";// DBMS접속할 db명

	public void BoardDao() {
		try {
			System.out.println("생성자");
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("드라이버 로딩 성공");
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 ");
			try {
				conn.close();
			} catch (SQLException e1) {
			}
		}8
	}1
}

public class connectionTest2 {

	public static void main(String[] args) {
		dbtest bDao = new dbtest();
	}

}
