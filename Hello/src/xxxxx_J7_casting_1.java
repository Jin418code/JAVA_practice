package kr.or.ksmart;

import java.util.ArrayList;
import java.util.List;

class ACalculater {
	private int sum;

	public int sum(int a, int b) {
		this.sum = a + b;
		return sum;
	}

	public int get() {
		return sum;
	}
}

public class JavaBasicEx06 {
	public static void main(String[] args) {
		ACalculater cal = null;

		/*
		 * ACalculater클래스를 생성하고 계산을 할 수 있는 메서드를 만들어 계산을 하고 그 결과값을 반환하시오. 연산>> 10 + 20
		 */

		cal = new ACalculater();
		int sum = cal.sum(10, 20);
		System.out.println(sum);
		System.out.println("---------");

		/*
		 * ACalculater클래스를 생성하고 계산을 할 수 있는 메서드를 만들어 아래의 연산을 처리 후에 처리한 내용을 list 객체에 담아라.
		 * 연산 10 + 20, 20 + 50, 30 + 40
		 */
		List<ACalculater> list = new ArrayList<ACalculater>();
		cal = new ACalculater();
		cal.sum(10, 20);
		list.add(cal);

		cal = new ACalculater();
		cal.sum(20, 50);
		list.add(cal);

		cal = new ACalculater();
		cal.sum(30, 40);
		list.add(cal);

		for (int i = 0; i < list.size(); i++) {
			ACalculater ac = list.get(i);
			System.out.println(ac.get());
		}
	}
}