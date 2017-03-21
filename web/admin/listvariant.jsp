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
                   <a href="variantcontroller?action=insert">New variant</a>
              <h1> Variant</h1>
       
       <table class="table" border=1>
        <thead>
            <tr>
                <th>Variant Id</th>
                <th>Variant Name</th>
                <th>Ex showroom price</th>
                <th>Features</th>
                <th>Model</th>
                
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${variants}" var="variant">
                <tr>
                    <td><c:out value="${variant.variantid}" /></td>
                    <td><c:out value="${variant.variantname}" /></td>
                    <td><c:out value="${variant.exshowroom_price}" /></td>
                    <td><c:out value="${variant.features}" /></td>
                    <td><c:out value="${variant.modelname}" /></td>
                   
                    <td><a href="variantcontroller?action=edit&variantid=<c:out value="${variant.variantid}"/>">Update</a></td>
                    <td><a href="variantcontroller?action=delete&variantid=<c:out value="${variant.variantid}"/>">Delete</a></td>
                    
                </tr>
            </c:forEach>
                </div>
       </div>
    </div>
    </body>
</html>
