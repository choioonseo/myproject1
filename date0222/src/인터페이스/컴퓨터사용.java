package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		AppleComputer a = new AppleComputer();
		//Computer a = new AppleComputer(); 로도 대체해서 사용가능
		
		BananaComputer b = new BananaComputer();
		
		a.컴퓨터1();
		a.컴퓨터2();
		b.컴퓨터1();
		b.컴퓨터2();
	}

}