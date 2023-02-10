package 복습;
import java.util.Date; //OOOO
//import java.sql.Date; XXXX
public class 시분초2 {
	public static void main(String[] args) 
	{
		
		//Date - 년월일시분초, java.util.Date
		Date date = new Date();
		
		
		int year = date.getYear();
		
		if (year + 1900 > 2000) {
			System.out.println("밀레니엄 세대시군요");
		
		}else {
			System.out.println("밀레니엄 세대가 아니시군요");
		}
		
		
		
	}
}