package 상속응용;

public class 특수문자스레드 {

	public static void main(String[] args) {
		
		달러스레드 달러 = new 달러스레드();
		앤드스레드 앤드 = new 앤드스레드();
		골뱅이스레드 골뱅이 = new 골뱅이스레드();

		달러.start();
		앤드.start();
		골뱅이.start();
	}

}
