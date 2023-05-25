package method_sample;

import java.util.Scanner;

/* [문제]
 * 원의 면적을 구하여 출력하세요
 * <조건>
 * 해결 방법을 2가지 이상 적용하여 프로그래밍 하세요
 * 1. 상속이용
 * 2. 객체를 생성하여 프로그램 작성
 * - 해결하는 공식을 2가지 이상 적용해보세요.
*/

// ## 2. 객체 생성하며 상속 ## 

class sample_inher3_Question2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력해주세요");
		double radius = sc.nextInt();
		
		sample_inher3_Question2_Radius1 a = new sample_inher3_Question2_Radius1();
		double result = a.howRadius(radius); 
		
		System.out.println("원의 넓이는 " + result);
	}

}