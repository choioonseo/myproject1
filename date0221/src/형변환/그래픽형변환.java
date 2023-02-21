package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 그래픽형변환 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		//FlowLayout flow = new FlowLayout();
		//한 번만 쓰는 함수는 정의할 필요 없이 바로 대입해도 됨.
		//단점: f.setfont, f.background 등  스타일을 넣기가 힘듦.
		f.setLayout(new FlowLayout());
		
		f.add(new JButton("나는 버튼.")); //component자리에 JButton : 자동 형변환
		f.add(new JLabel("나는 라벨."));
		f.add(new JTextField(10));
		
		f.setVisible(true);
		
	}

}
