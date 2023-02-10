package 반복문;

import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매좌석만들기 {

	public static void main(String[] args) {
		Frame f = new JFrame();
		f.setSize(1000, 500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		for (int i = 0; i < 100; i++) 
		{
			JButton b = new JButton("나는 버튼");
			f.add(b);
		}
		
		f.setVisible(true);
	}
}
