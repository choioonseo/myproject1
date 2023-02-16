package 매서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5;
		int count2 = 4;
		
		int result1 = cal3.add(count1 , count2);
		System.out.println("오늘 온 손님의 총 합은 " + (result1 + "명 입니다"));
		
		int result2 = cal3.minus(count1 , count2);
		System.out.println(" 손님수 차이는 " + (result2 + "명 입니다"));
		
		int result3 = cal3.mul(count1 , price);
		System.out.println("오전 결제 금액은 " + result3 + "원 입니다");
		
		int result4 = cal3.mul(count2 , price);
		System.out.println("오후 결제 금액은 " + result4 + "원 입니다");
		
		int result5 = cal3.add(result3 , result4);
		System.out.println("오늘 하루 총 결제 금액은 " + result5 + "원 입니다");
		
		int result6 = cal3.div(result5 , result1);
		System.out.println("1인당 결제 금액은 " + result6 + "원 입니다");
		
		
	}

}
