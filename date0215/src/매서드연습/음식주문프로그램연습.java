//미완성 마무리해야함


package 매서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식주문프로그램연습 {

	public static void main(String[] args) {

		Font font = new Font("궁서", 1, 30);

		JFrame f = new JFrame();
		f.setSize(500, 600);

		JLabel label1 = new JLabel("총 개수: ");
		label1.setFont(font);
		label1.setForeground(Color.black);
		
		
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("000.jpg");
		imgLabel.setIcon(icon);
		
		JLabel label2 = new JLabel("결제 금액: ");
		label1.setFont(font);
		label1.setForeground(Color.pink);
		
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.add(label1);
		
		f.add(imgLabel);
		f.add(label2);
		
		
		f.setVisible(true);

	}

}
