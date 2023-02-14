package 부품응용하기;

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

public class 로그인화면 {

	public static void main(String[] args) {
		//font, flowlayout
		//jframe, 이미지icon 3개, imagelabel,
		//idlabel, pwlabel, id입력값, pw입력값
		//로그인, reset버튼
		
		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인");
		f.setSize(350, 500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.lightGray);
		Font font = new Font("궁서", 1, 30);
	
		JLabel top = new JLabel();
		JLabel id = new JLabel("아 이 디 : ");
		JLabel pw = new JLabel("패스워드: ");
		id.setFont(font);
		pw.setFont(font);
		
		
		ImageIcon icon1 = new ImageIcon("diary.jpg");
		ImageIcon icon2 = new ImageIcon("id.jpg");
		ImageIcon icon3 = new ImageIcon("pw.jpg");
		top.setIcon(icon1);
		
		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		
		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);
		login.setBackground(Color.black);
		reset.setBackground(Color.black);
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 리셋을 눌렀을때 idText, pwText에 공백을 넣어라
				idText.setText("");
				pwText.setText("");
				
			}
		}); //reset add end
		
login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//idText, pwText를 가져옴
				String id2 = idText.getText(); //root
				String pw2 = pwText.getText(); //1234
				
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					//일기장쓰기 부품의 open()기능 쓰기
					일기장쓰기 diary = new 일기장쓰기();
					diary.open();
					f.setVisible(false); //페이지를 숨김
				}
				else
				{
					JOptionPane.showMessageDialog(f, "다시 시도해 보세요.");
				}
			}
		}); //reset add end

		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);
		f.setVisible(true);
	}

}
