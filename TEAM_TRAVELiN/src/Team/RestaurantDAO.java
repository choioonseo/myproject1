package Team;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

public class RestaurantDAO {


	public ArrayList<RestaurantVO> list() {
						
		ResultSet rs = null; //항목명 + 결과 데이터를 담고 있는 테이블 
	
		ArrayList<RestaurantVO> list = new ArrayList<>();
		RestaurantVO bag = null;
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			
			String sql = "select * from hr.RESTAURANT";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement

			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); //select문 전송시  
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { //검색결과가 있는지 여부는 rs.next()
				//true이면 있다라는 의미, false이면 없다라는 의미 
				//1. 검색결과가 있으면 syso
				//System.out.println("검색결과 있음. 성공.");
				
				//int foodno = rs.getInt(1);
				//String photo = rs.getString(2); 
				String name = rs.getString(3); 
				String location = rs.getString(4); 
				int score = rs.getInt(5); 
				//String category = rs.getString(6); 
				
				//System.out.println(foodno + " " + photo + " " + name + " " + location + " " + score + category + "");
				
				//3. 가방을 만들자
				bag = new RestaurantVO();
				//bag.setFoodno(foodno);
				//bag.setPhoto(photo);
				bag.setName(name);
				bag.setLocation(location);
				bag.setScore(score);
				//bag.setCategory(category);
				
				//4. list에 bag을 추가
				list.add(bag);
			}
			
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
		
	}

	
	public int insert(int foodno, String name) {
		int result = 0;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			
			String sql = "insert into hr.Restaurant (FOOD_NUMBER, NAME) values (?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			//R빼고, 인덱스 0부터 시작!!
			//유일하게 db은 인덱스가 1부터 시작!!
			ps.setInt(1,foodno); //ps.setInt(1, no);
			ps.setString(2, name);
		
			//==> insert into hr.MEMBER values ('a','a','a','a');
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			result = ps.executeUpdate(); //1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
		} catch (Exception e) {
			//insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			//catch가 실행
			//실행된 Row수가 없으므로 Result에 0을 넣어주자.!
			//result = 0;
			e.printStackTrace();
		}
		
		System.out.println(result);
		return result;
	}
}