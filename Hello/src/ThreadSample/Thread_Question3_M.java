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

class ThreadTest1_Sample6 implements Runnable {

	Scanner sc = new Scanner(System.in);
	private boolean keepGoing = true;
	private Thread mainThread;
	private int answer;

	public void setMainThread(Thread mainThread) {
		this.mainThread = mainThread;
	}

	public void stop() {
		keepGoing = false;
	}

	public int getAnswer() {
		return answer;
	}

	@Override
	public void run() {
		while (keepGoing) {

			int num1 = (int) ((Math.random() * 9) + 1);
			int num2 = (int) ((Math.random() * 9) + 1);
			System.out.println(num1 + " * " + num2 + " = " + "?");
			answer = num1 * num2;

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (keepGoing) {
				System.out.println("시간 초과");
			}
		}
		mainThread.interrupt();
	}
}

public class Thread_Question3_M {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ThreadTest1_Sample6 runnable = new ThreadTest1_Sample6();
		Thread thread = new Thread(runnable);
		runnable.setMainThread(thread);

		thread.start();
		System.out.println("3초 안에 답을 입력해주세요 / 종료는 'Exit'를 입력해주세요");

		while (true) {
			String inputAnswer = sc.nextLine();

			if (inputAnswer.equalsIgnoreCase("Exit")) {
				runnable.stop();
				System.out.println("종료되었습니다");
				break;
			}

			try {
				int input = Integer.parseInt(inputAnswer);
				int comAnswer = runnable.getAnswer();

				if (input == comAnswer) {
					System.out.println("정답입니다");
				} else {
					System.out.println("오답입니다");
				}
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력해주세요");
			}
		}
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}