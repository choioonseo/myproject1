package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {

		컴퓨터 컴퓨터1 = new 컴퓨터(10000, "APPLE", 30);
		컴퓨터 컴퓨터2 = new 컴퓨터(20000, "BANANA", 20);
		
		System.out.println(컴퓨터1);
		System.out.println(컴퓨터2);
	}

}

