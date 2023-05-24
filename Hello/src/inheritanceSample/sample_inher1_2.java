package inheritanceSample;

import java.util.Scanner;

/*
 * 이름과 나이를 입력하여 출혁하는 프로그램 작성
<조건 > 
부모 클래스 = age, 나이를 입력받아서 반환하는 클래스 
자식 클래스 = smaple_inher, 이름을 입력받아서, 
이름과 나이를 출력하는 클래스 상속을 이용한 프로그램 작성 
*/

/*class Age2 {
	
	public static int age() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();

		return age;
	}
}*/

public class sample_inher1_2 extends Age2 {  // 상속 받음

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();

//		Age a = new Age();  // 상속을 이미 받아서 객체 생성 안해도 됨
		int nae = age();
		System.out.println(name + "님의 나이는 " + nae + "세 입니다.");
	}
}