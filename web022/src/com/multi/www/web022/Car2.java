package com.multi.www.web022;

public class Car2 {

	
	String color;
	int price;
	int speed;
	
	//하나만 제공하는 객체
	//static: 변수 하나만 만듦
	//public: 제공하는 car2를 아무데서나 쓸 수 있또록 함
	public static Car2 car2; 
	
	//싱글톤은 해당클래스에서 하나만 만들어서 제공 -> getInstance로 불러줌
	
	
	//static변수에는 하나만 들어가야 하므로
	//if문을 이용해서 car2에 값이 하나만 들어가도록 함
	
	public static Car2 getInstance() {
		if (car2 == null) {
			car2 = new Car2("빨강", 100, 110);
		}
	
		return car2;
	}
	
	public void run() {
		System.out.println("달리자");
	}
	
	private Car2(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}

	
	
}
