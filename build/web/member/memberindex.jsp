<%--  
    Document   : index
    Created on : Jul 6, 2016, 4:51:44 PM
    Author     : DELL 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="js/jquery-1.11.1.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            
    $(document).ready(function () {

        $("#brandid").change(function () {
            var id = $(this).val();
            alert(id);
            $.get('ModelByBrandServlet', {
                brandid : id
        }, function(response) {

        var select = $('#modelid');
        select.find('option').remove();
        select.append($('<option/>', {
                            value: 0,
                            text: ""
                        }));
          $.each(response, function(index, value) {
          $('<option>').val(value.modelid).text(value.modelname).appendTo(select);
      });
        });
        });
        
    });
    </script>
    </head>
    <body>
        <%@include file="membernavbar.jsp" %>
        <div class="row" >
            <div class="col-lg-4">
                
               <div style="margin-top:250px;margin-left:20px; font-size:16px;">
                    
                
                   
               <div class="panel panel-primary">
                    <div class="panel-heading">Search the right car</div> 
               </div>
                 
               <div class="container">
  
               <ul class="nav nav-pills">
               <li class="active"><a data-toggle="pill" href="#bybudget">By Budget</a></li>
               <li><a data-toggle="pill" href="#bybrand">By Brand</a></li>
  
               </ul>
  
               <div class="tab-content">
               <div id="bybudget" class="tab-pane fade in active">
      
               <form>   
                   <table
                    <tr>
                             <td>Budget</td>
                             <td><select class="form-control" name="budget" id="bybudget">
                             <option value=""></option>
                             <c:forEach items="${budgets}" var="budget">
         
                              <option value="${budget.budgetid}"${budget.budgetid == selectedbudgetid ? 'selected="selected"' : ''} ><c:out value="${budget.budget_range}" /></option>
                             </c:forEach> </td>
                    </tr>
                    
                    
                    <tr>
                        <td>Vehicle Type</td>
                       <td><select class="form-control" name="vehicle" id="vehicle">
                             <option value=""></option>
                             <c:forEach items="${vehicles}" var="vehicle">
         
                              <option value="${vehicle.typeid}"${vehicle.typeid == selectedtypeid ? 'selected="selected"' : ''} ><c:out value="${vehicle.vtype}" /></option>
                             </c:forEach> </td>
                    </tr>
                    <tr> 
                        <td><input type="submit" class="btn btn-primary btn-lg" value="Search"></td>
                    </tr>
                   </table>    
            </form>
              </div>  
              
    
    <div id="bybrand" class="tab-pane fade">
      
        <form>
            <table>
                   <tr>
                       <td> Brand </td>
                       <td><select class="form-control" name="brandid" id="brandid">
                             <option value=""></option>
                             <c:forEach items="${brands}" var="brand">
         
                              <option value="${brand.brandid}"${brand.brandid == selectedbrandid ? 'selected="selected"' : ''} ><c:out value="${brand.brandname}" /></option>
                             </c:forEach> </td>
                    </tr>
                    <tr>
                       <td> Model</td>
                       <td><select class="form-control" name="modelid" id="modelid">
                             <option value=""></option>
                             <c:forEach items="${models}" var="model">
         
                              <option value="${model.modelid}"${model.modelid == selectedmodelid ? 'selected="selected"' : ''} ><c:out value="${model.modelname}" /></option>
                             </c:forEach> </td>
                    </tr>
                   
                    <tr>
                        <td><input type="submit" class="btn btn-primary btn-lg" value="Search"></td>
                    </tr> 
            </table>
        </form>
    </div>
    
    </div>
  </div>
</div>
</div>

        
        <div class="col-lg-8">
                 
        <section id="home">
		<div class="home-pattern"></div>
		<div id="main-carousel" class="carousel slide" data-ride="carousel"> 
			<ol class="carousel-indicators">
				<li data-target="#main-carousel" data-slide-to="0" class="active"></li>
				<li data-target="#main-carousel" data-slide-to="1"></li>
				<li data-target="#main-carousel" data-slide-to="2"></li>
			</ol><!--/.carousel-indicators--> 
			        <div class="carousel-inner">
				<div class="item active" style="background-image: url(images/slider/slide3.jpg)"> 
                                    <div class="carousel-caption"></div>
						
							
				</div>
				<div class="item" style="background-image: url(images/slider/slide2.jpg)"> 
                                    <div class="carousel-caption"></div> 
						 
			        </div> 
			        <div class="item" style="background-image: url(images/slider/slide1.jpg)"> 
				<div class="carousel-caption"> 
					
				</div> 
			</div>
		</div><!--/.carousel-inner-->


		<a class="carousel-left member-carousel-control hidden-xs" href="#main-carousel" data-slide="prev"><i class="fa fa-angle-left"></i></a>
		<a class="carousel-right member-carousel-control hidden-xs" href="#main-carousel" data-slide="next"><i class="fa fa-angle-right"></i></a>
	</div> 

</section><!--/#home-->
        </div>
        </div>
        
        <%@include file="memberfooter.jsp" %> 
    </body>
</html>
