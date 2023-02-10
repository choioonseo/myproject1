package 배열응용;

public class 여러개배열사용하기 {

	public static void main(String[] args) {
		//여러개의 배열을 사용하고 싶은 경우
		//아버지에 대한 정보는 모든 배열애서 0번에 넣음
		
		String[] 식구 = {"아버지", "어머니", "형", "나"};
		int[] age = {100, 50, 30, 25};
		double[] height = {170.9, 150, 180.2, 168.6};
		
		System.out.println("이름\t나이\t키");
		System.out.println("-----------------------");
		
		for (int i = 0; i < height.length; i++) 
		{
			System.out.println(식구[i] + "\t" + age[i] + "\t" + height[i]);
		}

	}
}
