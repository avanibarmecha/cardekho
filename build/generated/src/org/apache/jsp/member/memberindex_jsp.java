package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberindex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/member/membernavbar.jsp");
    _jspx_dependants.add("/member/memberfooter.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            \n");
      out.write("    $(document).ready(function () {\n");
      out.write("\n");
      out.write("        $(\"#brandid\").change(function () {\n");
      out.write("            var id = $(this).val();\n");
      out.write("            alert(id);\n");
      out.write("            $.get('ModelByBrandServlet', {\n");
      out.write("                brandid : id\n");
      out.write("        }, function(response) {\n");
      out.write("\n");
      out.write("        var select = $('#modelid');\n");
      out.write("        select.find('option').remove();\n");
      out.write("        select.append($('<option/>', {\n");
      out.write("                            value: 0,\n");
      out.write("                            text: \"\"\n");
      out.write("                        }));\n");
      out.write("          $.each(response, function(index, value) {\n");
      out.write("          $('<option>').val(value.modelid).text(value.modelname).appendTo(select);\n");
      out.write("      });\n");
      out.write("        });\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("\t\t\t\t\t\t<li class=\"scroll active\"><a href=\"membercontroller\">Home</a></li> \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                                \n");
      out.write("                                                <li class=\"scroll\"><a href=\"logoutcontroller\">Logout</a></li> \n");
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
      out.write("        <div class=\"row\" >\n");
      out.write("            <div class=\"col-lg-4\">\n");
      out.write("                \n");
      out.write("               <div style=\"margin-top:250px;margin-left:20px; font-size:16px;\">\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                   \n");
      out.write("               <div class=\"panel panel-primary\">\n");
      out.write("                    <div class=\"panel-heading\">Search the right car</div> \n");
      out.write("               </div>\n");
      out.write("                 \n");
      out.write("               <div class=\"container\">\n");
      out.write("  \n");
      out.write("               <ul class=\"nav nav-pills\">\n");
      out.write("               <li class=\"active\"><a data-toggle=\"pill\" href=\"#bybudget\">By Budget</a></li>\n");
      out.write("               <li><a data-toggle=\"pill\" href=\"#bybrand\">By Brand</a></li>\n");
      out.write("  \n");
      out.write("               </ul>\n");
      out.write("  \n");
      out.write("               <div class=\"tab-content\">\n");
      out.write("               <div id=\"bybudget\" class=\"tab-pane fade in active\">\n");
      out.write("      \n");
      out.write("               <form>   \n");
      out.write("                   <table\n");
      out.write("                    <tr>\n");
      out.write("                             <td>Budget</td>\n");
      out.write("                             <td><select class=\"form-control\" name=\"budget\" id=\"bybudget\">\n");
      out.write("                             <option value=\"\"></option>\n");
      out.write("                             ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write(" </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Vehicle Type</td>\n");
      out.write("                       <td><select class=\"form-control\" name=\"vehicle\" id=\"vehicle\">\n");
      out.write("                             <option value=\"\"></option>\n");
      out.write("                             ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write(" </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr> \n");
      out.write("                        <td><input type=\"submit\" class=\"btn btn-primary btn-lg\" value=\"Search\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                   </table>    \n");
      out.write("            </form>\n");
      out.write("              </div>  \n");
      out.write("              \n");
      out.write("    \n");
      out.write("    <div id=\"bybrand\" class=\"tab-pane fade\">\n");
      out.write("      \n");
      out.write("        <form>\n");
      out.write("            <table>\n");
      out.write("                   <tr>\n");
      out.write("                       <td> Brand </td>\n");
      out.write("                       <td><select class=\"form-control\" name=\"brandid\" id=\"brandid\">\n");
      out.write("                             <option value=\"\"></option>\n");
      out.write("                             ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write(" </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                       <td> Model</td>\n");
      out.write("                       <td><select class=\"form-control\" name=\"modelid\" id=\"modelid\">\n");
      out.write("                             <option value=\"\"></option>\n");
      out.write("                             ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write(" </td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" class=\"btn btn-primary btn-lg\" value=\"Search\"></td>\n");
      out.write("                    </tr> \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"col-lg-8\">\n");
      out.write("                 \n");
      out.write("        <section id=\"home\">\n");
      out.write("\t\t<div class=\"home-pattern\"></div>\n");
      out.write("\t\t<div id=\"main-carousel\" class=\"carousel slide\" data-ride=\"carousel\"> \n");
      out.write("\t\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t\t<li data-target=\"#main-carousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t\t<li data-target=\"#main-carousel\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t\t<li data-target=\"#main-carousel\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t\t</ol><!--/.carousel-indicators--> \n");
      out.write("\t\t\t        <div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t<div class=\"item active\" style=\"background-image: url(images/slider/slide3.jpg)\"> \n");
      out.write("                                    <div class=\"carousel-caption\"></div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"item\" style=\"background-image: url(images/slider/slide2.jpg)\"> \n");
      out.write("                                    <div class=\"carousel-caption\"></div> \n");
      out.write("\t\t\t\t\t\t \n");
      out.write("\t\t\t        </div> \n");
      out.write("\t\t\t        <div class=\"item\" style=\"background-image: url(images/slider/slide1.jpg)\"> \n");
      out.write("\t\t\t\t<div class=\"carousel-caption\"> \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/.carousel-inner-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<a class=\"carousel-left member-carousel-control hidden-xs\" href=\"#main-carousel\" data-slide=\"prev\"><i class=\"fa fa-angle-left\"></i></a>\n");
      out.write("\t\t<a class=\"carousel-right member-carousel-control hidden-xs\" href=\"#main-carousel\" data-slide=\"next\"><i class=\"fa fa-angle-right\"></i></a>\n");
      out.write("\t</div> \n");
      out.write("\n");
      out.write("</section><!--/#home-->\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer id=\"footer\"> \n");
      out.write("\t\t<div class=\"container\"> \n");
      out.write("\t\t\t<div class=\"text-center\"> \n");
      out.write("\t\t\t\t<p>Copyright &copy; 2014 - <a href=\"http://mostafiz.me/\">Mostafiz</a> | All Rights Reserved</p> \n");
      out.write("\t\t\t</div> \n");
      out.write("\t\t</div> \n");
      out.write("\t</footer> <!--/#footer--> \n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.js\"></script> \n");
      out.write("\t<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/smoothscroll.js\"></script> \n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.isotope.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.prettyPhoto.js\"></script> \n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.parallax.js\"></script> \n");
      out.write("\t<script type=\"text/javascript\" src=\"js/main.js\"></script> ");
      out.write(" \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${budgets}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("budget");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("         \n");
          out.write("                              <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${budget.budgetid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${budget.budgetid == selectedbudgetid ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write('>');
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</option>\n");
          out.write("                             ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${budget.budget_range}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vehicles}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("vehicle");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("         \n");
          out.write("                              <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vehicle.typeid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vehicle.typeid == selectedtypeid ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write('>');
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("</option>\n");
          out.write("                             ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vehicle.vtype}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${brands}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("brand");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("         \n");
          out.write("                              <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${brand.brandid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${brand.brandid == selectedbrandid ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write('>');
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("</option>\n");
          out.write("                             ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${brand.brandname}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${models}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("model");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("         \n");
          out.write("                              <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.modelid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.modelid == selectedmodelid ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write('>');
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("</option>\n");
          out.write("                             ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.modelname}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }
}
