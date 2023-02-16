package 생성자;

public class 수강신청하기 {

	public static void main(String[] args) {
		수강신청 subject1 = new 수강신청("자바", "14:30", "홍길동");
		수강신청 subject2 = new 수강신청("JSP", "9:30", "김길동");
		System.out.println(subject1);
		System.out.println(subject2);
	}

}
