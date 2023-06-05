package Book;

// p599 [일반 클래스의 내부에 포함되는 제네릭 메서드]

//class GenericMethods{
//	public <T> T method1(T t) {
//		return t;
//	}
//	
//	public <T> boolean method2(T t1, T t2) {
//		return t1.equals(t2);
//	}
//	
//	public <K, V> void method3(K k, V v) {
//		System.out.println(k + ":" + v);
//	}
//}
//
//public class L16 {
//
//	public static void main(String[] args) {
//
//		GenericMethods gm = new GenericMethods();
//		
//		String str1 = gm.<String>method1("안녕");
//		String str2 = gm.method1("안녕");
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		boolean bool1 = gm.<Double>method2(2.5, 2.5);
//		boolean bool2 = gm.method2(2.5, 2.5);
//		System.out.println(bool1);
//		System.out.println(bool2);
//		
//		gm.<String, Integer>method3("국어", 80);
//		gm.method3("국어", 80);
//	}
//
//}

// p613 [제네릭 클래스의 상속]

class Parents<T> {
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Child1<T> extends Parents<T> {

}

class Child2<T, V> extends Parents<T> {
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
}

public class L16 {
	public static void main(String[] args) {

		// 부모 제네릭 클래스
		Parents<String> p = new Parents<>();
		p.setT("부모 제네릭 클래스");
		System.out.println(p.getT());
		
		// 자식 클래스1
		Child1<String> c1 = new Child1<>();
		c1.setT("자식 1 제네릭 클래스");
		System.out.println(c1.getT());
		
		// 자식 클래스2
		Child2<String, Integer> c2 = new Child2<>();
		c2.setT("자식 2 제네릭 클래스");
		c2.setV(100);
		System.out.println(c2.getT());
		System.out.println(c2.getV());
	}
}