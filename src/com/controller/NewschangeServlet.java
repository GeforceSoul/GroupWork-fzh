package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import db.NewsDB;
import db.NewsDBImpl;

/**
 * Servlet implementation class NewschangeServlet
 */
@WebServlet("/NewschangeServlet")
public class NewschangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewschangeServlet() {
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
		
		String NewsID = (String) request.getParameter("NewsID");
		String NewsTitle=request.getParameter("NewsTitle");
		String NewsText=request.getParameter("NewsText");
		String NewsDateTime=request.getParameter("NewsDateTime");
		
		//Subject Subject =new Subject();
		//Subject.setNewsTitle(NewsTitle);
		//Subject.setNewsText(NewsText);
		//Subject.setNewsDateTime(NewsDateTime);
		NewsDB sd = new NewsDBImpl();
		try{
			sd.update( NewsID,NewsTitle, NewsText,NewsDateTime);
			

			System.out.println("修改成功");
			//request.getRequestDispatcher("news_see").forward(request, response);
			PrintWriter out=response.getWriter();
			out.print("<script language='javascript'>alert('修改成功!');window.location.href='news_see';</script>");
		}catch(Exception e){
			System.out.println("修改失败");
			e.printStackTrace();
		}
		
	}
	}


