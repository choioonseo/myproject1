package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립 {

	public static void main(String[] args) {
		//1. 자주 써서 램에 언제든 사용할 준비가 되어있음
		//부품명.기능()
		//ex) JFrame(), JLabel(), JTextField() 등
		//like 망치
		
		//2. 쓸 떄마다 제공되는 틀을 이용해서 찍어내어 여러 개 만들어 
		//여러 개 저장해두고 사용
		//like 벽돌
		//JFrame f1 = new JFrame();
		//JFrame f2 = new JFrame();
		//JFrame f3 = new JFrame();
		
		JFrame f = new JFrame();
		f.setSize(500,500);
		
		JLabel l = new JLabel();
		l.setText("당신이 생각한 숫자를 입력하시오");
		
		JTextField text = new JTextField(10); //입력칸 갯수 10
		JButton b = new JButton();
		FlowLayout flow = new FlowLayout();
		
		Font font = new Font("궁서", 1, 20);
		Font font2 = new Font("굴림", 1, 30);
		
		
		f.setLayout(flow);
		f.add(l);//f라는 부품 위에 조립해서 올려라
		f.add(text);
		f.add(b);
		
		//윗부분에 글자 들어가는 부분
		l.setFont(font2);
		l.setForeground(Color.pink);
		
		//버튼 배경, 글자색, 포느 지정
		b.setBackground(Color.red);
		b.setForeground(Color.black);
		b.setForeground(Color.white);
		b.setText("숫자만들기게임");
		b.setFont(font);
		
		//맨아래에
		f.setVisible(true);
	}

}
