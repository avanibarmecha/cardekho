package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/member/membernavbar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 String username = (String)request.getSession().getAttribute("username"); 
      out.write('\n');
      out.write('\n');
 if( username==null)
{
  String contextPath = request.getContextPath();
    response.sendRedirect(contextPath+"/login.jsp");
 
}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head> \n");
      out.write("\t<meta charset=\"utf-8\"> \n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("\t<meta name=\"description\" content=\"Creative One Page Parallax Template\">\n");
      out.write("\t<meta name=\"keywords\" content=\"Creative, Onepage, Parallax, HTML5, Bootstrap, Popular, custom, personal, portfolio\" /> \n");
      out.write("\t<meta name=\"author\" content=\"\"> \n");
      out.write("\t<title>HIMU - OnePage HTML Parallax template</title> \n");
      out.write("\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/prettyPhoto.css\" rel=\"stylesheet\"> \n");
      out.write("\t<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\"> \n");
      out.write("\t<link href=\"css/animate.css\" rel=\"stylesheet\"> \n");
      out.write("\t<link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/responsive.css\" rel=\"stylesheet\"> \n");
      out.write("\t<!--[if lt IE 9]> <script src=\"js/html5shiv.js\"></script> \n");
      out.write("\t<script src=\"js/respond.min.js\"></script> <![endif]--> \n");
      out.write("\t<link rel=\"shortcut icon\" href=\"images/ico/favicon.png\"> \n");
      out.write("\t<link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\"> \n");
      out.write("\t<link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\"> \n");
      out.write("\t<link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\"> \n");
      out.write("\t<link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("</head><!--/head-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t<header id=\"navigation\"> \n");
      out.write("\t\t<div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"banner\"> \n");
      out.write("\t\t\t<div class=\"container\"> \n");
      out.write("\t\t\t\t<div class=\"navbar-header\"> \n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\"> \n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> \n");
      out.write("\t\t\t\t\t</button> \n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand\" href=\"index.html\"><h1><img src=\"images/logo.png\" alt=\"logo\"></h1></a> \n");
      out.write("\t\t\t\t</div> \n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\"> \n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\"> \n");
      out.write("\t\t\t\t\t\t<li class=\"scroll active\"><a href=\"homecontroller\">Home</a></li> \n");
      out.write("\t\t\t\t\t\t<li class=\"scroll\"><a href=\"feedbackcontroller?action=''\">Feedback</a></li> \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li class=\"scroll\"><a href=\"getonroadpricecontroller?action=''\">Get On Road Price</a></li> \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li class=\"scroll\"><a href=\"contactus.jsp\">Contact</a></li> \n");
      out.write("                                                \n");
      out.write("                                                <li class=\"scroll\"><a href=\"contactus.jsp\">Logout</a></li> \n");
      out.write("\t\t\t\t\t</ul> \n");
      out.write("\t\t\t\t</div> \n");
      out.write("\t\t\t</div> \n");
      out.write("\t\t</div><!--/navbar--> \n");
      out.write("\t</header> <!--/#navigation-->\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<h4 style=\"margin-top:100px;margin-left:20px  \">Welcome  ");
      out.print( username );
      out.write("</h4>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<div style=\"margin-left:20px \">\n");
      out.write("<a href=\"#\">Account Details</a>\n");
      out.write("<a href=\"#\">My Activities</a>\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
