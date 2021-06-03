package com.webCodingChallenge.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.webCodingChallenge.services.LoginCheck;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginCheck loginCheck = new LoginCheck();
	List<String> userDetails = new ArrayList<String>();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println(userName + "............get" + password);
		
		
	
		HttpSession session = request.getSession();
		try {
			if ((userDetails.size()>0)&&(userDetails!=null)) {

				
				response.sendRedirect("details1.jsp");
				
			} else  {
				System.out.println(userName + "............" + password);
				
				System.out.println("in get");
//				RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
//				rd.forward(request, response);
				response.sendRedirect("error.jsp");
			}
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			response.sendRedirect("error.jsp");
		}
		
//		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("servlet is hit");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println(userName + "............" + password);

//		LoginCheck loginCheck = new LoginCheck();

		 userDetails = loginCheck.validateLogin(userName, password);
		System.out.println(userDetails + "..............user........");
		HttpSession session = request.getSession();
		if ((userDetails!= null)) {
			System.out.println("in post if..........");
			session.setAttribute("details", userDetails);
			response.sendRedirect("details1.jsp");
			System.out.println("in post if.....down.....");
		} else if ( (userDetails==null)) {
			System.out.println("in else if...post");

			response.sendRedirect("error.jsp");
		}

	}
}
