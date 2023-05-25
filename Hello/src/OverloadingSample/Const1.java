package OverloadingSample;

class ConstructDirect {
	public String name;
	public String address;
	public int age;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public ConstructDirect(String sname, String saddress, int sage) {
		this.name = sname;
		this.address = saddress;
		this.age = sage;
	}

}

public class Const1 {
	public static void main(String[] args) {
		
		ConstructDirect ct = new ConstructDirect("홍길동", "서울시 중구", 25);
		
		System.out.println(ct.name + " / " + ct.address + " / " + ct.age);
	}
	
}
