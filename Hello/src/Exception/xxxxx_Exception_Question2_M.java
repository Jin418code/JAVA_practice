package Exception;

import java.util.Random;

/* 문제> 로또 복권을 추첨합니다.
 *     복권이 중복되지 않도록 출력하세요. 
 *     
 * 조건> 1.Random 클래스 적용 	 
 	    2.예외처리를 적용
 	    3.중복되지 않아야 합니다.
 	    4.범위: 1 ~ 45
 	    
 	    1. 배열에 Random한 숫자 7개를 넣기
 	    2. 배열에 같은 숫자가 들어갈 경우 예외 처리
 */

public class xxxxx_Exception_Question2_M {

	public static void main(String[] args) {

		int n = 0;
		int[] lotto = new int[n];

		for (int i = 0; i < 45; i++) {
			int randomNum = (int)((Math.random() * 45) + 1);
			if (randomNum == lotto[n]) {
				System.out.println("stop");
			}
			System.out.println(randomNum);
		}

	}
}