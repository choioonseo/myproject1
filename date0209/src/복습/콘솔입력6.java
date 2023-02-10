package 복습;

import java.util.Scanner;

public class 콘솔입력6 {

	public static void main(String[] args) {
		//시작값, 종료값 입력
		//시작갑ㄱ부터 종료값까지 모두 더해서 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작값>> "); //1, 1000
		int start = sc.nextInt();
		System.out.print("종료값>> "); //10, 2000
		int end = sc.nextInt();
		
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println("최종 더한 값은 " + sum);
		
	}

}
