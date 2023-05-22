import java.util.Scanner;

/*
 * 삼항 연산자 : 복잡한 형태의 조건문을 단순화 시키는 것이 목적이다.
 * ? = (수식) ? 찹 : 거짓 
 * 
 */
public class BOOK11_dowhile {

	public static void main(String[] args) {

		int a;
		
		a = 0;
		while (a < 0) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();

		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a < 0);
		System.out.println();

		a = 0;
		while (a < 1) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();

		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a < 1);
		System.out.println();

		a = 0;
		while (a < 10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();

		a = 0;
		do {
			System.out.println();
			a++;
		} while (a < 10);
		System.out.println();
	}
	

}
