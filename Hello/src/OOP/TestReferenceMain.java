package OOP;

/* reference = vale, reference(adderss value)
 * object = instance = reference variable = reference 
 * 
 * TestReference : 1000번지라고 가정
 * hong : 1000번지를 가리킨다라거나 기억한다고 말한다
 * 
 * setName : 1004번지 주소로 => 홍길동 저장
 * setTelephone : 1010번지 주소로 => 010-1234-5678 저장
 * setAge :1024번지 주소로 => 25 저장
 * 
 * 
 * getName : 저장된 내용중에서 이름을 불러오기(출력)
 * getTelephone : 저장된 내용중에서 전화번호를 불러오기
 * getAge : 저장된 내용중에서 나이 불러오기
 */


public class TestReferenceMain {

	public static void main(String[] args) {
		TestReference hong = new TestReference();
		TestReference kim = new TestReference();
		
		
		// setXXX = 
		hong.setName("홍길동");
		hong.setTelephone("010-1234-1234");
		hong.setAge(25);
		
		System.out.println("이름은 " + hong.getName());
		System.out.println("전화번호는 " + hong.getTelephone());
		System.out.println("나이는 " + hong.getAge());
		
		kim.setName("김씨");
		kim.setTelephone("010-3333-3333");
		kim.setAge(33);
		
		System.out.println("이름은 " + kim.getName());
		System.out.println("전화번호는 " + kim.getTelephone());
		System.out.println("나이는 " + kim.getAge());
		
	}
}
