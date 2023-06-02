package ThreadSample;
/* 
 * [문제] Thread 클래스를 상속받아서 메시지를 출력하고
 *        1~100 사이의 합을 출력하는 프로그램을 작성하세요
 * <조건> 1. main 클래스 : ThreadSample_1
 *        2. Thread클래스를 상속에 이용
 *        3. 상속받아 처리할 클래스명은 Sample1_threadTest1 입니다
 *        3. 메시지 : "이것이 보이면 쓰레드가 잘 실행된 모습입니다."
 */

class Sample1_threadTest1 extends Thread {

	int sum = 0;

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("이것이 보이면 쓰레드가 잘 실행된 모습입니다.");
		System.out.println("합산은 " + sum);
	}
}

public class ThreadSample_Class {

	public static void main(String[] args) {
		Sample1_threadTest1 newone = new Sample1_threadTest1();
		newone.start();
		newone.run();
	}

}
