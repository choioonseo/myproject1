package 배열;

public class 배열연습문제2 {

	public static void main(String[] args) {
		// 우리가족의 성별을 char로 저장하여 프린트
		// 우리가족의 이름을 String[]로 저장하여 프린트
		// 우리가족의 시력을 double[]로 저장하여 프린트

		char[] a = { '남', '여', '여', '여', '여', '여' };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		String[] b = { "최창훈", "이선희", "최화영", "최화성", "최윤서", "장경선" };
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();

		double[] c = { 0.1, 0.2, 0.3, 0.4, 0.5, 0.6 };
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();

		boolean[] d = { true, true, true, true, false, false };
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}

	}

}
