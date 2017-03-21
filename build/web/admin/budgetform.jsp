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
      <!DOCTYPE html>
<html lang="en">

<body>

<div class="container">
  
    <div class="col-md-4">
        
           <form method="POST" action='budgetcontroller' name="frmAddbudget">
            <table>
                <tr>
                    <td>Budget ID : </td>
                    <td><input type="text" readonly="readonly" name="budgetid"
                               value="<c:out value="${budget.budgetid}"/>" /> <br /></td>
                </tr>
                <tr>
                    <td>Budget Range : </td>
                    <td><input  type="text" name="budget_range"
                                value="<c:out value="${budget.budget_range}"/>" /> <br /></td>
                </tr>
                <tr>
                    <td><input
                            type="submit" value="Submit" /></td>
                </tr>
            </table>
           </form>
     </div>
</div>
    
 </body>
</html>


 
    