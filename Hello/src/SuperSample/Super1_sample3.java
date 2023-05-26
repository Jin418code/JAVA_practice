package SuperSample;

abstract class Ship {
	public abstract int move();// 사람을 몇명 나르는가

	public abstract int carry();// 짐을 몇kg 나르는가

}

class Boat extends Ship {
	public int move() {
		return 6;
	}// 사람을 몇명 나르는가

	public int carry() {
		return 100;
	}// 짐을 몇kg 나르는가

	public String name() {
		return "쌩쌩 보트 : ";
	}
}

class Cruise extends Ship {
	public int move() {
		return 300;
	}// 사람을 몇명 나르는가

	public int carry() {
		return 2000;
	}// 무기를 몇정 나르는가

	public String name() {
		return "세월호 : ";
	}
}

class ShipUtil {
	public static void search(Ship s) {
		System.out.println(s.move());
		System.out.println(s.carry());
		if (s instanceof Boat) {
			Boat b = (Boat) s;
			System.out.println("Boat 이름: " + b.name());

		} else if (s instanceof Cruise) {
			Cruise b = (Cruise) s;
			System.out.println("Cruise 이름:" + b.name());

		}
	}
}

public class Super1_sample3 {
	public static void main(String[] args) {
		Ship ship1 = new Boat();
		Ship ship2 = new Cruise();
		System.out.println(ship1.move());
		System.out.println(ship1.carry());
		System.out.println(ship2.move());
		System.out.println(ship2.carry());
		ShipUtil.search(ship2);
	}
}