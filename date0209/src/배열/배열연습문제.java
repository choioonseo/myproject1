package 배열;

public class 배열연습문제 {

	public static void main(String[] args) {
		// 여러 개의 데이터를 램에 저장해두고 
		//cpu가 접근하여 사용하고 싶은 경우 사용
		//1. 값을 이미 알고 있는 경우
		
		int[] week = {1, 2, 3, 4, 5, 6 ,7};
	
		System.out.println("첫번째,두번째위치값");
		System.out.println(week[0]);	
		System.out.println(week[1]);
		System.out.println("week배열에 들어있는 데이터 수");
		System.out.println(week.length);	
		
		week[2] = 10;
		week[4] = 12;
		System.out.println("세번째,다섯번째위치값");
		System.out.println(week[2]);
		System.out.println(week[4]);
		System.out.println("---------------------");
		
		int tour[] = new int [4];
		tour[0] = 20;
		tour[2] = 30;
		System.out.println(tour[0]);
		System.out.println(tour[2]);
		System.out.println(tour.length);
	}

}
