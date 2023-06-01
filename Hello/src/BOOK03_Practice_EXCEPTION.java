import java.util.Scanner;

public class BOOK03_Practice_EXCEPTION {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("1번째 숫자를 입력해 주세요.");
			int x = sc.nextInt(); // x = 500;

			System.out.println("2번째 숫자를 입력해 주세요.");
			int y = sc.nextInt(); // y = 5;

			boolean result = x > y;
			System.out.println("Boolean = " + result); // true

			int z = 35;
			if (z % 2 == 1) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}

			boolean res = z % 2 == 0;
			System.out.println(res); // false
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
