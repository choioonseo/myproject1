package 반복문;

public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		//1번부터 10번까지의 데이터중에서 짝수만 프린트
		for (int i = 1; i <= 10; i++) 
		{
			if (i % 2 != 0) //홀수
			{
				continue; //괄호안에 있는 것은 넘어가고 for문을 돌려라
			}
			if (i == 8)
			{
				break; //for문 종료, for문 아래에 있는 내용이 이어서 실행
			}
			System.out.println(i);
		}
		System.out.println("for문 다 끝났다");
	}
}
