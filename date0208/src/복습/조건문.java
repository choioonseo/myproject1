package 복습;

import javax.swing.JOptionPane;
//import: JOptionPane의 라이브러리 위치를 나타내줌


public class 조건문 {

	public static void main(String[] args) {
		
		int target = 77;
		int me = 88;
		
		//조건은 비교하는 코드가 들어감
		//결과는 모두 논리형 (true.false두 가지)
		
		if (target == me)
		{
			System.out.println("정답입니다");
		}
		else
		{
			System.out.println("오답입니다");
		}
		
		//if문은 자체 break기능이 있지만 switch는 없으므로 break를 써줘야함

		String you = "신나";
		switch (you) {
		case "로또" :
			System.out.println("정답");
			break;
		case "신나" : case "놀자": case "나가자":
			System.out.println("오답");
			break;

		default:
			break;
		}
		
	}
}
