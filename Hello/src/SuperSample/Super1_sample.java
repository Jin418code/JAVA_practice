package SuperSample;

class AAA {

	int num = 2500;
}

class BBB extends AAA {

	int num = 500; 

	public void number() {
		int sum = 0, i = 100, j = 200;
		System.out.println("AAA number : " + super.num);  // 2500
		System.out.println("BBB number : " + sum);  // 300
		System.out.println("BBB number : " + this.num);  //500
	}
}

class CCC extends BBB {

	int num = 3000;
	
	public void number2() {
		int sum = 0, i = 300, j = 400;
		sum = i + j;
		System.out.println("BBB number : " + super.num);  // 500
		System.out.println("CCC number : " + sum);  // 700
		System.out.println("CCC number : " + this.num);  // 3000

	}
}

public class Super1_sample {

	public static void main(String[] args) {
		CCC ccc = new CCC();
		ccc.number2();  // BBB number : 500 / CCC number : 700 / CCC number : 3000
		ccc.number();  // AAA number : 2500 / BBB number : 0 / BBB number : 500
		
		// 객체형변환 참조
		BBB ccc2 = ccc;
		AAA ccc3 = ccc2;
		AAA ccc4 = ccc;
		
		System.out.println("CCC refernece : " + ccc.num);  // CCC refernece : 3000
		System.out.println("BBB reference : " + ccc2.num);  // BBB reference : 500
		System.out.println("AAA reference : " + ccc3.num);  // AAA reference : 2500
		System.out.println("AAA reference : " + ccc4.num);  // AAA reference : 2500
	}
}
