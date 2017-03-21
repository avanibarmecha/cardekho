<%-- 
    Document   : membernavbar.jsp
    Created on : Jul 9, 2016, 5:43:25 PM
    Author     : DELL 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% String username = (String)request.getSession().getAttribute("username"); %>

<% if( username==null)
{
  String contextPath = request.getContextPath();
    response.sendRedirect(contextPath+"/login.jsp");
 
}
%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head> 
	<meta charset="utf-8"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
	<meta name="description" content="Creative One Page Parallax Template">
	<meta name="keywords" content="Creative, Onepage, Parallax, HTML5, Bootstrap, Popular, custom, personal, portfolio" /> 
	<meta name="author" content=""> 
	<title>HIMU - OnePage HTML Parallax template</title> 
        
	<link href="../css/bootstrap.min.css" rel="stylesheet">
	<link href="../css/prettyPhoto.css" rel="stylesheet"> 
	<link href="../css/font-awesome.min.css" rel="stylesheet"> 
	<link href="../css/animate.css" rel="stylesheet"> 
	<link href="../css/main.css" rel="stylesheet">
	<link href="../css/responsive.css" rel="stylesheet"> 
	<!--[if lt IE 9]> <script src="js/html5shiv.js"></script> 
	<script src="js/respond.min.js"></script> <![endif]--> 
	<link rel="shortcut icon" href="images/ico/favicon.png"> 
	<link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png"> 
	<link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png"> 
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png"> 
	<link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->


<body>
	
	<header id="navigation"> 
		<div class="navbar navbar-inverse navbar-fixed-top" role="banner"> 
			<div class="container"> 
				<div class="navbar-header"> 
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> 
						<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> 
					</button> 
					<a class="navbar-brand" href="index.html"><h1><img src="images/logo.png" alt="logo"></h1></a> 
				</div> 
				<div class="collapse navbar-collapse"> 
					<ul class="nav navbar-nav navbar-right"> 
						<li class="scroll "><a href="membercontroller">Home</a></li> 
						<li class="scroll "><a href=#>My Activities</a></li> 
                                                <li class="scroll active "><a href="member/accountdetails.jsp">Account Details</a></li> 
                                                <li class="scroll"><a href="logoutcontroller">Logout</a></li> 
					</ul> 
				</div> 
			</div> 
		</div><!--/navbar--> 
	</header> <!--/#navigation-->
         
</body>

<h4 style="margin-top:100px;margin-left:20px  ">Welcome  <%= username %></h4>
