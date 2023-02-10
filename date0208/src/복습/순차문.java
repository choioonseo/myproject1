package 복습;

import javax.swing.JOptionPane;
//import: JOptionPane의 라이브러리 위치를 나타내줌


public class 순차문 {

	public static void main(String[] args) {
		//입력->처리->출력
		//두 개의 숫자를 입력 받아서 처리해서 출력
		
		//램에 저장공간을 만드는 것 =>선언!
		//선언할 때 램에 저장공간인 변수가 만들어짐
		//선언: 데이터의 타입 / 변수명
		String n1 = JOptionPane.showInputDialog("숫자1 입력");
		String n2 = JOptionPane.showInputDialog("숫자2 입력");
		
		//처리
		//정수로 바꿔서 처리하고 싶으면 벙수로 바꾸어주는 부품을 사용
		//Integer
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		double result = ((double)n11 / n22);
		
		//출력
		System.out.println(result);
	}

}
