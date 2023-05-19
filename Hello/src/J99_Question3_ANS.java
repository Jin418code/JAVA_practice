import java.util.Scanner;

/*
 * [문제] 1부터 시작하여 합계가 3000이 넘으면 그때 그 값이 얼마인가요?
 * 그리고 합계는 얼마인가요?
 */

public class J99_Question3_ANS {
	public static void main(String[] args) {
		int ending = 3000;
		int count = 0;
		int sum = 0;
		
		while(sum <= ending) {
			count++;
			sum += count;
		}
		System.out.println(count + ", " + sum);
	}

}