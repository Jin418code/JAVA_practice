package ThreadSample;

/*
 * [문제] 멀티스레드 이용하여 홍길동, 전우치, 이순신 데이터를 스레드 이름으로 하고
 *        1. main 클래스 : Thread_Question1 
 *        2. Runnable 인터페이스 상속에 이용
 *        3. 상속받아 처리할 클래스명은 Sample1_threadTest4
 *        4. 1~100의 합계 구하기
 */

class Sample1_threadTest44 implements Runnable {

	String name[] = { "홍길동", "전우치", "이순신" };

	public void run() {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
			System.out.println(Thread.currentThread().getName() + i + ", sum = " + sum);
		}
	}

}

public class Thread_Question1_M {

	public static void main(String[] args) {

		Sample1_threadTest44 st = new Sample1_threadTest44();

		Thread thread1 = new Thread(st.name[0]);
		Thread thread2 = new Thread(st.name[1]);
		Thread thread3 = new Thread(st.name[2]);
		thread1.setName(" 쓰레드");  // 수정해야함
		System.out.println(thread1.getName());
		thread1.start();

	}

}