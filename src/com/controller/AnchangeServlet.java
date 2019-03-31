package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.AnDB;
import db.AnDBImpl;

/**
 * Servlet implementation class NewschangeServlet
 */
@WebServlet("/AnchangeServlet")
public class AnchangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnchangeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String AnID = (String) request.getParameter("AnID");
		String AnTitle=request.getParameter("AnTitle");
		String AnText=request.getParameter("AnText");
		String AnDateTime=request.getParameter("AnDateTime");
		
		
		AnDB sd2 = new AnDBImpl();
		try{
			sd2.update( AnID,AnTitle, AnText,AnDateTime);
			

			System.out.println("修改成功");
			
			PrintWriter out=response.getWriter();
			out.print("<script language='javascript'>alert('修改成功!');window.location.href='an_see';</script>");
		}catch(Exception e){
			System.out.println("修改失败");
			e.printStackTrace();
		}
		
	}
	}


