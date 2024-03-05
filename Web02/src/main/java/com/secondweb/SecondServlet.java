package com.secondweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//일반적인 클라스로 만들어도 서블릿 파일을 제작 가능
// httpservlet 클래스를 상속 받으면 된다
// 위 클래스는 자바에 내장 되어 있는 클래스
@WebServlet(description="두번째 서블릿", urlPatterns={"/secondservlet","/sservlet"})                                            
public class SecondServlet extends HttpServlet{

	
	//전부 직접 쳐보는 파일
	
	//메서드           throws 예외 던지기 
	public void init() throws ServletException {
		System.out.println("init 메서드 실행됨");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	                  throws ServletException , IOException{
		System.out.println("doGet메서드가 실행되었습니다");
	}
}
