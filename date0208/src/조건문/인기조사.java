package 조건문;

import javax.swing.JOptionPane;

public class 인기조사 {

	public static void main(String[] args) {
		//인기투표
		//1) 아이유 2) 유재석 3) BTS
		
		int a=0;
		int b=0;
		int c=0;
		
		for (int i = 0; i < 10; i++) 
		{
			String data = JOptionPane.showInputDialog("10명에게 인기투표를 해봅시다 1) 아이유 2) 유재석 3) BTS");
			
			if (data.equals("1"))
			{
				a++;
			}
			
			else if (data.equals("2"))
			{
				b++;
			}
			
			else if (data.equals("3"))
			{
				c++;
			}
		}
		
		System.out.println("아이유 " + a + "명");
		System.out.println("유재석 " + b + "명");
		System.out.println("BTS " + c + "명");
	}

}
