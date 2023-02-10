package 배열응용;

import java.util.Random;

public class 수능 {

	public static void main(String[] args) {
		Random r = new Random();

		boolean flag = false;

		int[] a = new int[10000];

		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(451);
			System.out.println(i + ": " + a[i]);
		}
		
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == 450) {
				count++;

			}

			else if (a[i] == 0) {
				count2++;
			}
			

		}
		System.out.println("만점자인 사람은 + ");
		System.out.println("만점자 수는 " + count);
		System.out.println("0점의 수는 " + count2);
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			avg = sum / 10000;
		}
		System.out.println("평균은 " + avg);

		int count3 = 0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i] <= avg + 50) && (a[i] >= avg - 50)) {
				count3++;

			}

		}

		System.out.println("평균보다 +-50점 인 학생 수는 " + count3);

	}

}
