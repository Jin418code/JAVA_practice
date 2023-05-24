package ArraySample;

/* [문제] Hello라는 문자열을 입력받아서 전송하고 
 * "반갑습니다" 라는 문자열을 추가하여 반환하세요 
 */

import java.util.Scanner;

public class class_sample1_ANS3_xo {
	
	private static String insa() {  // 전달인자(파라미터) 없음
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("문자열을 입력해주세요");  
		String txt = sc.next(); // Hello
		
		String str = txt + ", 박수연님 반갑습니다.";

		return str;
	}

	public static void main(String[] args) {
		
		String x = insa();
		System.out.println(x);

	}

}
