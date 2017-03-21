package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminindex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/admin/navbar.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"admin/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("<script src=\"admin/js/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"admin/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
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
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div  class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">ADMIN PANEL</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"brandcontroller?action=listbrand\">Brand</a></li>\n");
      out.write("      <li><a href=\"vehiclecontroller?action=listvehicletype\">Vehicle type</a></li>\n");
      out.write("      <li><a href=\"citycontroller?action=listcity\">City</a></li> \n");
      out.write("      <li><a href=\"fuelcontroller?action=listfuel\">Fuel Type</a></li> \n");
      out.write("      <li><a href=\"budgetcontroller?action=listbudget\">Budget Range</a></li> \n");
      out.write("       <li><a href=\"modelcontroller?action=listmodel\">Model</a></li> \n");
      out.write("        <li><a href=\"variantcontroller?action=listvariant\">Variants</a></li>\n");
      out.write("         <li><a href=\"listfeedback.jsp\">Feedback</a></li>\n");
      out.write("          <li><a href=\"listgetonroadprice\">Get on road price</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
