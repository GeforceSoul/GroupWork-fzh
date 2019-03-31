<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" 
           uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>东北林业大学信息与计算机工程学院软件工程</title>
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
		<li><a class="topbutton" href="manager.jsp">管理员入口</a></li>
	</ul>
	<div class="indexdiv1">
		<p id="indextitle">学院新闻</p>
		<hr /> 
		<table class="indextable">
				<c:forEach var="s" items="${list}">
				<tr>
				
				<td align="left"><a id="a1" href="news_show2?NewsShowID=${s.newsID}">${s.newsTitle}</a></td>
				
				</tr>
				
				</c:forEach>
			
						
					
			
		</table>
	</div>
	<div class="indexdiv2">
		<p id="indextitle">专业介绍</p>
		<hr /> 
		<p id="indexintroduction">软件工程是一门研究用工程化方法构建和维护有效的、实用的和高质量的软件的学科。它涉及程序设计语言、
		数据库、软件开发工具、系统平台、标准、设计模式等方面。</p>
	</div>
	<div class="indexdiv1">
		<p id="indextitle">公告</p>
		<hr /> 
		<table class="indextable">
				<c:forEach var="u" items="${list2}">
				<tr>
				
				<td align="left"><a id="a1" href="an_show2?AnShowID=${u.anID}">${u.anTitle}</a></td>
				
				</tr>
				
				</c:forEach>
			
						
					
			
		</table>
	</div>
	
	<div class="indexdiv2">
		<p id="indextitle">联系我们</p>
		<hr /> 
		<table id="phonetable">
			<tr>
			<td><img src="./photo/weibo.jpg" width="25" height="20">微博：<a id="a1"href="https://weibo.com/3639869300/profile?is_hot=1">东北林业大学</a></td>
			</tr>
			<tr>
			<td><img src="./photo/nefu_mini.jpg" width="25" height="20">网站：<a id="a1"href="https://www.nefu.edu.cn/">东北林业大学</a></td>
			</tr>
			<tr>
			<td>办公室电话：12345678</td>
			</tr>
			<tr>
			<td>地址：和兴路26号</td>
			</tr>
		</table>
	</div>
	 
	<div id="bottom">
		东北林业大学<br /> 软件工程专业 2018&copy;
	
	</div>
	
	</div>
</body>
</html>