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
           <a href="fuelcontroller?action=insert">New Fuel</a>
              <h1> Fuel List </h1>
       
       <table class="table" border=1>
        <thead>
            <tr>
                <th>Fuel Id</th>
                <th>Fuel Type</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${fuels}" var="fuel">
                <tr>
                    <td><c:out value="${fuel.fuelid}" /></td>
                    <td><c:out value="${fuel.fueltype}" /></td>
                    
                    <td><a href="fuelcontroller?action=edit&fuelid=<c:out value="${fuel.fuelid}"/>">Update</a></td>
                    <td><a href="fuelcontroller?action=delete&fuelid=<c:out value="${fuel.fuelid}"/>">Delete</a></td>
                </tr>
            </c:forEach>
                </div>
       </div>
       </div>
    </body>
</html>
