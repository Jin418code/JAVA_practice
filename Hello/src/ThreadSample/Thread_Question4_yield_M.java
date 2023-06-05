package ThreadSample;
/*
 * [yield 메서드를 이용하여 1~n까지를 출력하는 프로그램 작성]
 *        1. 스레드는 3개를 이용하여
 *        2. 1번 스레드는 1~50, 2번 스레드는 51~100, 3번 스레드는 101~200
 */

class MyThread1 extends Thread {
	public void run() {
		for(int i = 1; i <= 50; i++) {
			System.out.println("T1");
			
			Thread.yield();
		}
	}
}
class MyThread2 extends Thread {
	public void run() {
		for(int i = 51; i <= 100; i++) {
			System.out.println("T2");
			
			Thread.yield();
		}
	}
}
class MyThread3 extends Thread {
	public void run() {
		for(int i = 101; i <= 200; i++) {
			System.out.println("T3");
			
			Thread.yield();
		}
	}
}
public class Thread_Question4_yield_M {

	public static void main(String[] args) {
		
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
		MyThread2 thread2 = new MyThread2();
		thread2.start();
		
		MyThread3 thread3 = new MyThread3();
		thread3.start();
		
	}

}
