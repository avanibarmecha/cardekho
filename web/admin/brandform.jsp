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
  
    <div class="col-md-7">
        
           <form method="POST" action='brandcontroller' name="frmAddbrand" enctype="multipart/form-data">
            <table>
            <tr>
             
                <td>Brand ID :</td>
                <td><input type="text" readonly="readonly" name="brandid"
                           value="<c:out value="${brand.brandid}"/>" /> <br /></td>
            </tr>
            <tr>
            <td>Brand Name : </td>
            <td><input  type="text" name="brandname"
                        value="<c:out value="${brand.brandname}"/>" /> <br /></td>
                
            </tr>
            <tr>
                
                <td>Brand Logo : </td>
                <td><br/><input type="file" name="brandlogo"/><br/></td>
            </tr>
            
            <tr>
                <td><input  type="submit" value="Submit" /></td>

            </tr>
            </table>
           </form>
     </div>
</div>
    
 </body>
</html>


 
    