package com.minju;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login2")
public class login2 extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8"); // request로 받은 값을 utf-8로 인코딩
		
		String userid = request.getParameter("userid"); //getParameter를 이용해 request 받음
		String userpass = request.getParameter("userpass");
		boolean flag = false;
		if(userid.equals("admin")&& userpass.equals("123456")) {
			flag= true;
		}
	
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><meta charset='utf-8'><title>로그인</title>");
		out.println("</head>");
		if(flag) {
			out.println("<h1>"+userid+"로그인");
		}else {
			out.println("틀림");
		}
		out.println("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
