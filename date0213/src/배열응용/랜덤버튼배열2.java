package 배열응용;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		//1. 프레임 만들기
		//2. 프레임 설정
		//3. 버튼을 넣을 배열 만들기
		//4. 버튼을 500개 만들어서 버튼 배열에 넣기
		//5. 배열에 이쓴 버튼을 꺼내서 위치 지정 후 f에 붙이기
		Random r = new Random();
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.setLayout(null);
		
		
		JButton[] b = new JButton[200];
		
		
		for (int i = 0; i < b.length; i++) {
			b[i] = new JButton("버튼 " + i);
			
			b[i].setBounds(r.nextInt(800), r.nextInt(800), 100, 50);
			f.add(b[i]);
		}

		f.setVisible(true);
		
	}
}
	