package 배열응용;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열 {

	public static void main(String[] args) {
		// 배열에는 기본형(정수, 실수, 문자, 논리)만 들어가는 게 아니라
		//참조형(string, jbutton..)도 가능
		//기본형에는 변수에 값이 저장된
		//참조형은 무조건 주소가 저장됨
		
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		
		//버튼 200개 들어갈 배열을 만들자
		JButton[] buttons = new JButton[200];
		
		//버튼 200개를 만들어 배열에 저장
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + i);
		}
		
		//위치를 지정해서 넣어주자
		f.setLayout(null);//위치 자동으로 잡아주는 부품 안씀
		Random r = new Random();
		//null -> 조립해서 넣을 부품의 주소가 램에 없음
		
		for (int i = 0; i < buttons.length; i++) {
			//첫번째 버튼을 가로 500, 세로 500, 위치와 크기 100*50
			
			int x = r.nextInt(800); //가로 0~799의 위치
			int y = r.nextInt(700); //세로 0~699의 랜덤위치
			buttons[i].setBounds(x, y, 100, 50);
			//buttons[1].setBounds(600, 600, 100, 50);
			//f에 버튼을 올리자
			f.add(buttons[i]);
			//f.add(buttons[1]);
		}
		
		f.setVisible(true);

	}

}
