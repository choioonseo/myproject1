package 생성자;

public class TV {
	//멤버변수, 선언이 클래스 바로 아래에 되었기 떄문에
	//클래스 전체 영역에서 변수 사용가능 -> 전역변수(글로벌 변수)
	//멤버변수(=전역변수)는 자동 초기화 
	public int ch; //0
	public int vol; //0
	public boolean onOff; //false로 초기화됨
	
	
	//다른 생성자 메서드가 없으면 부품 만들떄(객체생성) 자동으로 생성됨
	//기본 생성자(default constructor)
	public TV() {
		//자동으로 만들어지는 메서드(함수)
		System.out.println("TV객체가 하나 생성됨.");
	}
	
	
	public TV(int ch, int vol, boolean onOff) {
		//무더기영역에 저장된 멤버변수에 값을 넣어주는 역할
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	
	

	public void 채널을바꾸다() {
		int change = 1; //지역변수, 자동초기화 불가능
		System.out.println(ch + "에서 "+ change +"로 바꾸다." );
		
	}
	
	public void 유튜브보다() {//메서드를 만드는 것->메서드를 정의한다
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}
	
}
