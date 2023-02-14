package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		//꼭 하고 싶은 것 9가지를 작성해서 전체를 프린트
		
		String[][] s = { 
				{ "운동", "헬스", "클라이밍" }, 
				{ "불닭", "핫도그", "꿔바로우" }, 
				{ "감자", "고구마", "계란" } 
			}; //전체를 프린트
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.println(s[i][j]);
			}
			
		}
		

	}

}
