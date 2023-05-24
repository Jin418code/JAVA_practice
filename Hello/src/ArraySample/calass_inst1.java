package ArraySample;

 public	class calass_inst1 {
		public static void main(String[] args) {
			
			Person2 brother = new Person2();
			// brother라는 객체의 주소는 12345번지
			// 담고 있는 정보의 주소는 Person의 5000번지
			
			brother.age = 100;
			brother.height = 170;
			brother.weight = 67;
			
			System.out.println("age : " + brother.age);
			System.out.println("height : " + brother.height);
			System.out.println("weight : " + brother.weight);
		}
		
 }
 
 class Person2 {  // 5000번지
		// field area : class variable
		public int age;  // 0
		public long height;  // 0
		public float weight;  // 0
	}


