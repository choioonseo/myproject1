package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		
		
		//JOptionPane. : 창을 띄우는 문법
		String sports = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String day = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");
		
		String result = (day + "에 " + sports + " 합니다.");
		
		System.out.println(result);
		
		
	}
}

