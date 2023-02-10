package 복습;
import java.util.Date; //OOOO
//import java.sql.Date; XXXX
public class 달구하기 {
	public static void main(String[] args) 
	{
		Date date = new Date();
	
	
	 int month = date.getMonth() +1;
	 
	 if (month == 2)
	 	{
		 for (int i=0; i<28; i++)
		 	{
	 System.out.println((i + 1));
		 	}
	 	}

	 else if (month == 4 || month == 6 || month == 9 || month == 11)
	 	{
		 for (int i=0; i<30; i++)
		 	{
	 System.out.println((i + 1));
		 	}
	 	}
	 
	 else
	 {
		 int i=0;
		 System.out.println((i + 1));
	 }
	}
}


