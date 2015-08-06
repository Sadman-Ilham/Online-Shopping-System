package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sadman.dto.CustomerDetailsDto;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

CustomerDetailsDto sessionUser = (CustomerDetailsDto) session.getAttribute("sessionUser");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-trans navbar-fixed-top\" role=\"navigation\" style=\"background-image: none; background-color: #385670\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar-collapsible\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a href=\"/oss\"><img src=\"images/home/logo.jpg\" style=\"background-size:20px 20px;\" alt=\"\" /></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"navbar-collapse collapse\" id=\"navbar-collapsible\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right shop-menu\">\r\n");
      out.write("                <li> <a href=\"#\"><i class=\"fa fa-heart-o fa-2x\"></i><span class=\"icon-text\"> Wishlist </span>\r\n");
      out.write("                    <span class=\"badge\"></span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"/oss/cart\"><i class=\"fa fa-shopping-cart fa-2x\"></i> <span class=\"icon-text\">Cart</span> <span class=\"badge\"></span></a></li>\r\n");
      out.write("                ");

                if(sessionUser != null) {
                
      out.write("\r\n");
      out.write("                    <li class=\"dropdown-toggle\" data-toggle=\"dropdown\"><a href=\"#\"><i class=\"fa fa-user fa-2x\"></i><span class=\"icon-text\"> ");
      out.print(sessionUser.getFirstName());
      out.write("</span></a></li>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a href=\"#\">Profile</a></li>\r\n");
      out.write("                        <li><a href=\"/oss/logoutcontroller\">Log Out</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                ");

                }else {
                
      out.write("\r\n");
      out.write("                    <li><a data-toggle=\"modal\" href='#modal-id'><i class=\"fa fa-user fa-2x\"></i><span class=\"icon-text\"> LogIn/SignUp</span></a></li>\r\n");
      out.write("                ");

                }
                
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("            <form class=\"navbar-form navbar-left\">\r\n");
      out.write("                <div class=\"form-group\" style=\"display:inline;\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <div class=\"input-group-btn\">\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\" style=\"height: 34px;\"><span class=\"glyphicon glyphicon-chevron-down\"></span></button>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"#\">Category 1</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Category 2</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Category 3</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Category 4</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Category 5</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"What are you searching for?\">\r\n");
      out.write("                        <div class=\"input-group-btn\">\r\n");
      out.write("                            <button class=\"btn btn-default\" type=\"submit\" style=\"height: 34px;\"><i class=\"glyphicon glyphicon-search\"></i></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<!-- Start of modal window -->\r\n");
      out.write("<div class=\"modal fade\" id=\"modal-id\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                <h3 class=\"text-center\">Login or <a href=\"/oss/signup\">Sign up</a></h3>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xs-4\" >\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-lg btn-block btn-facebook\">Facebook</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xs-4 \">\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-lg btn-block btn-twitter\">Twitter</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xs-4 \">\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-lg btn-block btn-google\">Google+</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row \">\r\n");
      out.write("                    <div class=\"col-xs-12\">\r\n");
      out.write("                        <hr class=\"hrStyle\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xs-12 \">\r\n");
      out.write("                        <form action=\"/oss/logincontroller\" class=\"form-horizontal\" method=\"post\" role=\"form\">\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <span class=\"input-group-addon\" id=\"basic-addon1\"><i class=\"glyphicon glyphicon-user\"></i></span>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Username\" aria-describedby=\"basic-addon1\" name=\"email\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span class=\"help-block\"></span>\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <span class=\"input-group-addon\" id=\"basic-addon2\"><i class=\"glyphicon glyphicon-lock\"></i></span>\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" placeholder=\"Password\" aria-describedby=\"basic-addon2\" name=\"password\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span class=\"help-block\"></span>\r\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-success btn-block btn-lg\" value=\"Login\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row \">\r\n");
      out.write("                    <div class=\"col-xs-6 text-left\">\r\n");
      out.write("                        <label><input type=\"checkbox\" value=\"rememberMe\"> Remember Me</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xs-6 text-right \">\r\n");
      out.write("                        <p><a href=\"#\">Forgot Password?</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
