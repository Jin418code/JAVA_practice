package CollectionFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Random;

/* 
 * lotto 복권 6자리 만들기
 * ArrayList
 * HashSet : 중복허용 안함
 */


public class CollectionFramework_Question1_M {
	
	public static void main(String[] args) {
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while (lotto.size() <= 6) {
			lotto.add((int) (Math.random() * 45) + 1);
		}
		
		List<Integer> list = new LinkedList<Integer>(lotto);  // HashSet 값을 정렬하기 위해 list로 담음
		Collections.sort(list);  // 정렬
		System.out.println(list);
	}
}
