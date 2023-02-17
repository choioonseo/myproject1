package 상속응용;

public class PC상황표2 {

	public static void main(String[] args) {
		카운트스레드2 count = new 카운트스레드2();
		타이머스래드2 timer = new 타이머스래드2();

		count.start();
		timer.start();
	}

}
