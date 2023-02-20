package 형변환;

import java.util.HashMap;

public class 컬렉션확인문제2 {

	public static void main(String[] args) {
		HashMap things = new HashMap();
		things.put("안방", "TV");
		things.put("거실", "쇼파");
		things.put("부엌", "냉장고");
		things.put("현관", "신발");
		System.out.println(things);
		
		System.out.println(things.get("현관"));
		
		things.replace("거실", "책상");
		System.out.println(things);
	}

}
