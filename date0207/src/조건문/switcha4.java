package 조건문;

public class switcha4 {

	public static void main(String[] args) {
		String ssn = "221201"; //주민번호
				
		if (ssn.equals ("221201"))
			//string은 기본형 데이터가 아니어서 명령어(함수)를 사용
			//함수 .equals
		{
			System.out.println("22년생이군요");
			
		} 
		else 
		{
			System.out.println("22년생이 아니군요");
		}
		
		char gender = ssn.charAt(0); //첫번째 자리 문자 하나를 추출
		
		switch (gender)
		{
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("남자");
			break;
		}
		
	}
}