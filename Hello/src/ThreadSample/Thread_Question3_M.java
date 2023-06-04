package ThreadSample;

/* [문제] 구구단을 출력
 *       1. 구구단 문제를 출력한다 ex) 2 x 2 = 4
 *       2. 답을 제출하는 시간을 제한한다(3초이내에 답을 입력하도록)
 *       3. 구구단을 끝내고 싶으면 "EXIT"를 입력하여 프로그램을 종료
 *       4. main 클래스: Thread_Question3_M
 *       5. Runnable 인터페이스 또는 Thread 클래스를 상속
 *       6. 상속받아 처리할 클래스명은 ThreadTest1_Sample6
 *       7. join() 사용 예제
 *       join()으로 답변을 받기까지 3초를 기다린다
 */

import java.lang.InterruptedException;
import java.util.Scanner;

class ThreadTest1_Sample6 extends Thread {

	Scanner sc = new Scanner(System.in);

	private boolean keepGoing = true;

			int num1 = (int) ((Math.random() * 9) + 1);
			int num2 = (int) ((Math.random() * 9) + 1);
			int comAnswer = num1 * num2;

			System.out.println(num1 + " * " + num2 + " = " + "?");

			int inputAnswer = sc.nextInt();
			String exitCode = sc.nextLine();

				@Override
				public void run() {
					while (keepGoing) {
						
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
						System.out.println("시간 초과");
						Thread.currentThread().interrupt();
					}
				}
			

	public boolean checking(String asnwer) {
		int numAnswer;
		try {
			input = Integer.parseInt(answer);
		} catch (NumberFormatException e) {
			return false;
		}
	}
}}}

public class Thread_Question3_M {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ThreadTest1_Sample6 thread = new ThreadTest1_Sample6();
		thread.start();

		while (true) {
			System.out.println("3초 안에 답을 입력해주세요 / 종료는 'Exit'를 입력해주세요");

			String inputAnswer = sc.nextLine();
			if (inputAnswer.equalsIgnoreCase("Exit")) {
				break;
			}

			boolean correct = thread.checking(inputAnswer);
			if (correct) {
				System.out.println("정답입니다");
			} else {
				System.err.println("오답입니다");
			}

			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
