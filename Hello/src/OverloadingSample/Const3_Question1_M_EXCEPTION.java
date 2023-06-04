package OverloadingSample;

import java.util.Scanner;

// [문제] 이름과 나이를 입력받아서 생성자 오버로딩으로 구현하세요
class file {

	public static String name = null;
	public static int age = 0;

	public file(String name, int age) {
		file.name = name;
		file.age = age;
	}

}

public class Const3_Question1_M_EXCEPTION {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("이름을 입력해주세요");
			String name = sc.next();

			System.out.println("나이를 입력해주세요");
			int age = sc.nextInt();

			file inputFrom = new file(name, age);

			System.out.println("성함은 " + name + " 나이는 " + age);
		} catch (Exception e) {
			System.out.println("예외가 발생" + e.getMessage());
		}
	}
}