package inheritanceSample;

public class CalDiver1 extends CalDiver2{
	
	public static void diver1 (int x, int y) {
		
		int sum = x / y;
		
		System.out.println("나눗셈의 몫 : " + sum);
	}
}
