package 조건문;

import javax.swing.JOptionPane;

public class 설문조사 {

	public static void main(String[] args) {
	 //10명에게 배부른지 물어보자
		//배부르다: n명, 안 부르다: m명
		
		int full =0;
		int noFull = 0;
		
		for (int i = 0; i < 10; i++) 
		{
			String data = JOptionPane.showInputDialog("배부른가요? 1)배부름 2)안 배부름");
			
			if (data.equals("1"))
			{
				full = full +1; //full++;와 같음
			}
			
			else if (data.equals("2"))
			{
				noFull++;
			}
		}//for
		System.out.println("배부른 사람 몇명?" + full + "명");
		System.out.println("안배부른 사람 몇명?" + noFull + "명");

	}

}
