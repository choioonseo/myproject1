package 조건문;

import java.util.Scanner;

public class 콘솔입력5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과 구매 갯수를 입력하세요 ");
		double appleNum = sc.nextDouble();
		
		System.out.print("사과 한 개당 가격을 입력하세요 ");
		double apple = sc.nextDouble();
		
		System.out.print("딸기 구매 갯수를 입력하세요 ");
		double strawNum = sc.nextDouble();
		
		System.out.print("딸기 한 개당 가격을 입력하세요 ");
		double straw = sc.nextDouble();
		
		double appleTotal = appleNum * apple;
		double strawTotal = strawNum * straw;
		double Total = appleTotal + strawTotal;
		
		
		System.out.println("사과 구매 가격은 "+ appleTotal + "입니다" );
		System.out.println("딸기 구매 가격은 "+ strawTotal + "입니다" );
		System.out.println("전체 구매 가격은 "+ Total + "입니다" );
		
		sc.close();
	}
}





