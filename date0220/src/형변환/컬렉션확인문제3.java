package 형변환;

import java.util.ArrayList;

public class 컬렉션확인문제3 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("공부");
		list.add("운동");
		list.add("피부과");
		list.add("청소");
		list.add("잠");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		
		list.set(1, "청소");
		System.out.println(list);
	
		
	}

}
