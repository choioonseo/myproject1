package 조건문;

import java.util.Scanner;

public class 콘솔입력1 {

	public static void main(String[] args) {
		//Scanner라는 부품
		
		Scanner sc = new Scanner(System.in); //컴퓨터의 키보트
		
		//자바프로그램과 콘솔 간에 연결 통호를 만든다.
		//연결 통로 == 강물 (스트림, Stream)
		//Stream은 내가 닫아주지 않으면 계쏙 실행됨.
		//멈추고 싶으면 sc.close(); 사용
		System.out.print("요일 입력: 주중 1)  주말 2)");
		int data = sc.nextInt(); //String->int
		
		if (data == 1) {
			System.out.println("열심히 달리자.");
		}else {
			System.out.println("푹~~쉬자.");
		}
		
		System.out.print("주말에 뭐할까?");
		String data2 = sc.next(); //단어
		System.out.println("나는 주말에" + data2 + "를 할꺼야");
		
		
		sc.close();
	}

}
