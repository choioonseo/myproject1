package 상속응용;

public class 카운트스레드2 extends Thread {
	
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운트다운: " + i);
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("문제 생김.");
			}
			
		}
		
		
	}

}
