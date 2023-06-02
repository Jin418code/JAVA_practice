package ThreadSample;
/* 
 * [문제] Thread 클래스를 상속받아서 메시지를 출력하고
 *        1~100 사이의 합을 출력하는 프로그램을 작성하세요
 * <조건> 1. main 클래스 : ThreadSample_1
 *        2. Thread클래스를 상속에 이용
 *        3. 상속받아 처리할 클래스명은 Sample1_threadTest1 입니다
 *        3. 메시지 : "이것이 보이면 쓰레드가 잘 실행된 모습입니다."
 */

public class ThreadSample_Interface_ANS {

	class Sample1_threadTest2 implements Runnable {

		private void number2() {
			int sum = 0;
			for (int i = 0; i <= 100; i++) {
				sum += i;
			}
			System.out.println("1~100: " + sum);
		}

		private void number1() {
			System.out.println("이것이 보이면 스레드가 잘 실행된 모습입니다.~");
		}

		@Override
		public void run() {
			number1();
			number2();
		}

		public void start() {
			run();
		}

		/*
		 * public void run() { number1(); number2(); }
		 */
	}

	public class ThreadTest1_Sample2 {

		public void main(String[] args) {
			Sample1_threadTest2 st2 = new Sample1_threadTest2();
			st2.start();

		}
	}

}
