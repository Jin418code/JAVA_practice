import java.util.Scanner;

/* 키보드로부터 2개의 숫자를 입력받아서 합계를 구하여 출력하세요.
 * Scanner sc = new Scanner(System.in);
 * int x = sc.nextInt();
 * int y = sc.nextInt();
 * 
 * sc.nextInt()
 * 객체명.메소드명(); // 메서드(method) = 함수(function)
 */


public class J6_scanner {
//field area
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1번째 숫자를 입력해 주세요.");
		int x  = sc.nextInt();  // 키보드 x를 통해 입력 받기 위해
		System.out.println("2번째 숫자를 입력해주세요.");
		int y  = sc.nextInt();  // 키보드 y를 통해 입력 받기 위해
		
		int adder = x + y;
		int suber = x - y;
		int muler = x * y;
		int diver = x / y;
		int diver2 = x % y;
	
		System.out.println(adder);
		System.out.println(suber);
		System.out.println(muler);
		System.out.println(diver);
		System.out.println(diver2);
	}

}
