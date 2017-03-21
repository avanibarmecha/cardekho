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
                   <a href="brandcontroller?action=insert">New brand</a>
               <h1> Brand List </h1>
       
       <table class="table" border=1>
        <thead>
            <tr>
                <th>Brand Id</th>
                <th>Brand Name</th>
                <th>Brand Logo</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${brands}" var="brand">
                <tr>
                    <td><c:out value="${brand.brandid}" /></td>
                    <td><c:out value="${brand.brandname}" /></td>
                    <td><img src="<c:out value="${pageContext.request.contextPath}${brand.brandlogo}" />"  height="100" width="120" /> </td>
                    <td><a href="brandcontroller?action=edit&brandid=<c:out value="${brand.brandid}"/>">Update</a></td>
                    <td><a href="brandcontroller?action=delete&brandid=<c:out value="${brand.brandid}"/>">Delete</a></td>
                </tr>
            </c:forEach>
                </div>
       </div>
       </div>
    </body>
</html>
