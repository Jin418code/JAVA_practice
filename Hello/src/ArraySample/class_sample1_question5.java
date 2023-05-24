package ArraySample;

//[문제] 다른 클래스에 존재하는 과목 점수와 총점, 평균을 출력해보자
import java.util.Scanner;

public class class_sample1_question5 {

	public static void main(String[] args) {
		
		class_sample1_question4_1 con3 = new class_sample1_question4_1();
		// 타 클래스 변수 접근
		System.out.println(con3.java);
		System.out.println(con3.jsp);
		System.out.println(con3.spring);
		System.out.println(con3.addAll);
		System.out.println(con3.aver);
		
		// 타 클래스 메서드 접근
		con3.sungjukInput(); // 객체를 새로 만들고 접근
		class_sample1_question4_1.sungjukInput(); // 클래스명.클래스메서드명으로 바로 접근
	}

}
