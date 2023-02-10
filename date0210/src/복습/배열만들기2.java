package 복습;

public class 배열만들기2 {

	public static void main(String[] args) {
		String[] a = {"부산", "안면도", "일본", "대만", "중국"};
		char[] b = {'r', 'y', 'g', 'k', 'o'};
		double[] c = {160.1, 162, 170.4, 155.8, 163};
		
		for (String a1 : a) 
		{
			System.out.println(a1);
		}
		for (char b1 : b) 
		{
			System.out.println(b1);
		}
		for (double c1 : c) 
		{
			System.out.println(c1);
		}
	
	}

}
