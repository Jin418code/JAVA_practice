package ThreadSample;

/*
 * [문제] 멀티스레드 이용하여 홍길동, 전우치, 이순신 데이터를 스레드 이름으로 하고
 *        1. main 클래스 : Thread_Question1 
 *        2. Runnable 인터페이스 상속에 이용
 *        3. 상속받아 처리할 클래스명은 Sample1_threadTest4
 *        4. 1~100의 합계 구하기
 */

class Sample1_threadTest4 implements Runnable {

	private void number1() {
		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum += i;
			System.out.println(Thread.currentThread().getName() + i + ", sum = " + sum);
		}
		System.out.println("합계 : " + sum);
	}

	@Override
	public void run() {
		number1();
	}
}

public class Thread_Question1_ANS {
	public static void main(String[] args) {
		
		Sample1_threadTest4 st = new Sample1_threadTest4();

		Thread test1 = new Thread(st, "홍길동");
		Thread test2 = new Thread(st, "전우치");
		Thread test3 = new Thread(st, "이순신");
		
		test1.start();
		test2.start();
		test3.start();
		

	}

}
