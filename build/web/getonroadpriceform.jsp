<%-- 
    Document   : brandform
    Created on : Jun 30, 2016, 2:47:23 PM
    Author     : DELL 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <%@include file="navbar.jsp"%>
     
<div class="container">
  
    <div style="margin-top:100px;" class="col-md-4">
        
        <form method="POST" action='getonroadpricecontroller' name="frmAddgetonroadprice">
        <table
            <tr>
            <td>ID :</td>
            <td><input type="text" readonly="readonly" name="getonroadpriceid"
                       value="<c:out value="${getonroadprice.getonroadpriceid}"/>" /> <br /> </td>
            </tr>
            <tr>
            <td>Full Name :</td>
            <td><input type="text" name="fullname"
                       value="<c:out value="${getonroadprice.fullname}"/>" /> <br /> </td>
            </tr>
            <tr>
                <td>Email : </td>
                <td><input  type="text" name="email"
                            value="<c:out value="${getonroadprice.email}"/>" /> <br /></td>
            </tr>
            <tr>
                <td>Mobile No : </td>
                <td><input  type="text" name="mobileno"
                            value="<c:out value="${getonroadprice.mobileno}"/>" /> <br /></td>
            </tr>
            <tr>
                <td>Buying Time : </td>
                <td> <select class="form-control" name="buyingtime" id="buyingtime">
                     <option value="justsearching">Just Searching</option>
                     <option value="1week">1 week</option>
                     <option value="2week">2 week</option>
                     <option value="1month">1 month</option>
                     <option value="2month">2 month</option>
                     </select>
                            <option value="<c:out value="${getonroadprice.buyingtime}"/>" /> <br /></td>
            </tr>
            <tr>
                <td> Pincode: </td>
                <td><input  type="text" name="pincode"
                            value="<c:out value="${getonroadprice.pincode}"/>" /> <br /></td>
            </tr>
            <tr>
                <td>City: </td>
                <td><select class="form-control" name="cityid" id="cityid">
                             <option value=""></option>
                             <c:forEach items="${cities}" var="city">
         
                              <option value="${city.cityid}"${city.cityid == selectedcityid ? 'selected="selected"' : ''} ><c:out value="${city.cityname}"/></option>
                             </c:forEach> </td>
            </tr>
            <tr>
                <td>Brand: </td>
                <td><select class="form-control" name="brandid" id="brandid">
                             <option value=""></option>
                             <c:forEach items="${brands}" var="brand">
         
                              <option value="${brand.brandid}"${brand.brandid == selectedbrandid ? 'selected="selected"' : ''} ><c:out value="${brand.brandname}"/></option>
                             </c:forEach> </td>
            </tr>
            <tr>
                <td>Model: </td>
                <td><select class="form-control" name="modelid" id="modelid">
                             <option value=""></option>
                             <c:forEach items="${models}" var="model">
         
                              <option value="${model.modelid}"${model.modelid == selectedmodelid ? 'selected="selected"' : ''} ><c:out value="${model.modelname}"/></option>
                             </c:forEach> </td>
            </tr>
           
            
            <tr>
                <td>
             <input type="submit" value="Submit"/></td>
            </tr>
        </table>
        </form>
     </div>
</div>
    
 </body>s
</html>


 