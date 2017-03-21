<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Member login</title>
       <script>
         function validateForm() {
         var username=  document.forms["login"]["username"].value;
         if (username == null || username == "") {
         alert("Name must be filled out");
         return false;
        }
        
        var password=  document.forms["login"]["password"].value;
        if ( password== null || password == "") {
         alert("password must be filled out");
         return false;
        }
        return true;
        
       }
       </script>
    </head>
    <body>
        
        <div class="container-fluid">
            <a href="login.jsp"></a>
         <form name="login" onsubmit="return validateForm()" method="post" action="logincontroller">
        <p><input type="text" name="username" value="<c:out value="${username}" />"  placeholder="UserName"></p>
        <p><input type="password" name="password" value="" placeholder="Password"></p>
        <p class="remember_me">
          <label>
            <input type="checkbox" name="remember_me" id="remember_me">
            Remember me on this computer
          </label>
        </p>
        <input type="submit" name="submit" value="Login"/>
          <c:out value="${message}" /> </p>
          </div>
      </form>
</div>
        </body>
</html>
