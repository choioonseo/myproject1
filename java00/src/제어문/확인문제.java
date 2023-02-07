package 제어문;

import javax.swing.JOptionPane;

public class 확인문제 {

	public static void main(String[] args) {

		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String what = JOptionPane.showInputDialog("수업 끝나고 뭐할껀가요?");
		
		String result = JOptionPane.showInputDialog("오늘"+ day +"에" + "수업 후 나는 " + what + "할 예정");

		System.out.println(result);
	}

}
