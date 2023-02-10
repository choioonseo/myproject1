package 순차문;

//import: 부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		//기본 순차문: 입력 -> 처리 -> 출력
		//입력 -> 부품사용
		String data1 = JOptionPane.showInputDialog("당신의 취미는?");
		String data2 = JOptionPane.showInputDialog("언제 하시나요?");
		//jop안에 ()의 문자는 모두 string으로 처리함
		
		
		//처리-> 글자 연결
		String result = data1 + " " + data2;
		
		//출력-> 모니터에 화면 보임
		System.out.println(result);
	}

}
