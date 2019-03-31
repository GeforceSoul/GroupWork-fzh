<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<li><a id="link" href="news_see.jsp">新闻相关</a></li>
			<li><a class="little" href="news_see">管理新闻</a></li>
			<li><a class="little" href="news_new.jsp">发布新闻</a></li>
			
			<li><a id="link" href="an_see.jsp">公告相关</a></li>
			<li><a class="little" href="an_see.jsp">管理公告</a></li>
			<li><a class="little" href="an_new.jsp">发布公告</a></li>
			
			<li><a id="link" href="index">退出登录</a></li>
			
		</ul>
	</div>
	
	<div class="article">
	<p>Success！</p>
	<p>请在左边选择需要的服务</p>
	</div>
	<div id="bottom">
		东北林业大学<br /> 软件工程专业 2018&copy;
	
	</div>
	</div>
</body>
</html>