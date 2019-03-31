package com.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import db.AnDB;
import db.AnDBImpl;
import entity.Subject2;
/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/an_see")
public class SelectAnServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		AnDB sd2 = new AnDBImpl();
		List<Subject2> list2 = sd2.selectall();
		request.setAttribute("list2", list2);
		request.getRequestDispatcher("an_see.jsp").forward(request, response);//转发到指定页面   
		
		
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
