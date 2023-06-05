package CollectionFramework;

import java.util.Scanner;
import java.util.TreeSet;

/* 
 * [문제] 3명의 성적을 입력 받아서 최고점수와 최고점수를 받은 사람의 이름을 출력하세요
 * TreeSet: 입력과 상관없이 데이터를 크기순으로 정렬
 * compareTo method를 적용하여 비교하세요
 */

class inputData {
	Scanner sc = new Scanner(System.in);
    TreeSet<String> names = new TreeSet<>();
    TreeSet<Integer> ages = new TreeSet<>();
    
	String name = null;
	int grade = 0;

	public void input() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("이름을 입력하세요");
			name = sc.nextLine();
			System.out.println("성적을 입력하세요");
			grade = sc.nextInt();
		}
	}
}

public class CollectionFramework_Question2_M {

	public static void main(String[] args) {

	}
}
