package Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

// p627 [배열과 리스트의 비교]ㅓ

//public class L17 {
//
//	public static void main(String[] args) {
//		
//		// 배열
//		String[] array = new String[] {"가", "나", "다", "라", "마", "바", "사"};
//		System.out.println(array.length);  // 7
//		array[2] = null;
//		array[5] = null;
//		System.out.println(array.length);  // 7
//		System.out.println(Arrays.toString(array));  // [가, 나, null, 라, 마, null, 사]
//		System.out.println();
//		
//		// 리스트
//		List<String> aList = new ArrayList<>();
//		System.out.println(aList.size());  // 0     // 데이터의 개수 구하기  
//		aList.add("가");
//		aList.add("나");
//		aList.add("다");
//		aList.add("라");
//		aList.add("마");
//		aList.add("바");
//		aList.add("사");
//		System.out.println(aList.size());  // 7     // 데이터의 개수 구하기
//		aList.remove("다");
//		aList.remove("바");
//		System.out.println();
//		System.out.println(aList);  //[가, 나, 라, 마, 사]     // 데이터의 개수 구하기
//	}
//}

// p636 ArrayList<E> 클래스의 주요 메서드 활용 방법
//
//public class L17 {
//	public static void main(String[] args) {
//		
//		List<Integer> aList1 = new ArrayList<Integer>();
//		
//		// 1. add(E element)
//		aList1.add(3);
//		aList1.add(4);
//		aList1.add(5);
//		System.out.println(aList1.toString());  // [3, 4, 5]
//		System.out.println("1==============");
//		
//		// 2. add(int index, E element)
//		aList1.add(1, 6);
//		System.out.println(aList1.toString());
//		System.out.println("2==============");  // [3, 6, 4, 5]
//		
//		// 3. addAll(또 다른 리스트 객체)
//		List<Integer> aList2 = new ArrayList<>();
//		aList2.add(1);
//		aList2.add(2);
//		aList2.addAll(aList1);
//		System.out.println(aList2);  // [1, 2, 3, 6, 4, 5]
//		System.out.println("3==============");
//		
//		// 4. addAll(int index, 또 다른 리스트 객체)
//		List<Integer> aList3 = new ArrayList<>();
//		aList3.add(1);
//		aList3.add(2);
//		aList3.addAll(1, aList3);
//		System.out.println(aList3);  // [1, 1, 2, 2]
//		System.out.println("4==============");
//		
//		// 5. set(int index, 또 다른 리스트 객체)
//		aList3.set(1, 5);
//		aList3.set(3, 6);
//		System.out.println(aList3);  // [1, 5, 2, 6]
//		System.out.println("5==============");
//		
//		// 6. remove(int index)
//		aList3.remove(1);  // 1번 인덱스를 삭제
//		System.out.println(aList3);  // [1, 2, 6]
//		System.out.println("6==============");
//		
//		// 7. remove(Object 0)
//		aList3.remove(new Integer(2));
//		System.out.println(aList3);  // [1, 6]
//		System.out.println("7==============");
//		
//		// 8. clear()
//		aList3.clear();
//		System.out.println(aList3);  // []
//		System.out.println("8==============");
//		
//		// 9. isEmpty()
//		System.out.println(aList3.isEmpty());  // true
//		System.out.println("9==============");
//		
//		// 10. size()
//		System.out.println(aList3.size());  // 0
//		aList3.add(1);
//		aList3.add(2);
//		aList3.add(3);
//		System.out.println(aList3);  // [1, 2, 3]
//		System.out.println(aList3.size());  // 3
//		System.out.println("10==============");
//		
//		// 11. get(int index)
//		System.out.println("0번째 : " + aList3.get(0));
//		System.out.println("1번째 : " + aList3.get(1));
//		System.out.println("2번째 : " + aList3.get(2));
//		for(int i = 0; i < aList3.size(); i++) {  // 0번째 : 1 / 1번째 : 2 / 2번째 : 3  // 0번째 : 1 / 1번째 : 2 / 2번째 : 3
//			System.out.println(i + "번째 : "+ aList3.get(i));
//		}
//		System.out.println("11==============");
//		
//		// 12. toArray() List -> Array
//
//	}
//}

// p670 [TreeSet<E> 클래스의 주요 메서드 활용 방법]
//public class L17 {
//	public static void main(String[] args) {
//		TreeSet<Integer> treeSet = new TreeSet<>();
//		for(int i = 50; i > 0; i -= 2) {
//			treeSet.add(i);
//		}
//		System.out.println(treeSet.toString());  // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]
//		
//		// 1. first()
//		System.out.println(treeSet.first());  // 2
//		
//		// 2. last()
//		System.out.println(treeSet.last());  // 50
//		
//		// 3. lower(E element)
//		System.out.println(treeSet.lower(26));  // 24
//		
//		// 4. higher(E element)
//		System.out.println(treeSet.higher(25));  // 26
//		
//		// 5. floor(E element)
//		System.out.println(treeSet.floor(25));  // 24
//		System.out.println(treeSet.floor(26));  // 26
//		
//		// 6. ceiling(E element)
//		System.out.println(treeSet.ceiling(25));  // 26
//		System.out.println(treeSet.ceiling(26));  // 26
//		System.out.println("================");
//		
//		// 7. pollFirst()
//		int treeSetSize = treeSet.size();   
//		System.out.println(treeSetSize);  // 25
//		for(int i = 0; i < treeSetSize; i++) {
//			System.out.println(treeSet.pollFirst() + " "); // 2, 4, 6, 8 ... 50
//		}
//		System.out.println();
//		System.out.println(treeSet.size());  // 0  // 작은 것부터 리턴시킴
//		
//		// 8. pollLast()
//		for(int i = 50; i > 0; i -= 2) {
//			treeSet.add(i);
//		}
//		treeSetSize = treeSet.size();
//		for(int i = 0; i < treeSetSize; i++) {
//			System.out.println(treeSet.pollLast() + " ");  // 50, 48, 46 ... 2
//		}
//		System.out.println(treeSet.size());  // 0 // 큰 것부터 리턴시킴
//		
//		// 9. SortedSet<E> headSet(E element)
//		for(int i = 50; i > 0; i -= 2) {
//			treeSet.add(i);
//		}
//		
//		
//		
//	}
//}

// p677 [사용자 클래스의 크기 비교 기준 제공 및 TreeSet<E> 데이터로의 활용]

class MyClass {
	int data1;
	int data2;

	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}

abstract class MyComparableClass implements Comparable<MyComparableClass> {
	
	int dataIn;
}