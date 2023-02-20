package 형변환;

import java.util.ArrayList;

public class 컬렉션테스트 {

	public static void main(String[] args) {
		// 많은 양의 데이터를 다루는 부품류를 콜렉션(collection)
		//많은 양의 데이터들도 특징이 있음, 그 특징에 따라 콜렋ㄴ의 종류가 많음
		//배열 + 사이즈 조절 + 타입 아무거나 넣을 수 있는 ArrayList
		
		ArrayList list = new ArrayList(); //list: 참조형변수(주소가 들어가있음)
		list.add("홍길동"); //.add: 컬렉션에 변수를 저장함
		list.add(100);
		list.add(11.2);
		list.add(true);
		
		//toString()이 재정의되어 있어서 가르키는 값들이 프린트됨.
		System.out.println(list);
		System.out.println(list.get(0)); //인덱스 하나를 꺼낼떄: get을 사용
		System.out.println(list.get(1)); //인덱스 하나를 꺼낼떄: get을 사용
		System.out.println(list.get(2)); //인덱스 하나를 꺼낼떄: get을 사용
		System.out.println(list.get(3)); //인덱스 하나를 꺼낼떄: get을 사용
		
		
		//중간에 삽입
		list.add(0, "김길동");
		System.out.println(list);
		
		//제거
		list.remove(0);//  =>파괴함수
		System.out.println(list);

		//파괴함수: 원본은 파괴버리는 함수(원본이 변경, ram에 있는 데이터 변경)
		//비파괴함수: 원본은 파괴되지 않는 함수(ram에 있는 데이터는 불변)
		
		//변경
		list.set(0, "정길동");
		System.out.println(list);
		
		int index = list.indexOf(true);
		System.out.println(index);
		
		//포함여부 확인
		boolean result = list.contains(11.2);
		System.out.println(result);

	}

}
