package ArraySample;

/* [문제] Hello라는 문자열을 입력받아서 전송하고 
 * "반갑습니다" 라는 문자열을 추가하여 반환하세요 
 */

import java.util.Scanner;

public class class_sample1_ANS2_ox {
	
	private static void insa(String txt) {  // 리턴이 없기때문에 void
		
		String str = txt + " , 박수연님 반갑습니다.";
		System.out.println(str);
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요");
		String txt = sc.next(); // Hello
		
		insa(txt);

	}

}
