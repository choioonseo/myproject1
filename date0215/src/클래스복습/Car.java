package 클래스복습;

public class Car {
	//성질: 변수로 구현, 멤버변수
	String color; //멤버변수는 해당변수를 포함하는 {}안에서 생존가능 ->전역변수
					//전역변수는 자동초기화를 해줌 cf)참조형: null로 초기화
	
	//동작: 기능, 멤버매서드, 함수(메서드, 방법)
	
	
	public void run() {
		//메서드 -> 달리다 라는 기능이 어떤 방법으로 달릴지를 써주면 됨
		System.out.println("부릉부릉 달리다!");
	}
	
	public void up() {
		System.out.println("미친듯이 속도 up");
	}
	
}
