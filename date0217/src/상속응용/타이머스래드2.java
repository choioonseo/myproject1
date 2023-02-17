package 상속응용;

import java.util.Date;

public class 타이머스래드2 extends Thread {
	@Override
	public void run() {

		for (int i = 1000; i > 0; i--) {
			
			Date date = new Date();
			System.out.println("시간: " + date);
			
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("문제 발생");
			}
		}
	
	}
}
