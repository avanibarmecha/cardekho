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
        
           <form method="POST" action='variantcontroller' name="frmAddvariant">
               <table>
                   <tr>
                       <td>Variant ID : </td>
                       <td><input type="text" readonly="readonly" name="variantid"
                                  value="<c:out value="${variant.variantid}"/>"/> <br /> </td>
                   <tr>
                   <tr>
                       <td> Variant Name :</td>
                       <td><input  type="text" name="variantname"
                                   value="<c:out value="${variant.variantname}"/>"/> <br /> </td>
                   </tr>
                   
                   <tr>
                       
                       <td> Ex showroom price :</td>
                       <td><input  type="text" name="exshowroom_price"
                                   value="<c:out value="${variant.exshowroom_price}"/>" /> <br /></td>
                   </tr>
                   <tr>
                       
                       <td> Features :</td>
                       <td><input  type="text" name="features"
                                   value="<c:out value="${variant.features}"/>" /> <br /></td>
                   </tr>
                  
                   <tr>
                       <td>Model Name : </td>
                       <td><select name="modelid" id="modelid">
                             <option value=""></option>
                             <c:forEach items="${models}" var="model">
         
                              <option value="${model.modelid}"${model.modelid == selectedmodelid ? 'selected="selected"' : ''}><c:out value="${model.modelname}"/></option>
                             </c:forEach> </td>
                   </tr>
                   
                   <tr>
                       <td> <input type="submit" value="Submit"/></td>
                   </tr>
               </table>
           </form>
     </div>
</div>
    
 </body>
</html>


 
    