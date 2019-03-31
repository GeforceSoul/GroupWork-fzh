package com.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import db.NewsDB;
import db.NewsDBImpl;


/**
 * Servlet implementation class NewsDeleteServlet
 */
@WebServlet("/news_delete")
public class NewsDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String NewsDeleteID = (String) request.getParameter("NewsDeleteID");
		int deleteID = Integer.parseInt(NewsDeleteID);
		
		NewsDB sda = new NewsDBImpl();
		sda.delete(deleteID);
		request.getRequestDispatcher("news_see").forward(request, response);//转发到指定页面   
	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
	}


}
