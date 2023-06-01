package Book;

// p472 [2개의 try-catch 구문과 1개의 다중 catch 구문의 비교]

//public class L14 {
//
//	public static void main(String[] args) {
//		try {
//			System.out.println(3 / 0);
//		} catch (ArithmeticException e) {
//			System.out.println("숫자는 0으로 나눌 수 없습니다");
//		} finally {
//			System.out.println("프로그램 종료");
//		}
//
//		try {
//			int num = Integer.parseInt("10A");
//		} catch (NumberFormatException e) {
//			System.out.println("숫자로 바꿀 수 없습니다");
//		} finally {
//			System.out.println("프로그램 종료");
//		}
//		System.out.println("========================");
//
//		// 다중 try-catch
//		try {
//			System.out.println(3 / 0);
//			int num = Integer.parseInt("10A");
//		} catch (ArithmeticException e) {
//			System.out.println("숫자는 0으로 나눌 수 없습니다");
//		} catch (NumberFormatException e) {
//			System.out.println("숫자로 바꿀 수 없습니다");
//		} finally {
//			System.out.println("프로그램 종료");
//		}
//	}
//}

//p503 [사용자 예외 클래스 정의 및 예외 발생시키기]

class MinusException extends Exception {
	public MinusException() {
		super();
	}

	public MinusException(String message) {
		super(message);
	}
}

class OverException extends Exception {
	public OverException() {
		super();
	}

	public OverException(String message) {
		super(message);
	}
}

class A333 {
	void checkScore(int score) throws MinusException, OverException {
		if (score < 0) {
			throw new MinusException("예외 발생: 음숫값 입력");
		} else if (score > 100) {
			throw new OverException("예외 발생: 100점 초과");
		} else {
			System.out.println("정상적인 값입니다");
		}
	}
}

public class L14 {
	public static void main(String[] args) {
		
		A333 a = new A333();
		
		try {
			a.checkScore(85);
			a.checkScore(150);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
	}
}
