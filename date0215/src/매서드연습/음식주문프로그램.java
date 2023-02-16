package 매서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식주문프로그램 {
	
	//심화
	//1) 버튼을 클릭했을 때, 각 음식의 주문량을 체크해서 나타내기
	//2) 음식의 값을 분리/ 짬뽕: 3500원, 우동: 3000원, 짜장: 4000원
	
	static int count;
	static int count1; //0으로 초기화, 전역변수!
	static int count2; //0으로 초기화, 전역변수!
	static int count3; //0으로 초기화, 전역변수!
	final static int PRICE1 = 3500;
	final static int PRICE2 = 3000;
	final static int PRICE3 = 4000;
	//final은 변경불가, 상수
	//상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로!를 권장!!!

	public static void main(String[] args) {

		
		JFrame f = new JFrame();
		f.setTitle("음식주문시스템");
		f.setSize(400, 600);
		f.getContentPane().setBackground(Color.ORANGE);
		
		f.setTitle("짬뽕: " + count1 + "개, 우동: " + count2 + "개, 짜장: "+ count3 + "개");
		

		Font font = new Font("궁서", 1, 30);
	
		JButton b1 = new JButton("짬뽕");
		b1.setFont(font);
		b1.setForeground(Color.pink);
	
		
		JButton b2 = new JButton("우동");
		b2.setFont(font);
		b2.setForeground(Color.pink);
		
		JButton b3 = new JButton("짜장");
		b3.setFont(font);
		b3.setForeground(Color.pink);
		
		JLabel textLabel = new JLabel("총 개수: ");
		textLabel.setFont(font);
		
		JLabel countLabel = new JLabel("0개");
		countLabel.setFont(font);
		
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("000.jpg");
		imgLabel.setIcon(icon);

		
		
		JLabel result = new JLabel("결제금액: ");
		result.setFont(font);
	
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("111.jpg");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액: " + (count * PRICE1)  + "원");
				count1++;
				f.setTitle("짬뽕: " + count1 + "개, 우동: " + count2 + "개, 짜장: "+ count3 + "개");
				

			}
		});
		
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("222.jpg");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액: " + (count * PRICE2)  + "원");
				count2++;
				f.setTitle("짬뽕: " + count1 + "개, 우동: " + count2 + "개, 짜장: "+ count3 + "개");
				

			}
			
		});
		
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("333.jpg");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액: " + (count * PRICE3)  + "원");
				count3++;
				f.setTitle("짬뽕: " + count1 + "개, 우동: " + count2 + "개, 짜장: "+ count3 + "개");
				

			}
		});
		
		
		JLabel all = new JLabel("짬뽕: " + count1 + "개, 우동: " + count2 + "개, 짜장: "+ count3 + "개");
		all.setFont(font);
				
		
	
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(all);
		f.add(result);
	
		
		f.setVisible(true);

	}

}
