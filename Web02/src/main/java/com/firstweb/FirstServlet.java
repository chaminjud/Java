package com.firstweb;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/firstservlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public FirstServlet() {
        super();
        
    }


    //서블릿에 시작 init
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 실행");
	}


	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	// 두포스트가 실행되면 두 겟으로 리퀘스트랑 리스폰즈를 보냄
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	//서블릿에 끝 destroy
	public void destroy() {
		System.out.println("destroy 메서드 실행");
	}


}
