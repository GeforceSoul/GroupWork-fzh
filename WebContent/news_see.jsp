<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" 
           uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>东北林业大学信息与计算机工程学院</title>
<link rel="stylesheet" type="text/css" href="./resources/css/css1.css">
</head>
<body>
	<body background="./photo/background-photo.jpg">
	<div id="box">
	<img src="./photo/nefu.jpg">
	<ul>
		<li><a class="topbutton" href="index">主页</a></li>
		<li><a class="topbutton" href="introduction.jsp">专业介绍</a></li>
		<li><a class="topbutton" href="laboratory.jsp">实验室</a></li>
		<li><a class="topbutton" href="teacher.jsp">教师队伍</a></li>
		<li><a class="topbutton" href="job.jsp">就业指南</a></li>
		<li><a class="topbutton" href="news">新闻</a></li>
		<li><a class="topbutton" href="announcement">公告</a></li>
		<li><a class="topbutton" id="link" href="manager.jsp">管理员入口</a></li>
	</ul>
	<div class="left">
		<ul>
			<li><a id="link" href="news_see">新闻相关</a></li>
			<li><a class="little" id="littlelink" href="news_see">管理新闻</a></li>
			<li><a class="little" href="news_new.jsp">发布新闻</a></li>
			
			<li><a id="link" href="an_see">公告相关</a></li>
			<li><a class="little" href="an_see">管理公告</a></li>
			<li><a class="little" href="an_new.jsp">发布公告</a></li>
		
			<li><a id="link" href="index">退出登录</a></li>
			
		</ul>
	</div>
	
	<div class="article">
		
		<table>
			<tr>
				<td>新闻编号</td>
				<td>新闻标题</td>
				
				<td>新闻日期</td>
				<td>管理</td>
			</tr>
			
				<c:forEach var="s" items="${list}">
				<tr>
				<td align="left">${s.newsID}</td>
				<td align="left">${s.newsTitle}</td>
				
				<td>${s.newsDateTime}</td>
				<td><a href="NewsShowServlet?NewsShowID=${s.newsID}">查看</a></td>
				<td><a href="news_delete?NewsDeleteID=${s.newsID}">删除</a></td>
				<td><a href="news_change.jsp?NewsChangeID=${s.newsID}">修改</a></td>
				</tr>
				</c:forEach>
			
						
					
			
		</table>
	</div>
	<div id="bottom">
		东北林业大学<br /> 软件工程专业 2018&copy;
	
	</div>
	</div>
</body>
</html>