package 형변환;

import java.util.HashMap;

public class 사전문제 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		//map.put(키, 값)
		map.put("사과", "apple");
		map.put("멜론", "melon");
		map.put("물", "water");
		System.out.println(map);
		
		//사과와 짝을 이루는 값 출력
		System.out.println(map.get("사과"));
		//물 지우기
		map.remove("물");
		System.out.println(map);
		
		map.replace("멜론", "melons");
		System.out.println(map);

	}

}
