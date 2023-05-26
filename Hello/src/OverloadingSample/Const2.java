package OverloadingSample;

class ConstructDirect2 {

	public String name;
	public String address;
	public int age;

	public ConstructDirect2(String name) {
		this.name = name;
	}

	public ConstructDirect2(String address, int age) {
		this.address = address;
		this.age = age;
	}
}

public class Const2 {
	public static void main(String[] args) {

		ConstructDirect2 ct1 = new ConstructDirect2("홍길동");
		System.out.println(ct1.name);
		
		ConstructDirect2 ct2 = new ConstructDirect2("서울시", 12);
		System.out.println(ct2. address);
		System.out.println(ct2. age);

	}

}
