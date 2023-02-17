package 상속기본;

public class 볼펜Main {

	public static void main(String[] args) {
		볼펜 a = new 볼펜();

		a.price = 1000;
		a.company = "동아";
		a.사다();
		a.size = 5;
		a.글을쓰다();
		
		System.out.println("연필의 가격: " + a.price );
		System.out.println("연필 제조회사: " + a.company );
		System.out.println("연필의 크기: " + a.size );
		System.out.println(a);
	
	}

}
