package chunjae_Students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sungjuk_Select {

	private static Connection conn; // null, DB연결
	private static PreparedStatement pstmt;// null, sql 실행
	private static ResultSet rs;// sql의 실행 결과값 출력 담당

	public static void main(String[] args)  { 
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jinDB";
		String userid = "jin";
		String userpw = "1234";
		
		//1.Driver Loading
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩에 성공했습니다.~~");
			
			//2.아이디와 비번 체크
			try {
				conn = DriverManager.getConnection(url, userid, userpw);
				System.out.println("연결이 성공했습니다.~");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("연결이 실패했습니다.!!");
			}			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩에 실패했습니다.!!");
		}	
		
		//3.조회 로직 작성				
		String sql = "select * from sungjuk";
		try {
			pstmt = conn.prepareStatement(sql);
			 
			rs = pstmt.executeQuery();
			 
			System.out.println("select의 처리 결과가 성공하였습니다.~~");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("select의 처리 결과가 실패하였습니다.~~");
		}
		
		//4.결과 출력		
		System.out.println("===== 천재교육 대학교 성적 관리 시스템 개발 프로젝트 =====");
		System.out.println("학번" + "\t" + "과목" + "\t" + "반" + "\t" + "중간고사" + "\t" + "기말고사");
		System.out.println("-------------------------------------------");
		try {
			while(rs.next()) {
				String id = rs.getString("id");// rs.getString(1)
				String name = rs.getString("name");// rs.getString(2)
				float height = rs.getFloat("height");// (3)
				float weight = rs.getFloat("weight");// (4)
				int age = rs.getInt("age");// (5)
				
				System.out.println(id + "\t" + name + "\t" + height + "\t" + weight + "\t" + age); 
			}
			System.out.println("===================================");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
