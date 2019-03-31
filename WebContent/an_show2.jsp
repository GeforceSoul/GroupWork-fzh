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
		<li><a class="topbutton"  href="news">新闻</a></li>
		<li><a class="topbutton" id="link" href="announcement">公告</a></li>
		<li><a class="topbutton"  href="manager.jsp">管理员入口</a></li>
	</ul>
	<div class="left">
		<ul>
			<li><a id="link" href="announcement">公告相关</a></li>
			<li><a class="little"  href="announcement">公告列表</a></li>
			<li><a class="little" id="littlelink" href="announcement">公告正文</a></li>
		</ul>
	</div>
	
	<div class="article">
		
			<table>
			<c:forEach var="s" items="${list2}">
			<tr>
				<td><h1>${s.anTitle}</h1></td>
			</tr>	
			<tr>
				<td>${s.anText}</td>
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