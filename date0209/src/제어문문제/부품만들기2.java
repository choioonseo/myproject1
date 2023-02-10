package 제어문문제;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class 부품만들기2 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(210, 350);
		
		//물흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야 함.
		//FlowLayout
		FlowLayout flow = new FlowLayout();
		
		//f에 물흐르듯이 배치해주는 부품을 쓰겠다라고 조립(설정)
		f.setLayout(flow);
	
		JLabel text1 = new JLabel(); //글씨
		text1.setText("아이디 입력");
		
		JLabel text2 = new JLabel(); //글씨
		text2.setText("패스워드 입력");
		
		JLabel text3 = new JLabel(); //글씨
		text3.setText("이름 입력");
		
		JLabel text4 = new JLabel(); //글씨
		text4.setText("전화번호 입력");
		
		JButton b1 = new JButton();
		b1.setText("회원가입처리");
		
		//글자 넣는 곳..
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		JTextField input3 = new JTextField(10);
		JTextField input4 = new JTextField(10);
		
		//import가 안된 경우 Font위에 마우스를 올리면(또는 F2)
		//import Font~~를 클릭!!
		//단축키로는 컨트롤 + 쉬프트 + o
		Font font = new Font("궁서", 1, 20);
		
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		
		
		input1.setBackground(Color.yellow); //배경색
		input1.setForeground(Color.white); //버튼의 위색, 글자색
		input2.setBackground(Color.yellow); //배경색
		input2.setForeground(Color.white); //버튼의 위색, 글자색
		input3.setBackground(Color.yellow); //배경색
		text3.setForeground(Color.black); //버튼의 위색, 글자색
		input4.setBackground(Color.yellow); //배경색
		b1.setBackground(Color.pink); //배경색
		b1.setForeground(Color.blue); //버튼의 위색, 글자색

		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(text3);
		f.add(input3);
		f.add(text4);
		f.add(input4);
		f.add(b1);
	
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭헀을때 처리할 내용 작성
				String id = input1.getText();
				String pw = input2.getText();
				
				if (id.contentEquals("admin") && pw.equals("1234"))
					{
						JOptionPane.showMessageDialog(f, "로그인 성공");
					}
				else
				{
					JOptionPane.showMessageDialog(f, "로그인 실패");
					input1.setText(" ");
					input2.setText(" ");
				}
	
			}
		});
		
		//보여주는 것은 맨 끝으로!!
		f.setVisible(true);
	}
}
