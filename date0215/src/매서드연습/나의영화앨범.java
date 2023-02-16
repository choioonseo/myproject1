package 매서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의영화앨범 {
	
	
	static int index = 2; //현재 2부터 시작

	public static void main(String[] args) {

		
		String[] title = {"타이타닉", "다음소희", "우리 사랑이 향기로 남을때", "안녕 소중한 사람", "트윈"};
		String[] img = {"001.jpg", "002.jpg", "003.jpg", "004.jpg", "005.jpg"};
		double[] jumsu = {9.28, 9.72, 8.82, 6.62, 8.85};
		
		JFrame f = new JFrame();
		f.setSize(320, 230);
		f.getContentPane().setBackground(Color.black);
		
		Font font = new Font("궁서", Font.BOLD, 20); //객체생성를 하는데, 특정한 입력값을 넣지 않으면 못만들게 할 수 있음
		Font font2 = new Font("궁서", Font.BOLD, 25); 
		
		//배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 셋팅
		//BorderLayout
		JLabel top = new JLabel(title[2]);
		top.setHorizontalAlignment(0);
		top.setForeground(Color.pink);
		top.setFont(font);
		f.add(top, BorderLayout.NORTH);
		
		JLabel  center = new JLabel();
		center.setFont(font);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);
		
		JLabel  under = new JLabel(String.valueOf(jumsu[2]));
		under.setHorizontalAlignment(0);
		under.setForeground(Color.yellow);
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH);
		
		JButton left = new JButton("왼  쪽");
		left.setBackground(Color.LIGHT_GRAY);
		left.setFont(font2);
		f.add(left, BorderLayout.WEST);
		
		//액션처리 하는 법
		//1) 액션기능을 add
		//2)크릭액션이 있을 떄 처리할 부품 만들기
		//클릭액션이 있을 때 어떻게 처리할지 코딩
		
		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					// 현재 인덱스보다 하나 적은 값들로 top, center, under를 setting
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(jumsu[index - 1] + "");
					index--; // index = index - 1; index -= 1;
				}else {
					JOptionPane.showMessageDialog(f, "더 이상 없습니다.");
				}
			}
		});
		
		
		JButton right = new JButton("오른쪽");
		right.setBackground(Color.LIGHT_GRAY);
		right.setFont(font2);
		f.add(right, BorderLayout.EAST);


		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < 4) {
					// 현재 인덱스보다 하나 적은 값들로 top, center, under를 setting
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(jumsu[index + 1] + "");
					index++; // index = index + 1; index += 1;
				}else {
					JOptionPane.showMessageDialog(f, "더 이상 없습니다.");
				}
			}
		});
		
		//프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
