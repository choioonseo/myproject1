package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		// 여러개의 배열을 사용하고 싶은 경우
		// 아버지에 대한 정보는 모든 배열애서 0번에 넣음

		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		// 1. 1학기성적이 오른 학생 몇명?
		// 2. 1.2학기 성적이 동일한 학생 몇명?

		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count1++;
			} else if (term1[i] == term2[i]) {
				count2++;
			}

		}

		System.out.println("1학기 성적이 오른 학생은 " + count1 + "명");
		System.out.println("1, 2학기 성적이 같은 학생은 " + count2 + "명");

		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("2학기 학생 중 만점(100)인 학생의 이름과 번호는: " + names[i] + ", " + i);
			}
		}

		int sum1 = 0;
		int avg1 = 0;
		int sum2 = 0;
		int avg2 = 0;
		
		for (int i = 0; i < term2.length; i++)
		{
			sum1 = sum1 + term1[i]; 
			avg1 = sum1 / 5;
			sum2 = sum2 + term2[i];
			avg2 = sum2 / 5;
		}
		
		if (avg1 > avg2) {
			System.out.println("1학기 성적의 평균이 높습니다.");
		}
		else if (avg1 < avg2) {
			System.out.println("2학기 성적의 평균이 높습니다.");
		}
		
		for (int i = 0; i < names.length; i++)
		{
			
			if ("뉴진스".equals(names[i]))
			{
				System.out.println("뉴진스의 1학기 성적은 " +term1[i] + ", 뉴진스의 2학기 성적은 " + term2[i]);
			}
		}
	
		
	}
}
