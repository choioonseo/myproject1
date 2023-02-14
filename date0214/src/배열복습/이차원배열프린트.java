package 배열복습;

public class 이차원배열프린트 {

	public static void main(String[] args) {
		// 배열을 만들때 이미 값을 알고 있는 경우
		int [][] n1 = {
			//j: 0  1  2   i
				{1, 2, 3},//0
				{4, 5, 6} //1
		};
		
		System.out.println(n1.length); //2차원배열의 length: 행만 출력(2) 
		System.out.println(n1[0][0]);
		System.out.println(n1[1][2]);
		
		//2중for문
		for (int i = 0; i < n1.length; i++) { //i: 행, length:헹의 길이
			for (int j = 0; j < n1[i].length; j++) { //열 출력
				System.out.println(n1[i][j]);
			}
		}
		
		// 배열을 만들때 아직 값을 모르는 경우, 공간을 먼저 만듦
		
		int[][]n2 = new int[2][3]; //행(앞): 2, 열(뒤): 3
		//cf) 3차원배열: [면][행][렬]
		
	}

}
