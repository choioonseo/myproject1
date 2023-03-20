package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check.do")
public class Check extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Check 서블릿 객체가 하나 만들어진다.");
	}
	
	
	@Override
	public void destroy() {
		System.out.println("Check 서블릿 소멸됨.");
	}
	
	
	private static final long serialVersionUID = 1L;
  
	//get요청, 클라이언트로부터 전달되는 데이터는 주소와 함꼐 도착
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String today = request.getParameter("today");
		String result = "그냥 있짜";
		
		if (today.equals("맑음")) {
			result="나가자";
		}
		
		else if (today.equals("흐림")) {
			result="코딩";
			
		} else if (today.equals("비옴")){
			result="쇼핑";

		}
		
		//setContentType는 out.을 쓰기 전에 처리해줘야함
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
			
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
		String pass = request.getParameter("pass");
		String result = "들어올 수 없습니다<img src='no.jpg'>";
		
		if (pass.equals("나는왕이다")) {
			result="들어오세요.<img src='yes.jpg'>";
		}
		
		

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
			
	}

}