package com.mashensoft;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TokenServlet
 */
@WebServlet("/TokenServlet")
public class TokenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TokenServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> e = request.getParameterNames();
		
		while(e.hasMoreElements()){
			String key = e.nextElement();
			String value = request.getParameter(key);
			System.out.println("key:"+key+",value="+value);
		}
		String echostr = request.getParameter("echostr");
		response.getWriter().append(echostr);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(request.getInputStream());
		while(s.hasNextLine()){
			System.out.println(s.nextLine());
		}
		s.close();
	}

}
