package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Member login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
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
      out.write("\t\t\t\t\t\t<li class=\"scroll\"><a href=\"#portfolio\">Portfolio</a></li> \n");
      out.write("\t\t\t\t\t\t<li class=\"scroll\"><a href=\"#clients\">Clients</a></li> \n");
      out.write("\t\t\t\t\t\t<li class=\"scroll\"><a href=\"#blog\">Blog</a></li> \n");
      out.write("\t\t\t\t\t\t<li class=\"scroll\"><a href=\"contactus.jsp\">Contact</a></li> \n");
      out.write("                                                <li class=\"scroll\"><a href=\"memberlogin.jsp\">My Account</a></li> \n");
      out.write("\t\t\t\t\t</ul> \n");
      out.write("\t\t\t\t</div> \n");
      out.write("\t\t\t</div> \n");
      out.write("\t\t</div><!--/navbar--> \n");
      out.write("\t</header> <!--/#navigation-->\n");
      out.write("</body>");
      out.write("\n");
      out.write("        <div style=\"margin-top:100px;margin-left:20px;  \" class=\"container-fluid\">\n");
      out.write("            <h1>Member Login</h1>\n");
      out.write("             \n");
      out.write("         <form method=\"post\" action=\"logincontroller\">\n");
      out.write("        <p><input type=\"text\" name=\"username\" value=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\"  placeholder=\"UserName\"></p>\n");
      out.write("        <p><input type=\"password\" name=\"password\" value=\"\" placeholder=\"Password\"></p>\n");
      out.write("        <p class=\"remember_me\">\n");
      out.write("          <label>\n");
      out.write("            <input type=\"checkbox\" name=\"remember_me\" id=\"remember_me\">\n");
      out.write("            Remember me on this computer\n");
      out.write("          </label>\n");
      out.write("        </p>\n");
      out.write("        <input type=\"submit\" name=\"submit\" value=\"Login\"/>\n");
      out.write("          ");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write(" </p>\n");
      out.write("        </div></br>\n");
      out.write("      </form>\n");
      out.write("          <div style=\"margin-left:20px\">\n");
      out.write("              <h4>Are you a new user ? <a href=\"register.jsp\">Register here</a></h4>\n");
      out.write("          </div>\n");
      out.write("        </body>\n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }
}
