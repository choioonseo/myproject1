package 배열;

import java.util.Scanner;

public class 정리문제1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = {55, 66, 77, 22, 33};
		int min = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if((a[i]) < min)
			{
				min = a[i];
			}
		}
		System.out.println(min);
	}
	
}
