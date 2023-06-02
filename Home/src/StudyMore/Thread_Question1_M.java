package StudyMore;

/*
 * [문제] 멀티스레드 이용하여 홍길동, 전우치, 이순신 데이터를 스레드 이름으로 하고
 *        1. main 클래스 : Thread_Question1 
 *        2. Runnable 인터페이스 상속에 이용
 *        3. 상속받아 처리할 클래스명은 Sample1_threadTest4
 *        4. 1~100의 합계 구하기
 */

class Sample1_threadTest44 implements Runnable {

	private String name;

	public Sample1_threadTest44(String name) {
        this.name = name;
    }

	public void run() {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println(name + "의 합계: " + sum);
	}
}

public class Thread_Question1_M {
	public static void main(String[] args) {
		String[] names = { "홍길동", "전우치", "이순신" };

		for (String name : names) {
			Thread thread = new Thread(new Sample1_threadTest44(name));
			thread.start();
		}
	}
}