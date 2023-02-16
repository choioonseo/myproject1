package 스태틱;

public class 딸 {
	
	String name;
	String mw; //성별
		
	static int wallet = 10000;
	static int count;

	public 딸(String name, String mw) {
		count++;
		this.name = name;
		this.mw = mw;
		wallet = wallet - 1000;
		
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", mw=" + mw + "]";
	}
	
	
}
