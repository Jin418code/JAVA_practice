package member_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class member2_question_ANS {
	
	
	private static Connection conn; // null, DB연결
	private static PreparedStatement pstmt;// null, sql 실행
	private static ResultSet rs;// sql의 실행 결과값 출력 담당

	static member2_question_ANS mtm = new member2_question_ANS();

	private void connectionCheck() {
		//1.Driver Loading
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jindb";
		String userId = "jin";
		String userPw = "1234";
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩에 성공했습니다");
			
			//2.아이디와 비번 체크
			try {
				conn = DriverManager.getConnection(url, userId, userPw);
				System.out.println("연결이 성공했습니다.~");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("연결이 실패했습니다.!!");
			}			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩에 실패했습니다.!!");
		}	
	}
	
	private void memberSelect() {
		
		connectionCheck();
		
		String sql = "select * from member";
		try {
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			
			System.out.println("데이터를 성공적으로 삽입하였습니다.~");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("데이터 삽입에 실패하였습니다.!!");
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {

		boolean stop = true;

		while (stop) {
			System.out.println("=========================");
			System.out.println(" 1. 회원정보 조회 시스템");
			System.out.println(" 2. 회원정보 입력 시스템");
			System.out.println(" 3. 회원정보 수정 시스템");
			System.out.println(" 4. 회원정보 삭제 시스템");
			System.out.println(" 5. 회원정보 종료 시스템");
			System.out.println("=========================");

			Scanner sc = new Scanner(System.in);
			System.out.println("원하는 메뉴를 선택해주세요.");
			String x = sc.next();

			switch (x) {
			case "1":
				mtm.memberSelect();
//			case "2":
//				mtm.memberInsert();
//			case "3":
//				mtm.memberUpdate();
//			case "4":
//				mtm.memberDelete();
			case "5":
				stop = false;

			}

		}
	}
}