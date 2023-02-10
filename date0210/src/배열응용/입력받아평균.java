package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러번 여러 개 받아서 저장 공간에 넣고 싶을때 -> 배열 사용
		//1. 배열을 만들어주세요
		int[] jumsu = new int [5];
		
		//배열에 값을 넣을 때에는 index 필요 -> i가 있는 for문 사용
		for (int i = 0; i < jumsu.length; i++) 
		{
			String data = JOptionPane.showInputDialog("숫자 입력");
			//숫자로 변환한 값을 배열의 해당 인덱스 값에 넣음
			jumsu[i] = Integer.parseInt(data);
		}
			
			for (int x : jumsu) {
				System.out.println(x + " ");
			}
			
			
			int sum = 0;
			int avg = 0;

			for (int i = 0; i < jumsu.length; i++) {
				sum = sum + jumsu[i];
			}
			//for (int x : jumsu) {
				//sum = sum + x;
			//}
			
			
			avg = sum / 5;
			
			System.out.println(avg);
		
			
			//300이상되는 숫자만 찾아서 합계구하기
			int sum2 = 0;
			
			for (int i = 0; i < jumsu.length; i++)
			{
				if (jumsu[i] >= 300) 
				{
					sum2 = sum2 + jumsu[i];
				}
				System.out.println(sum2);
			}
			
			//3. 심화문제, 300이상 되는 위치인 index를 프린트
			//==> 해당 인덱스의 값이 300이상인지 조건 체크 --> i를 프린트
			for (int i = 0; i < jumsu.length; i++) {
				if(jumsu[i] >= 300) {
					//특정한 index에 있는 값이 300이상인 위치를 프린트해보세요.
					System.out.println("300인 값이 저장된 인덱스 : " + i);
				}
			}
			
		
}
}