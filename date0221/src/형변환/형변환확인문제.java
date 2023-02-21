package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		
		me.add(1000); //int -> Integer -> Object
		me.add(189.1); //double -> double -> Object
		me.add(false); // boolean -> Boolean -> Object
		me.add('남'); // char ->character -> Object
		System.out.println(me);
		//ArrayList는 toString()가 재정의
		//list라는 참조형이기 때문에 list를 프린트하면 주소가 프린트됨
		//toString()이 재정의한 내용은 주소가 가르키는 값들을 String으로 만들어주도록 정의함.
		//list를 찍어보면 주소 대신 String으로 만든 내용이 출력됨
		
		int money = (int)me.get(0) + 2000;
		double height = (double)me.get(1) + 10;
		boolean result = (boolean)me.get(2);
		char who = (char)me.get(3);
		
		System.out.println(money);
		System.out.println(height);
		
		if (result) {
			//result가 boolean인 경우에는 result == true라고 하지 않아도 됨.
			System.out.println("아침을 먹었어요.");			
		}
		else
		{
			System.out.println("배고파요.");
		}

	
		if (who == '남') {
			System.out.println("주민번호는 1, 3이에요.");
		}
		else
		{
			System.out.println("주민번호는 2, 4예요.");
		}
		
	}

}
