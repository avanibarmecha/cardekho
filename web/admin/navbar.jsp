<%-- 
    Document   : navbar
    Created on : Jun 30, 2016, 2:46:45 PM
    Author     : DELL 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="admin/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

<script src="admin/js/jquery-1.11.1.min.js" type="text/javascript"></script>
<script src="admin/js/bootstrap.min.js" type="text/javascript"></script>

<% String username = (String)request.getSession().getAttribute("username"); %>

<% if( username==null)
{
  String contextPath = request.getContextPath();
    response.sendRedirect(contextPath+"/login.jsp");
 
}
%>

<nav class="navbar navbar-inverse">
  <div  class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">ADMIN PANEL</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="brandcontroller?action=listbrand">Brand</a></li>
      <li><a href="vehiclecontroller?action=listvehicletype">Vehicle type</a></li>
      <li><a href="citycontroller?action=listcity">City</a></li> 
      <li><a href="fuelcontroller?action=listfuel">Fuel Type</a></li> 
      <li><a href="budgetcontroller?action=listbudget">Budget Range</a></li> 
       <li><a href="modelcontroller?action=listmodel">Model</a></li> 
        <li><a href="variantcontroller?action=listvariant">Variants</a></li>
         <li><a href="feedbackcontroller?action=listfeedback">Feedback</a></li>
          <li><a href="getonroadpricecontroller?action=listgetonroadprice">Get on road price</a></li>
    </ul>
  </div>
</nav>