package 조건문;

public class if문4 {

	public static void main(String[] args) {
		int myTour = 10; //올해 여행 횟수
		//여행횟수가 10이면 "VVIP"프린트
		//여행횟수가 6이면 "VIP"프린트
		//나머지는 "NORMAL"프린트
		
		if (myTour == 10)
		{
			System.out.println("VVIP");
		}
		else if (myTour == 6)
		{
			System.out.println("VIP");
		}
		else
		{
			System.out.println("NORMAL");
		}
	}
}