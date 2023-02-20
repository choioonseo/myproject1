package 형변환;

import java.util.HashSet;

public class 로또문제 {

	public static void main(String[] args) {
		//순서 없이 무작위 출력
		
		HashSet bag = new HashSet();
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("지갑");
		System.out.println(bag);
		
		//볼펜이 이미 있으므로 add를 해도 추가되지 않음
		//중복은 제거가 됨
		bag.add("볼펜");
		System.out.println(bag);
		

	}

}
