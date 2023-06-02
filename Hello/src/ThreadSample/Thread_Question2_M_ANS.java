package ThreadSample;

import java.util.Scanner;
/*
 * [문제] 병원에 환자가 진료를 받으러 n명이 방문합니다.
 *        1. 방문자 : 김규민, 박수연, 최지만, 임성현, 김동현, 임하늘, 유다희, 손진경
 *        2. main 클래스 : Thread_Question2_M
 *        3. Runnable 인터페이스 또는 Thread 클래스를 상속에 이용
 *        4. 상속받아 처리할 클래스명은 ThreadTest1_Sample5
 *        5. 동기화 하지 않은 방식으로 환자를 지료하는 방법
 *        6. 동기화하여 환자를 진료하는 방법이 결과를 보고 판단
 */

class Sample1_threadTest55 implements Runnable {

	private String[] patients;

	public Sample1_threadTest55(String[] patients) {
		this.patients = patients;
	}

	public void treatPatients() {
		for (int i = 0; i < patients.length; i++) {
			String patient = patients[i];
			try {
				Thread.sleep(1000); // 진료 시간이라 가정
				System.out.println(patient + "님 진료 완료");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		treatPatients();
	}
}

public class Thread_Question2_M_ANS {
	public static void main(String[] args) {
		String[] patients = { "김규민", "박수연", "최지만", "임성현", "김동현", "임하늘", "유다희", "손진경" };

		Sample1_threadTest55 threadTest = new Sample1_threadTest55(patients);
		Thread thread = new Thread(threadTest);
		thread.start();
	}
}