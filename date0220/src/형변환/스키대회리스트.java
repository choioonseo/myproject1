package 형변환;

import java.util.ArrayList;

public class 스키대회리스트 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		
		
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1) + ": 반칙하여 탈락함");
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.remove(1);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) +"등: " + list.get(i));
		}
			
			boolean result = list.contains("김연아");
			System.out.println(result);
			System.out.println(list.size());
			
			ArrayList list2 = new ArrayList();
			list2.add("이스키");
			list2.add("박스키");
			list2.add("양스키");
			list.addAll(list2); //비파괴형 함수
			System.out.println(list);
			
			System.out.println(list2.isEmpty());
		
			
	}

}
