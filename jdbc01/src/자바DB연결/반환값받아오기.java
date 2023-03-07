package 자바DB연결;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import javax.swing.JOptionPane;

public class 반환값받아오기 {

	public static void main(String[] args) {
		반환값연습 re = new 반환값연습(); //반환값연습에 들어있는 기능들을 불러옴
		
		re.add2();
		
		int result1 = re.add(200, 100); //int-> 300
		System.out.println("더한 값은 " + result1);
		
		String data = JOptionPane.showInputDialog("입력"); //"aaa"
		String data2 = JOptionPane.showInputDialog(null, "출력값"); //"aaa"
		
		double result2 = re.add(22.1, 10); //double, int 값 2개일때, 무조건 double을 먼저 적고 int(순서가 중요)
		System.out.println("더한 값은 " + result2);
		
		String result3 = re.add("나는", "천재");
		System.out.println("더한 값은 " + result3);
		
		String result4 = re.add(1, "번 천재");
		System.out.println("더한 값은 " + result4);
		
		int[] result5 = re.add(); //{1, 2, 3}
		result5[0] = 100;
		System.out.println(result5[0]);
		System.out.println(result5[1]);
		System.out.println(result5[2]);
		
		Date result6 = re.getDate(); //실행했을 떄의 년월일시분초요일
		System.out.println(result6.getMinutes());
		System.out.println(result6.getSeconds());
		System.out.println(result6.getDay());
		
		int result7 = re.getHour();
		System.out.println(result7 + "시 입니다. 수업중.");
		
		int result8 = re.getRandom2();
		System.out.println("랜덤한 정수는 " + result8);
		
		ArrayList result9 = re.getList(); //ArrayList: 배열과는 다르게 동적으로 저장 크기가 바뀜
		System.out.println(result9.get(0) + " " + result9.get(1));
		result9.set(0, "양파"); //0번 인덱스값을 양파로 변결
		
		System.out.println(result9);
		
		HashSet result10 = re.getSet();//목록에서 반복되는 값이 들어가면 빼버림
		System.out.println(result10);
		
		
		
		

	}

}
