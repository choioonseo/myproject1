package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 부품만들기2 {

	public static void main(String[] args) {
		//자주 사용하지 않는 부품 만들기
		//틀이 있어서 그 틀을 이용해서 찍어냄
		
		//new: 틀을 가지고 찍어낼 떄 사용
		//new JFrame()는 JFrame이라는 틀을 이용해서 부품을 ㄸ찍어내라
		//만든 부품은 모두 ram에 저장되어야 한다 ->f변수 만들어서 부품 넣음
		//f에는 JFrame이 저장되어야함
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		JButton b1 = new JButton();
		b1.setText("나는 버튼1");
		
		
		//f위에 버튼 추가
		f.add(b1);
		
		//출력
		f.setVisible(true);
		

	}

}
