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
               <div class="col-lg-9">
                   <a href="modelcontroller?action=insert">New Model</a>
              <h1> Model </h1>
       
       <table class="table" border=1>
        <thead>
            <tr>
                <th>Model Id</th>
                <th>Model Name</th>
                <th>Engine</th>
                <th>Mileage</th>
                <th>Seat</th>
                <th>Brand Name</th>
                <th>Fuel type</th>
                <th>Model logo</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${models}" var="model">
                <tr>
                    <td><c:out value="${model.modelid}" /></td>
                    <td><c:out value="${model.modelname}" /></td>
                    <td><c:out value="${model.tengine}" /></td>
                    <td><c:out value="${model.mileage}" /></td>
                    <td><c:out value="${model.seat}" /></td>
                    <td><c:out value="${model.brandname}" /></td>
                    <td><c:out value="${model.fueltype}" /></td>
                    <td><img src="<c:out value="${pageContext.request.contextPath}${model.modellogo}" />"  height="100" width="120" /> </td>
                    <td><a href="modelcontroller?action=edit&modelid=<c:out value="${model.modelid}"/>">Update</a></td>
                    <td><a href="modelcontroller?action=delete&modelid=<c:out value="${model.modelid}"/>">Delete</a></td>
                    
                </tr>
            </c:forEach>
                </div>
       </div>
    </div>
    </body>
</html>
