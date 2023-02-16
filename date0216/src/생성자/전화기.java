package 생성자;
//main을 쓰지 않아도 됨
//부품: JButton처럼 부품을 만드는 거기 때문에 실행시키는 main이 필요럾음

public class 전화기 {
	//성질 : 멤버변수(가격, 모양)
	//public: 아무데서나(다른 패키지에서도)접근 가능하도록 설정->접근제어자
	public int price; //멤버 변수는 자동초기화가 됨(0)
	public String shape; //기본형이 아닌 경우(참조형 변수들): null로 초기화됨
	
	
	//눈에 보이지는 않지만 기본 생성자가 만들어져 있음
	//묵시적으로 기본 생성자가 만들어져 있음
	
	public 전화기 () {
		System.out.println("전화기 객체가 만들어졌음.");
	}
	
	
	//동작 : 멤버메서드(함수와 동일), 동적인 기능을 수행
	//인터넷하다, 카톡하다
	public void 인터넷하다() {
		//기능 처리하는 방법을 나열
		System.out.println("와이파이 연결하다.");
		System.out.println("데이터를 써서 연결하다.");
	}
	
	public void 카톡하다() {
		System.out.println("자바 단체톡을 하다.");
		System.out.println("게시물을 올리다.");
	}
	

}
