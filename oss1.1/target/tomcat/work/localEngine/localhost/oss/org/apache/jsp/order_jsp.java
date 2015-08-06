package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sadman.dto.ProductDto;
import com.sadman.dto.CustomerDetailsDto;
import java.util.List;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    ");

    CustomerDetailsDto customer = (CustomerDetailsDto) session.getAttribute("sessionUser");

    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\r\n");
      out.write("        <title>oss | Order</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Font Awesome 4.3.0  -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\r\n");
      out.write("        <!-- Latest compiled and minified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("        <!-- Optional theme -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css\">\r\n");
      out.write("        <!-- <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'> -->\r\n");
      out.write("        <!-- Modified CSS -->\r\n");
      out.write("        <link href=\"css/edit.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Login content -->\r\n");
      out.write("        <section id=\"login-content\" >\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row form-content\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\r\n");
      out.write("                            <form action=\"/oss/ordercontroller\" method=\"post\" role=\"form\" style=\"padding-top: 105px;\">\r\n");
      out.write("                                <h2>You can change your address to take your delivery and your contact number if you've changed it</h2>\r\n");
      out.write("                                <input type=\"hidden\" name=\"pid\" value=");
      out.print(request.getParameter("pid"));
      out.write(">\r\n");
      out.write("                                <input type=\"hidden\" name=\"qn\" value=");
      out.print(request.getParameter("qn"));
      out.write(">\r\n");
      out.write("                                <div class=\"input-group form-group\">\r\n");
      out.write("                                    <span class=\"input-group-addon\" id=\"basic-addon1\"><i class=\"glyphicon glyphicon-user\"></i></span>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Name\" aria-describedby=\"basic-addon\" value=");
      out.print(customer.getFirstName());
      out.write(" readonly>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"input-group form-group\">\r\n");
      out.write("                                    <span class=\"input-group-addon\" id=\"basic-addon1\"><i class=\"fa fa-envelope-o\"></i></span>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Email address\" aria-describedby=\"basic-addon1\" value=\"sadman.ilham@gmail.com\" readonly>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"input-group form-group\">\r\n");
      out.write("                                    <span class=\"input-group-addon\" id=\"basic-addon4\"><i class=\" glyphicon glyphicon-phone\"></i></span>\r\n");
      out.write("                                    <span class=\"input-group-addon\">+880</span>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Enter your phone number\" aria-describedby=\"basic-addon4\" name=\"cp\" value=");
      out.print(customer.getPhone());
      out.write(">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"input-group form-group\">\r\n");
      out.write("                                    <span class=\"input-group-addon\" id=\"basic-addon5\"><i class=\"glyphicon glyphicon-home\"></i></span>\r\n");
      out.write("                                    <textarea rows=\"4\" cols=\"50\" class=\"form-control\" placeholder=\"Enter your address\" aria-describedby=\"basic-addon5\" name=\"dp\" value=");
      out.print(customer.getAddress());
      out.write('>');
      out.print(customer.getAddress());
      out.write("</textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-success sign-up\" value=\"Place Order\" />\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Start of footer -->\r\n");
      out.write("        <footer id=\"footer\">\r\n");
      out.write("            <div class=\"footer-bottom\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <p class=\"text-center\">All rights reserved</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- Rating JS -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.raty.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/custom.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
