package com.minju;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Relogin extends HttpServlet {
	
	    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//브라우저에게 html이 utf-8형식이라고 전달
		//UTF-8는 한글 처리라고 생각하면 됨
	       response.setContentType("text/html;charset=UTF-8");
	      
	     //서블릿에서 만드는 html파일의 인코딩이 utf-8
	       PrintWriter out = response.getWriter(); 
		
	        //서버측에서 답변을 받는것
			response.setCharacterEncoding("utf-8");
			//서버에 요청 index로 부터 서버에 전송
			request.setCharacterEncoding("utf-8");
		
		                  //form으로 받은 값을 request로 받는다.
		String userid = request.getParameter("id");
		String password = request.getParameter("password");
		
		if(userid.equals("hong") && password.equals("123456")) {
			
			 out.println("<html>");
		       out.println("<meta charset='utf-8'>");
		       out.println("<head><title>로그인성공</title></head>");
		       out.println("<body>");
		       out.println("<h1>환영합니다.</h1>");
		       out.println("<p>이름 : " +userid+" 님</p>");
		       out.println("</body>");
		       out.println("</html>");
		}else {
			out.println("<html>");
		       out.println("<meta charset='utf-8'>");
		       out.println("<head><title>로그인실패</title></head>");
		       out.println("<body>");
		       out.println("<p>로그인실패</p>");
		       out.println("</body>");
		       out.println("</html>");
		}
	}
                                //클래스        //변수  //클래스         //변수 
	  //html에서 받은 값을 doGet에서 검증하고 doPost를 html형식으로 보냄
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
