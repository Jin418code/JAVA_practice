package member_project;
/*
 * [문제] 회원관리 시스템을 업그레이드하여 
 * 각각의 method를 이용한 객체지향 프로그래밍을 작성하시오
 * 
 * 1. 회원정보 조회 시스템
 * 2. 회원정보 입력 시스템
 * 3. 회원정보 수정 시스템
 * 4. 회원정보 삭제 시스템
 * 5. 회원정보 종료 시스템
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class member2_question_M {
	
	
	
	private static Connection conn; // null, DB연결
	private static PreparedStatement pstmt;// null, sql 실행
	private static ResultSet rs;// sql의 실행 결과값 출력 담당
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jinDB";
		String userid = "jin";
		String userpw = "1234";
		
		boolean state = true;
		
		while(state) {
			System.out.println("조회 / 입력 / 수정 / 삭제 / 종료");
			String input = sc.nextLine();
			
		}
	}
}
