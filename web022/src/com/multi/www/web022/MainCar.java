package com.multi.www.web022;

public class MainCar {

	public static void main(String[] args) {
		
		Car car = new Car("빨강", 10, 200); //12바이트 (4*3)
		Car car2 = new Car("파랑", 20, 250); 
		Car car3 = new Car("검정", 30, 300);

		System.out.println(car);
		System.out.println(car2);
		System.out.println(car3);
	}

}
