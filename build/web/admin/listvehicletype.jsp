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
           <a href="vehiclecontroller?action=insert">New Vehicle Type</a>
              <h1> Vehicle List </h1>
       
       <table class="table" border=1>
        <thead>
            <tr>
                <th>Type Id</th>
                <th>Vehicle Type</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${vehicles}" var="vehicle">
                <tr>
                    <td><c:out value="${vehicle.typeid}" /></td>
                    <td><c:out value="${vehicle.vtype}" /></td>
                    
                    <td><a href="vehiclecontroller?action=edit&typeid=<c:out value="${vehicle.typeid}"/>">Update</a></td>
                    <td><a href="vehiclecontroller?action=delete&typeid=<c:out value="${vehicle.typeid}"/>">Delete</a></td>
                </tr>
            </c:forEach>
                </div>
       </div>
       </div>
    </body>
</html>
