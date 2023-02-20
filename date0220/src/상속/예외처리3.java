package 상속;

public class 예외처리3 {

	public static void main(String[] args) {
		
		int[] num = new int[3]; //0~2
		
		try {
			num[3] = 2; //문제가 생길 여지가 있는 코드
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("배열에 문제가 있음.");
			// e.printStackTrace();
		}
		
		System.out.println(num.length); //배열의 개수
		
	}

}