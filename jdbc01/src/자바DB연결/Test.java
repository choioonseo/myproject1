package 자바DB연결;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

public class Test {
	//부품은 기능을 처리하기 위해서 만든 부품
		//휴대폰의 기능 -> 함수(메서드)
		public void add2() {
			System.out.println("더하기 기능을 수행합니다.");
		}
		
		
		public int add(int x, int y) {
			return x + y;
		}

		public double add (double x, int y)
		{
			return x + y; //자바에서는 하나라도 double이면 무조건 결과는 double
			
		}
		
		
		public String add(String x, String y) {
			return x + y;
		}
		
		public String add(int x, String y) {
			return x + y;
		}
		
		public int[] add() { //x앞에 있는 타입 int[]를 써준다
			int[]x = {1, 2, 3};
			return x;
		}
		
		public Date getDate() {
			Date date = new Date();
			return date;
		}
		
		public Random getRandom() {
			Random r = new Random();
			return r;
		}
}