package 순차문;

//import: 부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		//기본 순차문: 입력 -> 처리 -> 출력
		//입력 -> 부품사용
		//다이얼로그에서 입력한 값은 컴퓨터는 무조건 String으로 인식
		String data1 = JOptionPane.showInputDialog("정수를 입력하시오-1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하시오-2");
		//jop안에 ()의 문자는 모두 string으로 처리함
		
		
		//처리-> 숫자 더하기 연산하고 싶으면
		//String을 int로 변경해야함.
		int data11 = Integer.parseInt(data1); //"200"문자 -> 200숫자
		int data22 = Integer.parseInt(data2); //"200"문자 -> 200숫자
		//ram에 있는 data1을 cpu에서 int형으로 변경
		
		
		double data33 = Double.parseDouble(data1);
		double data44 = Double.parseDouble(data2);
		
		int result = data11 + data22;
		double result2 = data33 + data44;
		
		//출력-> 모니터에 화면 보임
		System.out.println(result);
		System.out.println(result2);
	}

}
