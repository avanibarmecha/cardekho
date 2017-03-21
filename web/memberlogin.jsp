<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Member login</title>
        <script>
         function validateForm() {
         var x = document.forms["login"]["username"].value;
         if (x == null || x == "") {
         alert("Name must be filled out");
         return false;
         
        
        }
       }
       </script>
    </head>
    <body>
         <%@include file="navbar.jsp"%>
        <div style="margin-top:100px;margin-left:20px;  " class="container-fluid">
            <h1>Member Login</h1>
             
         <form method="post" action="logincontroller">
        <p><input type="text" name="username"   placeholder="UserName"></p>
        <p><input type="password" name="password" value="" placeholder="Password"></p>
        <p class="remember_me">
          <label>
            <input type="checkbox" name="remember_me" id="remember_me">
            Remember me on this computer
          </label>
        </p>
        <input type="submit" name="submit" value="Login"/>
          <c:out value="${message}" /> </p>
        </div></br>
      </form>
          <div style="margin-left:20px">
              <h4>Are you a new user ? <a href="register.jsp">Register here</a></h4>
          </div>
        </body>
</html>
