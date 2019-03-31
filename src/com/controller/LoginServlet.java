package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.UserService;

@WebServlet("/manager_success")
public class LoginServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
  
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
   //request.getRequestDispatcher("manager_success.jsp").forward(request, response);
  }

  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    String userName = request.getParameter("username");
    String password = request.getParameter("password");
    HttpSession session = request.getSession();
    UserService mss = new UserService();

    String result = mss.checkUser(userName,password);
    
    if (result.equals("hasUserNameAndPasswordCorrect")) {

        
        session.setAttribute("status", "hasUserNameAndPasswordCorrect");
        System.out.println("用户名和密码均正确");
        request.getRequestDispatcher("manager_success.jsp").forward(request, response);

    } else if (result.equals("hasUserNameButPasswordInCorrect")) {

        System.out.println("用户名正确,密码不正确");
        request.getRequestDispatcher("manager_error.jsp").forward(request, response);
        

    } else if (result.equals("hasNoUserName")) {

        System.out.println("没有此用户");
        request.getRequestDispatcher("manager_error.jsp").forward(request, response);
       

    }
    
    
	
  }
}
