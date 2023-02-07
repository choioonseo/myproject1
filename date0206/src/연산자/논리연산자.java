package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
	 //논리적으로 판단할 떄 조건이 두 개 이상이어서
 	//어떻게 판단해야할지 모르는 경우
		
		
		
		int id = 1111;
		int id2 = 2222;
		
		int pw = 3333;
		int pw2 = 3333;
		
		//컨트롤 + 알트 + 화살표 아래: 한줄복사
		System.out.println(id==id2);
		System.out.println(pw==pw2);
		
		//&&: and 주건, 두 조건이 모두 맞아야 맞다고 판단
		System.out.println(id==id2 && pw==pw2);
		
		int mem1 = 111;
		int mem2 = 222;
		
		// ||: or조건, 둘 중 하나만 맞아도 맞다고 판단
		System.out.println(mem1 == 111 || mem2 != 222);
		
	}

}
