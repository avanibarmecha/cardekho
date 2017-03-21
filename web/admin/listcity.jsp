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
           <a href="citycontroller?action=insert">New City</a>
              <h1> City List </h1>
       
       <table class="table" border=1>
        <thead>
            <tr>
                <th>City Id</th>
                <th>City Name</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${cities}" var="city">
                <tr>
                    <td><c:out value="${city.cityid}" /></td>
                    <td><c:out value="${city.cityname}" /></td>
                    
                    <td><a href="citycontroller?action=edit&cityid=<c:out value="${city.cityid}"/>">Update</a></td>
                    <td><a href="citycontroller?action=delete&cityid=<c:out value="${city.cityid}"/>">Delete</a></td>
                </tr>
            </c:forEach>
                </div>
       </div>
    </div>
    </body>
</html>
