package 순차문;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class 계산기부품만들기 {
	public static void main(String[] args) 
	{
		// JFrame, ImageIcon, JLabel 3개
				
		
		JFrame f = new JFrame();
		f.setSize(300, 500);
		
		ImageIcon icon = new ImageIcon("010.png");
		JLabel label1 = new JLabel();
	
		
		JLabel labe2 = new JLabel();
		JLabel labe3 = new JLabel();
		
		// JTextField 2개
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		
		
		// Font, FlowLayout
		Font font = new Font("굴림", 1, 20);
		FlowLayout flow = new FlowLayout();
		
		
		// JButton
		JButton b = new JButton();
		
		
		f.add(b);
		
		//출력, 프레임 보여주세요
		f.setVisible(true);
		
		
		
	}
}