package OOP;

/*
 * 멤버변수 = 클래스 변수 = 전역 변수
 * 
 */
public class TestReference {

	private String name;
	private String telephone;
	private int age;

	public void setName(String str) {
		name = str;
	}

	public void setTelephone(String tel) {
		telephone = tel;
	}

	public void setAge(int old) {
		age = old;
	}

	public String getName() {	
		return name;
	}

	public String getTelephone() {
		
		return telephone;
	}

	public int getAge() {
	
		return age;
	}

}
