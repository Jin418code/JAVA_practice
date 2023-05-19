class J4_SansuStatic1 {
	public static final int MAN = 1;
	public static final int WOMAN = 2;
}

public class J4_SansuStatic {
	public final static int MEN = 3;
	public final static int WOMEN = 4;

	public static void main(String[] args) {
		int people1 = WOMEN;
		switch (people1) {
		case 3:
			System.out.println("남자");
			break;
		case 4:
			System.out.println("여자");
			break;
		}
		
      //int SansuStatic.WOMAN=4; 상수에 assign 못함
		int people2 = J4_SansuStatic1.WOMAN;
		switch (people2) {
		case 1:
			System.out.println("남자");
			break;
		case 2:
			System.out.println("여자");
			break;
		}

	}
}