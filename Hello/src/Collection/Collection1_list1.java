package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection1_list1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("lee");  // index 0 
		list.clear();  // 모두 제거
		list.add("cho");
		list.add("kim");
		list.add("chung");
		list.add("min");
		list.add("chung");
//		System.out.println(list.size()); // 5
//		System.out.println(list.contains("chung"));  // true

		list.remove("kim");
		list.remove(3);
//		System.out.println(list.size());  // 3
//		System.out.println(list.indexOf("min"));  // 2

		print(list);
		print(list.toArray());
		List<String> sublist = list.subList(0, 2);
		print(sublist);
		printGet(list);

	}

	public static void print(List<String> set) {
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			Object str = iter.next();
			System.out.println();
		}
	}

	public static void print(Object[] obj) {
		int count = obj.length;
		for (int i = 0; i < count; i++) {
			System.out.println(obj[i]);
		}
	}

	public static void printGet(List<String> set) {
		int count = set.size();
		for(int i = 0; i < count; i++) {
			System.out.println(set.get(i));
			// String str = (String)set.get(i)
		}
	}
}