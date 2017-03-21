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
              
               <h1> Get on road price </h1>
       
       <table class="table" border=1>
        <thead>
            <tr>
                <th> Id</th>
                <th>Full Name</th>
                <th>Email</th>
                <th>Mobile no</th>
                <th>Buying time</th>
                <th>Pincode</th>
                <th>city</th>
                <th>brand</th>
                <th>model</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${getonroadprices}" var="getonroadprice">
                <tr>
                    <td><c:out value="${getonroadprice.getonroadpriceid}" /></td>
                    <td><c:out value="${getonroadprice.fullname}" /></td>
                    <td><c:out value="${getonroadprice.email}" /></td>
                    <td><c:out value="${getonroadprice.mobileno}" /></td>
                    <td><c:out value="${getonroadprice.buyingtime}" /></td>
                    <td><c:out value="${getonroadprice.pincode}" /></td>
                    <td><c:out value="${getonroadprice.cityname}" /></td>
                    <td><c:out value="${getonroadprice.brandname}" /></td>
                    <td><c:out value="${getonroadprice.modelname}" /></td>
                    <td><a href="getonroadpricecontroller?action=edit&getonroadpriceid=<c:out value="${getonroadprice.getonroadpriceid}"/>">Update</a></td>
                    <td><a href="getonroadpricecontroller?action=delete&getonroadpriceid=<c:out value="${getonroadprice.getonroadpriceid}"/>">Delete</a></td>
                </tr>
            </c:forEach>
                </div>
       </div>
       </div>
    </body>
</html>
