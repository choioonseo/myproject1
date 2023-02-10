package 제어문문제;
import java.util.Random;
import java.util.Scanner;
public class 정답맞추기 {
	public static void main(String[] args) {
		int target = 77;
		Scanner sc = new Scanner(System.in);
		
		int data = 0;
		while (true) {
			System.out.print("생각한 정답은?? ");
			data = sc.nextInt();
			
			if (data == target) {
				System.out.println("정답입니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
				
			} else {
				System.out.println("오답입니다.");
				System.out.println("다시 시도해 주세요.");
				//타겟보다 데이터가 크면 "너무 커요"
				//타겟보다 데이터가 작으면 "너무 작아요"
				if (target < data) 
				{
					System.out.println("너무 커요.");
				} 
				else if (target > data) 
				{
					System.out.println("너무 작아요.");
				} 
				
				//랜덤을 이용해서 프로그램이 실행될 떄마다 정답 바꾸기
				//int target = 77; 대신에
				//int Random r = new Random();
				
				
				//전체 시도 횟수 카운트
				//int count = 0;
				//count++;
				//System.out.println(당신의 시도 횟수는 count);
				
				
			}
		}
		sc.close();
	}
}




