package 상속;

public class 맨 extends 사람 {// 사람을 상속받아서 맨을 만들자
	// name, age
	// eat(), sleep() 등이 이미 있음
	
	int power;
	
	public void run() {
		System.out.println("달리다.");
	}
}
