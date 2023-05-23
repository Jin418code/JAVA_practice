package ArraySample;

import java.util.Arrays;
import java.util.Scanner;


public class String1_Buffer1 {

	public static void main(String args[]) {
		
		
		StringBuffer str1 = new StringBuffer("Hello JAVA");
		StringBuffer str2 = new StringBuffer("안녕. 자바");

		System.out.println("버퍼1 내용 => " + str1);
		System.out.println("버퍼1 크기 => " + str1.length());
		System.out.println("버퍼1 용량 => " + str1.capacity());

		System.out.println("버퍼2 내용 => " + str2);
		System.out.println("버퍼2 크기 => " + str2.length());
		System.out.println("버퍼2 용량 => " + str2.capacity());

		System.out.println("=====================");
		
		StringBuffer str3 = new StringBuffer("안녕 자바");
		System.out.println("버퍼에 들어있는 내용 =>" + str3);
		System.out.println("문자열 끼워넣기 =>" + str3.insert(3, "power"));
		System.out.println("5번째 버퍼의 내용 =>" + str1.charAt(4));
		
		str3.setCharAt(0, '정');  // 0번째 인덱스의 값을 '정'으로 설정
		str3.setLength(8);  // 문자열의 길이를 8로 설정. 나머지는 손실
		System.out.println("버퍼의 새로운 값 =>" + str3);
		System.out.println("문자열의 역순출력하기 =>" + str3.reverse());
	}

}
