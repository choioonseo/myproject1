package 배열응용;

import java.util.Scanner;

public class 여러개배열사용하기3 {

	public static void main(String[] args) {
		//작년에 가고 싶었던 곳 세곳을 입력(제주도, 양양, 속초)
		//올해 가고 싶었던 곳 세곳을 입력(제주도, 부산, 울산)
		Scanner sc = new Scanner(System.in);
		
		String[] data1 = new String[3];
		String[] data2 = new String[3];
		
		for (int i = 0; i < data1.length; i++) 
		{
			System.out.print("작년에 가고 싶었던 곳 세곳: ");
			data1[i] = sc.next();
		}
		

		for (int i = 0; i < data1.length; i++) 
		{
			System.out.print("올해 가고 싶었던 곳 세곳: ");
			data2[i] = sc.next();
		}
		
		
		int count = 0;
		
		for (int i = 0; i < data1.length; i++) 
		{
			if (data1[i].equals(data2[i])) 
			{
				count++;
			}
		}
		
		System.out.println(count + "곳");
	
		sc.close();
		
	}
}
