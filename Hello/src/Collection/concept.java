package Collection;

import java.util.Stack;

/* Set : 순서가 없고 데이터 중복 불허용
 * - HashSet : 속도가 아주 빠름.
 * - TreeSet : 정렬
 * [소수의 집합, 양의 정수 집합 등]
 * 
 * 
 * List : 순서가 있고 데이터 중복 허용 
 * - Vector : threadSafe 개념을 도입하면 속도가 느려짐.
 * - Stack : LIFO(Last In First Out, 후입선출)
 *   - StackPointer : 증가는 top +1, 감소는 top -1 / 데이터가 입력되어 있는 위치를 알 수 있다.
 * - ArrayList : threadSage 개념을 도입하지 않아서 속도가 빠름.
 * - LinkedList : Link(Thread)를 사용하여 node 연결을 사용
 * 
 * 
 * Map : key/value 쌍으로 구성
 * - HashMap, TreeMap, HashTable, Properties...
 */
public class concept {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("홍길동");
		stack.push("김규민");
		stack.push("최성현");
		
		System.out.println(stack.size());  // 3
		
		stack.push("박수연");
		stack.push("최세진");
		
		System.out.println(stack.size());  // 5
		
		stack.pop();
		System.out.println(stack);  // [홍길동, 김규민, 최성현, 박수연] 
		                            // 마지막에 들어간 데이터(최세진)이 먼저 나감
		
		while(!stack.isEmpty()) {
			System.out.println(stack.size() + " : " + stack.pop());
		}
		/* 4 : 박수연 
		 * 3 : 최성현 
		 * 2 : 김규민 
		 * 1 : 홍길동  */
		
		System.out.println(stack.size());  // 0

	}

}
