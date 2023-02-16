package 생성자;

public class 컴퓨터 {
	
	int price;
	String comp;
	int size;
	int test;
	//생성자 메서드
	//전역변수에서 선언한 변수들을 ()안에 넣어
	//new 컴퓨터를 생성할 때 ()값들을 대입하도록 틀을 만들어주는 것
	//{}안에 작성된 것은 지역변수의 값을 저장해줄 공간인 전역변수에 넣는 작업
	//this.은 지역변수와 전역변수가 이름이 같을 때 전역변수를 나타낸다는 것을 의미
	public 컴퓨터(int price, String comp, int size) {
		this.price = price;
		this.comp = comp;
		this.size = size;
	}
//tostring메서드: 값들을 print해주는 모양 그대로  한눈에 보게 해주는 소스
	public void toStrin() {
		System.out.println("컴퓨터 [price=" + price + ", comp=" + comp + ", size=" + size + "]"); //tostring이 써져있는 경우
	}
}
