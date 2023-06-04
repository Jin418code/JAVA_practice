package Book;

// p525 [이너 클래스를 활용한 쓰레드 객체 생성 및 실행]
//class SMIFileThread extends Thread {
//	@Override
//	public void run() {
//		// 자막 번호 하나 ~ 다섯
//		String[] strArray = {"one", "two", "three", "four", "five"};
//		try {Thread.sleep(10);} catch (InterruptedException e) {}
//		// 자막 번호 출력
//		for (int i = 0; i < strArray.length; i++) {
//			System.out.println(" - (number) " + strArray[i]);
//			try {Thread.sleep(400);} catch (InterruptedException e) {}
//		}
//	}
//}
//class VideoFileThread extends Thread {
//	@Override
//	public void run() {
//		int[] intArray = {1, 2, 3, 4, 5};
//		
//		for(int i = 0; i < intArray.length; i++) {
//			System.out.println("(video frame)" + intArray[i]);
//			try {Thread.sleep(200);} catch (InterruptedException e) {}
//		}
//	}
//}
//
//public class L15 {
//	public static void main(String[] args) {
//		//SMIFileThread 객체 생성 및 시작
//		Thread smiFileThread = new SMIFileThread();
//		smiFileThread.start();
//		
//		Thread videoFileThread = new VideoFileThread();
//		videoFileThread.start();
//	}
//	
//}

// p531 [쓰레드의 우선순위]

//class MyThread extends Thread {
//
//	@Override
//	public void run() {
//		for (long i = 0; i < 10000000; i++) {
//		}
//		System.out.println(getName() + "우선순위: " + getPriority());
//	}
//}
//
//public class L15 {
//	public static void main(String[] args) {
//		
//		// CPU 코어 수
//		System.out.println("코어 수" + Runtime.getRuntime().availableProcessors());
//		
//		// 우선순위 자동 지정
//		for(int i = 0; i < 3; i++) {
//			Thread thread = new MyThread();
//			thread.start();
//		}
//		
//		try {Thread.sleep(1000);} catch (InterruptedException e) {}
//		
//		for(int i = 0; i < 10; i++) {
//			Thread thread = new MyThread();
//			thread.setName(i + "번째 쓰레드");
//			if(i == 9) thread.setPriority(10);
//			thread.start();
//		}
//	}
//}

// p540 [동기화를 사용하지 않았을 때 문제 발생]

//class MyData {
//	int data = 3;
//
//	public void plusData() {
//		int mydata = data;
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//		}
//		data = mydata + 1;
//	}
//}

// 공유 객체를 사용하는 쓰레드 
//class PlusThread extends Thread {
//	MyData myData;
//	public PlusThread(MyData myData) {
//		this.myData = myData;
//	}
//	@Override
//	public void run() {
//		myData.plusData();
//		System.out.println(getName() + " 실행결과 : " + myData.data);
//	}
//}
//public class L15 {
//	public static void main(String[] args) {
//		//공유 객체 생성
//		MyData myData = new MyData();
//		
//		// plusThread1
//		Thread plusThread1 = new PlusThread(myData);
//		plusThread1.setName("plusThread1");
//		plusThread1.start();
//		
//		try {
//			Thread.sleep(100); 
//		} catch (InterruptedException e) {} // 1초 기다림
//		
//		// plusThread2
//		Thread plusThread2 = new PlusThread(myData);
//		plusThread2.setName("plusThread2");
//		plusThread2.start();
//	}
//}

//p557 [쓰레드 상태(NEW, RUNNABLE, TERMINAED)]
public class L15 {
	public static void main(String[] args) {
		// 쓰레드 상태 저장 클래스
		Thread.State state;

		// 1. 객체 생성(NEW)
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for (long i = 0; i < 10000000000000L; i++) {
				}
			}
		};

		state = myThread.getState();
		System.out.println("myThread state = " + state);

		// 2. myThread 시작
		myThread.start();
		state = myThread.getState();
		System.out.println("myThread state = " + state);

		// 3. myThread 종료
		try {
			myThread.join();
		} catch (InterruptedException e) {}
		state = myThread.getState();
		System.out.println("myThread state = " + state);

	}
}