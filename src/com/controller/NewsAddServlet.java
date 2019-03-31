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
import entity.Subject;

/**
 * Servlet implementation class NewsAddServlet
 */
@WebServlet("/news_new")
public class NewsAddServlet extends HttpServlet {
	 
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String NewsTitle=request.getParameter("NewsTitle");
		String NewsText=request.getParameter("NewsText");
		String NewsDateTime=request.getParameter("NewsDateTime");
		
		Subject Subject =new Subject();
		Subject.setNewsTitle(NewsTitle);
		Subject.setNewsText(NewsText);
		Subject.setNewsDateTime(NewsDateTime);
		NewsDB sd = new NewsDBImpl();
		try{
			sd.add(Subject);
			System.out.println("添加成功");
			PrintWriter out=response.getWriter();
			out.print("<script language='javascript'>alert('发布成功!');window.location.href='news_new.jsp';</script>");
		}catch(Exception e){
			System.out.println("添加失败");
			e.printStackTrace();
		}
		
	}
   
}
