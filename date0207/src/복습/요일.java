package 복습;
import java.util.Date; //OOOO
//import java.sql.Date; XXXX
public class 요일 {
	public static void main(String[] args) 
	{
		Date date = new Date();
		
	 int day= date.getDay();
	 
	 if (day == 0 || day == 6)
	 {
		 System.out.println("쉬자");
	 }
	 else
	 {
		 System.out.println("열심히 공부하자");
	 }
		
	}
}

