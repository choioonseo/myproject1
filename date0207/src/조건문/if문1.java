package 조건문;

public class if문1 {

	public static void main(String[] args) {
		int x = 0;
		
		if (x == 0) { 
			//조건을 쓸 때 비교하는 것으로 쓰고, 결과는 무조건 true.false
			//비교연산자(==, !=, >, >=)로 비교할 수 있는 것은 기본형 데이터만 가능
			System.out.println("내가 실행되겠지요?");
		} 
		
		else
		{ 
			//false일떄 처리하고 싶은 내용
			System.out.println("나는 조건이 맞지 않을 떄 실행돼.");
		}
		
		if (x == 1) {
			System.out.println("나는 실행될까요?");
			
		}
	}

}
