package ArraySample;

/*[문제] 어떤 수의 약수 구하기
 * 수 : 100
 * 약수 : 1/100=100, 2/100=50, 4/100=25, 5/100=20...
 * 1, 2, 4, 5, 20, 25, 50, 100
 * 1. 약수를 구하여 출력하라.
 * 2. 그 합계를 구하면
 */
import java.util.Scanner;

class methodTest {
	static int count;

	public int calc(int num) {
		int sum = 0;
		

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.println((count+1) + "번째 약수 = " + i);
				sum += i;
				count += 1;
			}
		}
		return sum;
	}
}

public class class_sample2_Question1_ANS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("약수를 구할 수를 입력하세요.");
		int num = sc.nextInt();

		methodTest mt = new methodTest();

		int sum = mt.calc(num);
		System.out.println(num + "의 약수의 합계는 " + sum + ", 갯수는" + methodTest.count);
	}  // main area

}  // class area