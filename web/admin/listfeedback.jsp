<%-- 
    Document   : listbrand
    Created on : Jun 30, 2016, 2:47:34 PM
    Author     : DELL 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
       <%@include file="navbar.jsp"%>
       <div  class="container">
           <div  class="row">
               <div class="col-lg-5">
               
               <h1> FEEDBACK </h1>
       
       <table class="table" border=1>
        <thead>
            <tr>
                <th> Id</th>
                <th>Full Name</th>
                <th>Email</th>
                <th>Mobile no</th>
                <th>city</th>
                <th>comments</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${feedbacks}" var="feedback">
                <tr>
                    <td><c:out value="${feedback.feedbackid}" /></td>
                    <td><c:out value="${feedback.fullname}" /></td>
                    <td><c:out value="${feedback.email}" /></td>
                    <td><c:out value="${feedback.mobileno}" /></td>
                    <td><c:out value="${feedback.cityname}" /></td>
                    <td><c:out value="${feedback.comments}" /></td>
                    
                    
                    <td><a href="feedbackcontroller?action=delete&feedbackid=<c:out value="${feedback.feedbackid}"/>">Delete</a></td>
                </tr>
            </c:forEach>
                </div>
       </div>
       </div>
    </body>
</html>
