package 조건문;

import java.util.Scanner;

public class 콘솔입력4 {

	public static void main(String[] args) {
		//Scanner라는 부품
		
		Scanner sc = new Scanner(System.in); //컴퓨터의 키보트
		
		
		System.out.print("id를 입력해 주세요 ");
		String id = "root";
		String pw = "1234";
		
		String data1 = sc.next(); //단어
		
		System.out.print("패스워드를 입력해 주세요 ");
		String data2 = sc.next();
		
		if(data1.equals(id) && data2.equals(pw))
		{
			System.out.println("로그인 성공");
		}
		else
			System.out.println("로그인 실패");
		
		
		
		sc.close();
	}
}