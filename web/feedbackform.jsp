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
        
        <form method="POST" action='feedbackcontroller' name="frmAddcity">
        <table
            <tr>
            <td>ID :</td>
            <td><input type="text" readonly="readonly" name="feedbackid"
                       value="<c:out value="${feedback.feedbackid}"/>" /> <br /> </td>
            </tr>
            <tr>
            <td>Full Name :</td>
            <td><input type="text" name="fullname"
                       value="<c:out value="${feedback.fullname}"/>" /> <br /> </td>
            </tr>
            <tr>
                <td>Email : </td>
                <td><input  type="text" name="email"
                            value="<c:out value="${feedback.email}"/>" /> <br /></td>
            </tr>
            <tr>
                <td>Mobile No : </td>
                <td><input  type="text" name="mobileno"
                            value="<c:out value="${feedback.mobileno}"/>" /> <br /></td>
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
                <td>Comments : </td>
                <td><input  type="text" name="comments"
                            value="<c:out value="${feedback.comments}"/>" /> <br /></td>
            </tr>
            
            <tr>
                <td>
             <input type="submit" value="Submit"/></td>
            </tr>
        </table>
        </form>
     </div>
</div>
    
 </body>
</html>


 