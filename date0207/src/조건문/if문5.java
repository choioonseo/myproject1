package 조건문;

public class if문5 {

	public static void main(String[] args) {
		//조건이 여러개일떄
		int myNum = 99;
		
		//점수가80점 이상이면 최우수
		//점수가 70점 이상이면 우수
		//점수가 60점 이상이면 보통
		//나머지는 미달
		
		if (myNum >= 80)
		{
			System.out.println("최우수");
		}
		else if (myNum >= 70)
		{
			System.out.println("우수");
		}
		else if (myNum >= 60)
		{
			System.out.println("보통");
		}
		else
		{
			System.out.println("미달");
		}
		
		
	}
}