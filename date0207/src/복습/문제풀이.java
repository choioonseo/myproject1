package 복습;
import javax.swing.JOptionPane;
public class 문제풀이 {
	public static void main(String[] args) {
		//1~2번 equals()사용합니다.
//		1. 암호를 대시오 입력 ==> pass라고 입력
//		   암호가 맞으면 "들어오세요." 프린트
//		   암호가 틀리면 "나가세요" 프린트
		//String pw = JOptionPane.showInputDialog("암호를 대시오");
//		if (pw.equals("pass")) { //true
//			System.out.println("들어오세요.");
//		} else {
//			System.out.println("나가세요");
//		}
//		2. 당신이 먹고 싶은 저녁 메뉴는(자장면, 라면, 회)에서 선택
//		   자장면이면 "중국집으로 가요" 프린트
//		   라면이면 "분식집으로 가요" 프린트
//		   회이면 "횟으로 가요" 프린트
//		   위에 없으면 "그냥 안먹어요" 프린트
//		String food = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는(자장면, 라면, 회)에서 선택");
//		switch (food) { //int, char, String
//		case "자장면":
//			System.out.println("중국집으로 가요");
//			break;
//		case "라면":
//			System.out.println("분식집으로 가요");
//			break;
//		case "회":
//			System.out.println("횟으로 가요");
//			break;
//		default:
//			System.out.println("그냥 안먹어요");
//			break;
//		}
		
//		3. JOptionPane을 사용
//		   두 정수를 입력받으세요. --> 누가 더 큰지 출력!
//		String n1 = JOptionPane.showInputDialog("정수1입력");
//		String n2 = JOptionPane.showInputDialog("정수2입력");
//		
//		//정수로 변환 Integer.parseInt()
//		int n11 = Integer.parseInt(n1);
//		int n22 = Integer.parseInt(n2);
//		
//		if (n11 > n22) {
//			System.out.println("첫번째 입력값이 더 큼.");
//		} else if(n11 < n22){ //n11 < n22
//			System.out.println("두번째 입력값이 더 큼.");
//		} else { //n11 == n22
//			System.out.println("두 수가 동일함.");
//		}
		
//		4. 사원번호 ==> String no = "A100EX";
//		   맨 앞에 있는 글자를 추출 no.charAt(0)을 이용
//		   A이면 기획부 프린트, B이면 총무부 프린트, C이면 개발부 프린트, 아니면 해당부서없음 프린트
		 String no = "A100EX";
		 char ch = no.charAt(0); //'A'
		 switch (ch) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		default:
			System.out.println("해당부서없음 ");
			break;
		}
	}
}