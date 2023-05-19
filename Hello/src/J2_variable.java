
public class J2_variable {

	public static void main(String[] args) {
		int a = 100;
		int b = (int) 200L; // 강제적형변환
		long c = 300;
		long d = 400l;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		
		char ca = 'a';
		char cb = 'b';
		// char cc = "c';  // ''이 아닌 ""로 하면 char로 인식 못함, ""는 String
		String cd = "c";
		
		System.out.println("ca = " + ca);
		System.out.println("cb = " + cb);
		System.out.println("cd = " + cd);
	}
}
