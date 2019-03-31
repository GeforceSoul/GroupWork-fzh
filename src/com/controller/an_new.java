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

import entity.Subject2;

/**
 * Servlet implementation class an_new
 */
@WebServlet("/an_new")
public class an_new extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public an_new() {
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
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String AnTitle=request.getParameter("AnTitle");
		String AnText=request.getParameter("AnText");
		String AnDateTime=request.getParameter("AnDateTime");
		
		Subject2 Subject2 =new Subject2();
		Subject2.setAnTitle(AnTitle);
		Subject2.setAnText(AnText);
		Subject2.setAnDateTime(AnDateTime);
		AnDB sd2 = new AnDBImpl();
		try{
			sd2.add(Subject2);
			System.out.println("添加成功");
			PrintWriter out=response.getWriter();
			out.print("<script language='javascript'>alert('发布成功!');window.location.href='an_new.jsp';</script>");
		}catch(Exception e){
			System.out.println("添加失败");
			e.printStackTrace();
		}
	}

}
