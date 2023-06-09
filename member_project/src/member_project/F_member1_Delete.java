package member_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class F_member1_Delete {

	private static Connection conn; // null, DB연결
	private static PreparedStatement pstmt;// null, sql 실행
	private static ResultSet rs;// sql의 실행 결과값 출력 담당

	public static void main(String[] args)  { 
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/hyunDB";
		//String url = "jdbc:mysql://127.0.0.1:3306/hyunDB";
		//String url = "jdbc:mysql://192.168.x.x:3306/hyunDB";
		//String url = "jdbc:mysql://10.41.1.102:3306/hyunDB\";
		//String url = "jdbc:mysql://21.21.21.21:3306/hyunDB\";
		String userid = "hyun";
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
		
		//3.데이터 수정 코드 작성
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제 할 아이디를 입력해 주세요.");
		String id = sc.next();		
		
		//4.데이터를 DATABASE에 저장
		String sql = "delete from member where id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id); 
		
			pstmt.executeUpdate();
			System.out.println("데이터를 성공적으로 삭제하였습니다.~");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("데이터 삭제에 실패하였습니다.!!");
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
			
			
		//3.조회 로직 작성	
		/*
		String sql = "select * from member"; 
		try {
			pstmt = conn.prepareStatement(sql);
			 
			rs = pstmt.executeQuery();
			 
			System.out.println("select의 처리 결과가 성공하였습니다.~~");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("select의 처리 결과가 실패하였습니다.~~");
		}
		
		//4.결과 출력		
		System.out.println("===== 회원정보 관리 시스템 개발 프로젝트 =====");
		System.out.println("ID" + "\t" + "NAME" + "\t" + "HEIGHT" + "\t" + "WEIGHT" + "\t" + "AGE");
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
		*/
		
	}

}
