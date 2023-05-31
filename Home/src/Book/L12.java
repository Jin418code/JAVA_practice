package Book;

interface A {
	public static int a = 3;

	public abstract void abc();
}

interface B {
	int b = 3;  // 생략을 해도 자동으로 public static final
	void bcd();  // 
}

public class L12 {
	public static void main(String[] args) {
		
		System.out.println(A.a);
		System.out.println(B.b);
		
//		A.a = 5;  // final이기에 안됨
//		B.b = 6;  // final이기에 안됨
	}
}