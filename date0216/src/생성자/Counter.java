package 생성자;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Counter {
	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		
		Font font = new Font("궁서", 1, 30);
		
		
		JLabel number = new JLabel();
		number.setFont(font);
		number.setForeground(Color.pink);
		number.setBackground(Color.white);
		
		
		JButton b1 = new JButton("1 더하기");
		JButton b2 = new JButton("0으로 초기화");
		JButton b3 = new JButton("1 빼기");
		b1.setForeground(Color.pink);
		b1.setBackground(Color.GRAY);
		b2.setForeground(Color.pink);
		b2.setBackground(Color.GRAY);
		b3.setForeground(Color.pink);
		b3.setBackground(Color.GRAY);
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count + "");
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + "");
				
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count + "");
				
			}
		});
		
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(number);
		
		f.setVisible(true);
		
		
	}

}
