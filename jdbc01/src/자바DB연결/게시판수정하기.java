package 자바DB연결;

import java.util.Scanner;

public class 게시판수정하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("no/title순으로 입력하세요.");
		String no = sc.next();
		String title = sc.next();
		
		MemberDAO2 dao = new MemberDAO2();
		dao.update(no, title); 

	}

}
