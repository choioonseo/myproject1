package 부품만들기;

public class TV {
	//멤버변수, 선언이 클래스 바로 아래에 되었기 떄문에
	//클래스 전체 영역에서 변수 사용가능 -> 전역변수(글로벌 변수)
	//멤버변수(=전역변수)는 자동 초기화 
	public int ch; //0
	public int vol; //0
	public boolean onOff; //false로 초기화됨
	
	public void 채널을바꾸다() {
		int change = 1; //지역변수, 자동초기화 불가능
		System.out.println(ch + "에서 "+ change +"로 바꾸다." );
		
	}
	
	public void 유튜브보다() {//메서드를 만드는 것->메서드를 정의한다
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}
	
}
