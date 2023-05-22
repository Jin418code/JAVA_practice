import java.util.Scanner;

public class BOOK07_bit_shift {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("쉬프트로 처리할 데이터를 입력해주세요: ");
		int x = sc.nextInt();
		int x2 = sc.nextInt();
		
		int result = x << 4;  // 100 x 2 = 200 x 2 = 400 x 2 = 800
		System.out.println("shift << 4 bit : " + result);  // 800
		
		int result2 = x2 << -4;  
		System.out.println("shift << 4 bit : " + result2);  
	}

}
