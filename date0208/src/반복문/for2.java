package 반복문;

import javax.swing.JOptionPane;

public class for2 {

	public static void main(String[] args) 
	{
		//for(초기값; 조건식; 증감식)
		for (; ; ) //무한 루프
		//while (true)도 무한루프임
	{
		System.out.println("잘 쓰지 않음");
		String data = JOptionPane.showInputDialog("종료할까요?");
		
		
		//==연산자는 기본데이터만 제공
		//string부품에서 제공하는 .equals()를 사용해서 비교
		if (data.equals("y"))
		{
			System.out.println("안녕히가세요");
			break; //for문의 break.
		}
		
		}
	}
}
