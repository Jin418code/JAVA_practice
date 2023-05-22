import java.util.Scanner;

public class BOOK03_Practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1번째 숫자를 입력해 주세요.");
		int x = sc.nextInt(); // x = 500;

		System.out.println("2번째 숫자를 입력해 주세요.");
		int y = sc.nextInt(); // y = 5;

		boolean result = x > y;
		System.out.println("Boolean = " + result); // true

		int z = 35;
		if(z % 2 == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		boolean res = z % 2 == 0;
		System.out.println(res);  // false
	}
}
