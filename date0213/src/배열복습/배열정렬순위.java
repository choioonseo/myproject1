package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬순위 {

	public static void main(String[] args) {
		//정렬을 할 때는 Arrays
		Random r = new Random(42);
		int[] jumsu = new int [10000];
		
		//for문: 입력, 출력, i(인덱스) 활용 가능
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1; //1~1000
		}
		
		//for-each: 알아서 위치값을 옮겨주면서 하나씩 꺼내욤
		//i(인덱스)가 필요없을 때 for문대신 자주 쓰임(출력용)
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		//정렬(sort) : 오름차순
		Arrays.sort(jumsu);//->파괴형 함수, jumsu가 바뀌어버림(원본 파괴)
		//cf) parseInt(n) ->비파괴형함수, ram에 저장된 n이라는 변수 자체가 바뀐 건 아님(원본 파괴X)
		
		System.out.println("------------------------");
		
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		//정렬후 최댓값, 최솟값 프린트
		System.out.println("최솟값: " + jumsu[0]);
		System.out.println("최댓값: " + jumsu[jumsu.length-1]);
		
		//상위30%, 인원 3000명
		int sum30 = 0;
		int sum_30 = 0;
		
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 = sum30 + jumsu[i];
			
		}
		for (int i = 0; i < 3000; i++) {
			sum_30 = sum_30 + jumsu[i];
			
		}
		

		//정렬(sort) : 오름차순
		Arrays.sort(jumsu);//->파괴형 함수, jumsu가 바뀌어버림(원본 파괴)
		//cf) parseInt(n) ->비파괴형함수, ram에 저장된 n이라는 변수 자체가 바뀐 건 아님(원본 파괴X)
		
		System.out.println("상위 30%의 평균: " + sum30 / 3000.0);
		System.out.println("하위 30%의 평균: " + sum_30 / 3000.0);
		
		String result = Arrays.toString(jumsu); //비파괴, 데이터를 string으로 나타냄 
		System.out.println(result);
		
	}
}
