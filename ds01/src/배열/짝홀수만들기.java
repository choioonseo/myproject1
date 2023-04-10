package 배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class 짝홀수만들기 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				sum = sum - i;
			}
			else {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}