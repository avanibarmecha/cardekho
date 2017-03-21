<%-- 
    Document   : Register
    Created on : Jun 16, 2016, 10:31:43 PM
    Author     : student
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
          <jsp:include page="navbar.jsp" flush="true"/>
        
          <form action="registercontroller" method="post">
              <div style="margin-top:150px;margin-left:20px; " class="container-fluid">
              <table style="width:400">
                  <tr>
                      <td>First Name</td>
                      <td><input type="text" name="firstname" id="firstname"/> </td>
                  </tr>
                   
                  <tr>
                      <td>Last Name</td>
                      <td><input type="text" name="lastname" id="lastname"/> </td>
                  </tr>
                  <tr>
                       
                  <tr>
                      <td>User Name</td>
                      <td><input type="text" name="username" id="username"/> </td>
                  </tr>
                      <td>Email</td>
                      <td><input type="text" name="email" id="email"/> </td>
                  </tr>
                 <tr>
                      <td>City</td>
                      <td><input type="text" name="city" id="city"/> </td>
                  </tr>
                 
                   
                   <tr>
                      <td>Password</td>
                      <td><input type="password" name="password" id="password"/> </td>
                  </tr>
                    <tr>
                      <td>Confirm Password</td>
                      <td><input type="password" name="confirmPassword" id="confirmPassword"/> </td>
                  </tr>
                   
                   <tr>
                   
                      <td  colspan="2"><input type="submit" value="Register"/> </td>
                  </tr>
              </table>
               <p>  <c:out value="${message}" /> </p> 
              </div>
          </form>
    </body>
</html>
