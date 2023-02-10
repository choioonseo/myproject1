package 조건문;

public class switcha {

	public static void main(String[] args) {
		int myTour = 1; //올해 여행 횟수
		//여행횟수가 10이면 "VVIP"프린트
		//여행횟수가 6이면 "VIP"프린트
		//나머지는 "NORMAL"프린트
		
		switch(myTour)
		{
		case 10: System.out.println("VVIP");
		break;
		
		case 6: System.out.println("VIP");
		break;
		
		default: System.out.println("NORMAL");
		break;
		}
		
	}
}