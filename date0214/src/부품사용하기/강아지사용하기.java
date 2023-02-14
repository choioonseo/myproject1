package 부품사용하기;

import 부품만들기.강아지;
import 부품만들기.전화기;

public class 강아지사용하기 {
	
	public static void main(String[] args) {
		
		강아지 dog = new 강아지();
		dog.weight = 3.5;
		dog.height = 50.7;
		dog.배고프다();
		dog.심심하다();
		
		System.out.println("강아지의 무게는 " + dog.weight);
		System.out.println("강아지의 키는 " + dog.height);
		
		
		
		
	}
}

