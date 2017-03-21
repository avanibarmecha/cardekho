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
        
           <form method="POST" action='modelcontroller' name="frmAddmodel" enctype="multipart/form-data">
               <table>
                   <tr>
                       <td>Model ID : </td>
                       <td><input type="text" readonly="readonly" name="modelid"
                                  value="<c:out value="${model.modelid}"/>" /> <br /> </td>
                   <tr>
                   <tr>
                       <td> Model Name :</td>
                       <td><input  type="text" name="modelname"
                                   value="<c:out value="${model.modelname}"/>" /> <br /> </td>
                   </tr>
                   
                   <tr>
                       
                       <td> Engine :</td>
                       <td><input  type="text" name="tengine"
                                   value="<c:out value="${model.tengine}"/>"/> <br /></td>
                   </tr>
                   <tr>
                       
                       <td> Mileage :</td>
                       <td><input  type="text" name="mileage"
                                   value="<c:out value="${model.mileage}"/>"/> <br /></td>
                   </tr>
                   <tr>
                       <td>Seat : </td>
                       <td><input  type="text" name="seat"
                                   value="<c:out value="${model.seat}"/>" /> <br /> </td>
                   </tr>
                   <tr>
                       <td>Brand Name : </td>
                       <td><select name="brandid" id="brandid">
                             <option value=""></option>
                             <c:forEach items="${brands}" var="brand">
         
                              <option value="${brand.brandid}"${brand.brandid == selectedbrandid ? 'selected="selected"' : ''} ><c:out value="${brand.brandname}"/></option>
                             </c:forEach> </td>
                   </tr>
                   <tr>
                       <td>Fuel Type :</td>
                       <td><select name="fuelid" id="fuelid">
                             <option value=""></option>
                             <c:forEach items="${fuels}" var="fuel">
         
                              <option value="${fuel.fuelid}"${fuel.fuelid == selectedfuelid ? 'selected="selected"' : ''} ><c:out value="${fuel.fueltype}"/></option>
                             </c:forEach>  </td>
                   </tr>
                   <tr>
                
                      <td>Model Logo : </td>
                      <td><br/><input type="file" name="modellogo"/><br/></td>
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


 
    