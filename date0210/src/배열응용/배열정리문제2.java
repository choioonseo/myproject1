package 배열응용;

import java.util.Scanner;

public class 배열정리문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] data = new int[5];

		for (int i = 0; i < data.length; i++) {
			System.out.println("숫자 입력<< ");
			data[i] = sc.nextInt();
		}

		System.out.println("첫번째값과 세번째 값의 합은 " + (data[0] + data[2]));

		// 2. 문자열을 입력받아서 배열에 넣자.
		String[] words = new String[3];
		for (int i = 0; i < words.length; i++) {
			System.out.print("과목입력>> ");
			words[i] = sc.next();
		}
		System.out.println(words[0] + "보다는 " + words[1]);
		sc.close();
	}
}
