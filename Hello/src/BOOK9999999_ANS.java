import java.util.Scanner;

// [문제] 시작하는 숫자를 입력하고, 끝나는 숫자를 입력하면 합계가 얼마인가요?
//		예시) 1, 20 : 210
public class BOOK9999999_ANS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int sum = 0;

		for (int i = start; i < end; i++) {
			sum += i;
		}

		System.out.println("start ~ end : " + sum);
	}

}
