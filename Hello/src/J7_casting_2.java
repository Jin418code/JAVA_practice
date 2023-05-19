public class J7_casting_2 {
	public static void main(String[] args) {
		char cc = 'ㄱ';
		System.out.println(cc); // char를 찍자
		System.out.println((int) cc); // int로 형변환

		cc = 'A';
		System.out.println(cc); // char를 찍자
		System.out.println((int) cc); // int로 형변환

		cc = 'B';
		System.out.println(cc); // char를 찍자
		System.out.println((int) cc); // int로 형변환

		System.out.println("-------------------");

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + ": " + (char) i + " ");
			// (char)i => int
			if ((i % 10 == 0)) { // 0으로 나눠떨어지는가?
				System.out.println(); // 한칸 내려라
			}
		}

	}
}