package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) 
	{
		int[] jumsu2 = new int[1000];
		
		Random r = new Random();
		
		//2부터 20까지 임의로 만들어서 배열만들기
		//전체 프린트하기
		
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19) + 2; //2부터 20까지
		}
		
		for (int x : jumsu2) 
		{
			System.out.println(x);
		}
		
		//3인상인 숫자 몇개인지 프린트
		int count = 0;
		int sum = 0;
		
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu2[i] >= 15) 
			{
				count++; //count = count +1;
				sum = sum + jumsu2[i];
			}	
		}
		
		System.out.println("15이상인 갯수는" + count + "개 입니다");
		System.out.println("15이상인 값의 합은" + sum + "입니다");
		
	}

}
