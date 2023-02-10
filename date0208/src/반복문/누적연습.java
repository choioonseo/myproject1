package 반복문;

import javax.swing.JOptionPane;

public class 누적연습 {

	public static void main(String[] args) {
		//iu = iu +1;
		//sum = sum + i
		
		
		//숫자 누적
		int sum = 0; //변수 초기화
		for (int i = 1; i <= 10000; i++) 
		{
			sum = sum + i; //sum++;와 동일
		}
		System.out.println("전체 합은 "+ sum);
		
		
		//글자 누적
		String sum2 = ""; //스트링의 초기값은 ""(빈공간)
		for (int i = 0; i < 3; i++) 
		{
			String data = JOptionPane.showInputDialog("가고 싶은 곳 입력");
			sum2 = sum2 + data + " ";
		}
		System.out.println(sum2);
	}

}
