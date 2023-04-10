package 배열;

import java.util.Random;
import java.util.Scanner;

public class 정리문제2 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int[] a = new int[20];
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(900);
		}
		
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			
		}
			System.out.println(max);
		}
	
}
