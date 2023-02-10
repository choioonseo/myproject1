package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		// 여러 개의 데이터를 램에 저장해두고 
		//cpu가 접근하여 사용하고 싶은 경우 사용
		//1. 값을 이미 알고 있는 경우
		int[] jumsu = {10, 20, 30, 40}; //length를 만들어서 몇개인지 세서 값을 넣어줌.
		System.out.println(jumsu);
		System.out.println(jumsu[0]); //1째값
		System.out.println(jumsu[1]);
		System.out.println(jumsu[2]);
		System.out.println(jumsu[3]);//3쨰값
		System.out.println("전체 개수" + jumsu.length);//주소가 가르키는 length변수
		

		jumsu[0] = 100;
		System.out.println(jumsu[0]);
		
		//2. 값을 아직 모르지만 먼저 저장공간을 만들고 나중에 값을 넣는 경우
		int[] jumsu2 = new int[4];
		jumsu2[0] = 200;
		System.out.println(jumsu2[0]);
	}

}
