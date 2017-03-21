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
       <div class="container">
           <div class="row">
               <div class="col-lg-5">
               <a href="budgetcontroller?action=insert">New budget</a>
               <h1> Budget List </h1>
       
       <table class="table" border=1>
        <thead>
            <tr>
                <th>Budget Id</th>
                <th>Budget Range</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${budgets}" var="budget">
                <tr>
                    <td><c:out value="${budget.budgetid}" /></td>
                    <td><c:out value="${budget.budget_range}" /></td>
                    
                    <td><a href="budgetcontroller?action=edit&budgetid=<c:out value="${budget.budgetid}"/>">Update</a></td>
                    <td><a href="budgetcontroller?action=delete&budgetid=<c:out value="${budget.budgetid}"/>">Delete</a></td>
                </tr>
            </c:forEach>
                </div>
       </div>
       </div>
    </body>
</html>
