package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장쓰기 {
	//멤버변수-안써도 됨
	//멘버메서드
	public void open() {
		//jframe화면이 보이게 하자->기능을 정의
		
		JFrame f = new JFrame();
		f.setTitle("내 일기장 작성화면");
		f.setSize(350, 500);
		
		f.getContentPane().setBackground(Color.pink);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("궁서", 1, 30);

		JLabel day = new JLabel("오늘의 날짜: ");
		JLabel title = new JLabel("오늘의 제목: ");
		JLabel content = new JLabel("오늘의 내용: ");
		day.setFont(font);
		title.setFont(font);
		content.setFont(font);
		
		JTextField dayText = new JTextField(10);
		JTextField titleText = new JTextField(10);
		dayText.setHorizontalAlignment(JTextField.CENTER);
		titleText.setHorizontalAlignment(JTextField.CENTER);
		dayText.setFont(font);
		titleText.setFont(font);

		JTextArea contentText = new JTextArea(5, 10);
		contentText.setFont(font);
		
		JButton btn = new JButton("파일에 일기 저장");
		btn.setFont(font);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 날짜, 제목, 내용 입력한 거를 가져오기(getText)
				String day2 = dayText.getText();
				String title2 = titleText.getText();
				String content2 = contentText.getText();
				System.out.println(day2 + " " + title2 + " " + content2);
				
				//파일을 만들어주고, 자바프로그램과 file간에 연결통로를 만들어줌
				//외부에 있는 파일이나 네트워크나 cpu 등을 자바에서 연결할 떄는
				//위험한 상황이라고 인식함
				//위험한 상황에서 문제 발생하면 어떠게 처리할지 꼭 써줘야함
				try {
					FileWriter file = new FileWriter(day2 + ".txt");
					file.write(day2 + "\n");
					file.write(title2 + "\n");
					file.write(content2 + "\n");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("파일로 저장하는 중 문제가 생김");
				}
			}
		});

		f.add(day); f.add(dayText);
		f.add(title); f.add(titleText);
		f.add(content); f.add(contentText);	
		f.add(btn);

		f.setVisible(true);
	}
	
}
