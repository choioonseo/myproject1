package 조건문;

import java.util.Scanner;

public class 콘솔입력2 {

	public static void main(String[] args) {
		//Scanner라는 부품
		
		Scanner sc = new Scanner(System.in); //컴퓨터의 키보트
		
		System.out.println("나에 대한 정보");
		System.out.println("-------------");
		System.out.print("이름 입력 ");
		String data1 = sc.next(); //한단어 
		
		System.out.print("나이 입력 ");
		String data2 = sc.next();
		
		System.out.print("취미 입력 ");
		String data3 = sc.next();
		
		
		System.out.println("-------------");
		System.out.println("나의 이름은 " + data1);
		System.out.println("나의 나이은 " + data2);
		System.out.println("나의 취미는 " + data3);
		
		sc.close();
	}
}