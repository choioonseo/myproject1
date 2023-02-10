package 복습;

public class 자바연산시주의점 {

	public static void main(String[] args) {
		//자바 연산할 떄 주의점
		int x = 20; //한줄 복사 : ctrl + alt + 화살표 아레
		int y = 30;
		
		System.out.println(x/y); 
		//각각의 변수는 ram에 저장, 연산은 cpu가 함
		//정수와 정수의 계산은 무조건 정수로 계산
		//계산시 하나라도 실수면 무조건 실수로 계산
		
		int x2 = 20;
		double y2 = 30; //30.0 = 30
		
		System.out.println(x2 / y2);
		
		
		//강제타입변환(강제형변환)
		//이미 정수로 저장된 값을 cpu가 가져다가 실수연산을 할때
		//cpu가 정수를 실수로 변환할 수 있음
		//->(강제로 바꾸고 싶은 타입)변수명
		System.out.println(x / (double)y);
		
		

	}
}
