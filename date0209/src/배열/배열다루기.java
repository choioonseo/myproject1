package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		
		int[] x = new int[10]; //length: 10
		//index는 0부터 시작, 마지막 위치의 인덱스는 length-1
		//0~9
		System.out.println(x.length);
		x[0] = 10;
		x[1] = 20;
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.print(x[i] + " ");
		}
		
		//System.out.println(x[0]);
		//System.out.println(x[1]);
		//System.out.println(x[2]);
		
		//우리가족의 성별을 char로 저장하여 프린트
				//우리가족의 이름을 String[]로 저장하여 프린트
				//우리가족의 시력을 double[]로 저장하여 프린트
				
		
		
		
	}

}
