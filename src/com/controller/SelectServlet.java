package com.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import db.NewsDB;
import db.NewsDBImpl;
import entity.Subject;
/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/news_see")
public class SelectServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		NewsDB sd = new NewsDBImpl();
		List<Subject> list = sd.selectall();
		request.setAttribute("list", list);
		request.getRequestDispatcher("news_see.jsp").forward(request, response);//转发到指定页面   
		
		
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
