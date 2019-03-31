package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.AnDB;
import db.AnDBImpl;


/**
 * Servlet implementation class an_delete
 */
@WebServlet("/an_delete")
public class an_delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public an_delete() {
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
				
				String AnDeleteID = (String) request.getParameter("AnDeleteID");
				int deleteID = Integer.parseInt(AnDeleteID);
				
				AnDB sda2 = new AnDBImpl();
				sda2.delete(deleteID);
				request.getRequestDispatcher("an_see").forward(request, response);//转发到指定页面   
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
