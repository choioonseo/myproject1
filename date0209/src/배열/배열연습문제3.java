package 배열;

public class 배열연습문제3 {

	public static void main(String[] args) {
		int[] a = new int [5];
		System.out.println("배열의 크기는 " + a.length);
		
		a[0] = 100;
		System.out.println("배열의 첫번째 위치는 " + a[0]);
		a[4] = 500;
		System.out.println("배열의 마지막 위치는 " + a[4]);
		a[2] = 200;
		System.out.println("배열의 세번째 위치는 " + a[2]);
		
		System.out.println("배열의 전체 데이터는 ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(i + "번째=" + a[i]+ " ");
		}
		
	}

}