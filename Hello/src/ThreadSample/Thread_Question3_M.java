package ThreadSample;

/* [문제] 구구단을 출력
 *       1. 구구단 문제를 출력한다 2 x 2 = 4
 *       2. 답을 제출하는 시간을 제한한다(3초이내에 답을 입력하도록)
 *       3. 구구단을 끝내고 싶으면 "EXIT"를 입력하여 프로그램을 종료
 *       4. main 클래스: Thread_Question3_M
 *       5. Runnable 인터페이스 또는 Thread 클래스를 상속
 *       6. 상속받아 처리할 클래스명은 ThreadTest1_Sample6
 *       7. join() 사용 예제
 * 
 *       join()으로 답변을 받기까지 3초를 기다린다
 */
import java.lang.InterruptedException;
import java.util.Scanner;

class ThreadTest1_Sample61 extends Thread {
	private boolean correct;
	private int answer;
	
	public void run() {

	}

}

public class Thread_Question3_M {

	public void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("몇단을 하고 싶은지 정수로 입력하세요");
		int danNum = sc.nextInt();

		while (true) {
			try {
				thread.join(3000);
			} catch (InterruptedException e) {
			}
			// 1. 객체 생성(NEW)
			Thread myThread = new Thread() {
				@Override
				public void run() {
					for (int i = 1; i <= 9; i++) {
						System.out.println(danNum + "*" + i + " = ");
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
						}
					}
				}
			};
		}

		System.out.println("3초 후 종료");

}

int inputNum = 0;

ThreadTest1_Sample61 ts6 = new ThreadTest1_Sample61();
