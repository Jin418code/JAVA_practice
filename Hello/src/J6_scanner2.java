import java.util.Scanner;

public class J6_scanner2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		int user_input_number = scan.nextInt();

		System.out.println("입력하신 값은");
		System.out.println(user_input_number);
	}
}
