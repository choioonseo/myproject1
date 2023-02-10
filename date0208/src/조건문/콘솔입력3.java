package 조건문;

import java.util.Scanner;

public class 콘솔입력3 {

	public static void main(String[] args) {
		//Scanner라는 부품
		
		Scanner sc = new Scanner(System.in); //컴퓨터의 키보트
		
		
		System.out.print("나의 이름은 ?");
		String data1 = sc.next(); //단어
		
		System.out.print("키는? ");
		double data2 = sc.nextDouble(); //단어
		
		System.out.print("몸무게는? ");
		double data3 = sc.nextDouble(); //단어
		
		System.out.print("저녁을 먹었나요?(true/false) ");
		boolean data4 = sc.nextBoolean(); //단어
		
		System.out.println("좌우명은? ");
		sc.nextLine(); //enter 들어갈 자리
		//엔터를 치면 좌우명의 string값이 입력되어서 프로그램 종료를 방지
		String data5 = sc.nextLine(); //단어
		
		
		System.out.println("-------------");
		System.out.println("나의 이름은 " + data1 + "입니다.");
		System.out.println("나의 키는 " + data2 + "입니다.");
		System.out.println("나의 몸무게는 " + data3 + "입니다.");
		System.out.println("나는 저녁을 " + data4 + "했습니다.");
		System.out.println("나의 좌우명 " + data5 + "입니다.");
		
		sc.close();
	}
}