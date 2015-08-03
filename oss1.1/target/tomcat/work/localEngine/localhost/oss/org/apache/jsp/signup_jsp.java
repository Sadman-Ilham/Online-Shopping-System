package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title>Project</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("        <!-- Font Awesome 4.3.0  -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\r\n");
      out.write("        <!-- Latest compiled and minified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("        <!-- Optional theme -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css\">\r\n");
      out.write("        <!-- <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'> -->\r\n");
      out.write("        <!-- Modified CSS -->\r\n");
      out.write("        <link href=\"css/register.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Login content -->\r\n");
      out.write("        <section id=\"login-content\" >\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <!-- <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("                        <div class=\"jumbotron-style text-center\">\r\n");
      out.write("                            <h1>E-Shopper</h1>\r\n");
      out.write("                            <h3>Register here for full access</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div> -->\r\n");
      out.write("                <div class=\"row form-content\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6 col-lg-offset-6 col-md-offset-6 col-sm-offset-6 col-xs-offset-6\">\r\n");
      out.write("                            <form action=\"/oss/signingup\" method=\"post\" role=\"form\">\r\n");
      out.write("                                <div class=\"form-group form-inline\" >\r\n");
      out.write("                                    <label class=\"sr-only\" for=\"\">first name</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control first-name\" id=\"\" placeholder=\"First Name\" name=\"firstName\">\r\n");
      out.write("                                    <label class=\"sr-only\" for=\"\">Last name</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control last-name\" id=\"\" placeholder=\"Last Name\" name=\"lastName\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"input-group form-group\">\r\n");
      out.write("                                    <span class=\"input-group-addon\" id=\"basic-addon1\"><i class=\"fa fa-envelope-o\"></i></span>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Enter your email address\" aria-describedby=\"basic-addon1\" name=\"email\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"input-group form-group\">\r\n");
      out.write("                                    <span class=\"input-group-addon\" id=\"basic-addon2\"><i class=\"glyphicon glyphicon-lock\"></i></span>\r\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" placeholder=\"Enter password\" aria-describedby=\"basic-addon2\" name=\"password\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"input-group form-group\">\r\n");
      out.write("                                    <span class=\"input-group-addon\" id=\"basic-addon3\"><i class=\"glyphicon glyphicon-lock\"></i></span>\r\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" placeholder=\"Re-Enter password\" aria-describedby=\"basic-addon3\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"input-group form-group\">\r\n");
      out.write("                                    <span class=\"input-group-addon\" id=\"basic-addon4\"><i class=\" glyphicon glyphicon-phone\"></i></span>\r\n");
      out.write("                                    <span class=\"input-group-addon\">+880</span>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Enter your phone number\" aria-describedby=\"basic-addon4\" name=\"phone\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"input-group form-group\">\r\n");
      out.write("                                    <span class=\"input-group-addon\" id=\"basic-addon5\"><i class=\"glyphicon glyphicon-home\"></i></span>\r\n");
      out.write("                                    <textarea rows=\"4\" cols=\"50\" class=\"form-control\" placeholder=\"Enter your address\" aria-describedby=\"basic-addon5\" name=\"address\"></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"input-group form-group form-inline\">\r\n");
      out.write("                                    <label>Date Of Birth</label>\r\n");
      out.write("                                    <span>\r\n");
      out.write("                                    <select title=\"Day\" id=\"day\" name=\"birthday_day\" aria-label=\"Day\">\r\n");
      out.write("                                        <option selected=\"1\" value=\"0\">Day</option>\r\n");
      out.write("                                        <option value=\"1\">1</option>\r\n");
      out.write("                                        <option value=\"2\">2</option>\r\n");
      out.write("                                        <option value=\"3\">3</option>\r\n");
      out.write("                                        <option value=\"4\">4</option>\r\n");
      out.write("                                        <option value=\"5\">5</option>\r\n");
      out.write("                                        <option value=\"6\">6</option>\r\n");
      out.write("                                        <option value=\"7\">7</option>\r\n");
      out.write("                                        <option value=\"8\">8</option>\r\n");
      out.write("                                        <option value=\"9\">9</option>\r\n");
      out.write("                                        <option value=\"10\">10</option>\r\n");
      out.write("                                        <option value=\"11\">11</option>\r\n");
      out.write("                                        <option value=\"12\">12</option>\r\n");
      out.write("                                        <option value=\"13\">13</option>\r\n");
      out.write("                                        <option value=\"14\">14</option>\r\n");
      out.write("                                        <option value=\"15\">15</option>\r\n");
      out.write("                                        <option value=\"16\">16</option>\r\n");
      out.write("                                        <option value=\"17\">17</option>\r\n");
      out.write("                                        <option value=\"18\">18</option>\r\n");
      out.write("                                        <option value=\"19\">19</option>\r\n");
      out.write("                                        <option value=\"20\">20</option>\r\n");
      out.write("                                        <option value=\"21\">21</option>\r\n");
      out.write("                                        <option value=\"22\">22</option>\r\n");
      out.write("                                        <option value=\"23\">23</option>\r\n");
      out.write("                                        <option value=\"24\">24</option>\r\n");
      out.write("                                        <option value=\"25\">25</option>\r\n");
      out.write("                                        <option value=\"26\">26</option>\r\n");
      out.write("                                        <option value=\"27\">27</option>\r\n");
      out.write("                                        <option value=\"28\">28</option>\r\n");
      out.write("                                        <option value=\"29\">29</option>\r\n");
      out.write("                                        <option value=\"30\">30</option>\r\n");
      out.write("                                        <option value=\"31\">31</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                    <select title=\"Month\" id=\"month\" name=\"birthday_month\" aria-label=\"Month\" >\r\n");
      out.write("                                        <option selected=\"1\" value=\"0\">Month</option>\r\n");
      out.write("                                        <option value=\"1\">Jan</option>\r\n");
      out.write("                                        <option value=\"2\">Feb</option>\r\n");
      out.write("                                        <option value=\"3\">Mar</option>\r\n");
      out.write("                                        <option value=\"4\">Apr</option>\r\n");
      out.write("                                        <option value=\"5\">May</option>\r\n");
      out.write("                                        <option value=\"6\">Jun</option>\r\n");
      out.write("                                        <option value=\"7\">Jul</option>\r\n");
      out.write("                                        <option value=\"8\">Aug</option>\r\n");
      out.write("                                        <option value=\"9\">Sep</option>\r\n");
      out.write("                                        <option value=\"10\">Oct</option>\r\n");
      out.write("                                        <option value=\"11\">Nov</option>\r\n");
      out.write("                                        <option value=\"12\">Dec</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                    <select title=\"Year\" id=\"year\" name=\"birthday_year\" aria-label=\"Year\" >\r\n");
      out.write("                                        <option selected=\"1\" value=\"0\">Year</option>\r\n");
      out.write("                                        <option value=\"2015\">2015</option>\r\n");
      out.write("                                        <option value=\"2014\">2014</option>\r\n");
      out.write("                                        <option value=\"2013\">2013</option>\r\n");
      out.write("                                        <option value=\"2012\">2012</option>\r\n");
      out.write("                                        <option value=\"2011\">2011</option>\r\n");
      out.write("                                        <option value=\"2010\">2010</option>\r\n");
      out.write("                                        <option value=\"2009\">2009</option>\r\n");
      out.write("                                        <option value=\"2008\">2008</option>\r\n");
      out.write("                                        <option value=\"2007\">2007</option>\r\n");
      out.write("                                        <option value=\"2006\">2006</option>\r\n");
      out.write("                                        <option value=\"2005\">2005</option>\r\n");
      out.write("                                        <option value=\"2004\">2004</option>\r\n");
      out.write("                                        <option value=\"2003\">2003</option>\r\n");
      out.write("                                        <option value=\"2002\">2002</option>\r\n");
      out.write("                                        <option value=\"2001\">2001</option>\r\n");
      out.write("                                        <option value=\"2000\">2000</option>\r\n");
      out.write("                                        <option value=\"1999\">1999</option>\r\n");
      out.write("                                        <option value=\"1998\">1998</option>\r\n");
      out.write("                                        <option value=\"1997\">1997</option>\r\n");
      out.write("                                        <option value=\"1996\">1996</option>\r\n");
      out.write("                                        <option value=\"1995\">1995</option>\r\n");
      out.write("                                        <option value=\"1994\">1994</option>\r\n");
      out.write("                                        <option value=\"1993\">1993</option>\r\n");
      out.write("                                        <option value=\"1992\">1992</option>\r\n");
      out.write("                                        <option value=\"1991\">1991</option>\r\n");
      out.write("                                        <option value=\"1990\">1990</option>\r\n");
      out.write("                                        <option value=\"1989\">1989</option>\r\n");
      out.write("                                        <option value=\"1988\">1988</option>\r\n");
      out.write("                                        <option value=\"1987\">1987</option>\r\n");
      out.write("                                        <option value=\"1986\">1986</option>\r\n");
      out.write("                                        <option value=\"1985\">1985</option>\r\n");
      out.write("                                        <option value=\"1984\">1984</option>\r\n");
      out.write("                                        <option value=\"1983\">1983</option>\r\n");
      out.write("                                        <option value=\"1982\">1982</option>\r\n");
      out.write("                                        <option value=\"1981\">1981</option>\r\n");
      out.write("                                        <option value=\"1980\">1980</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <label class=\"gender-text\">Gender </label>\r\n");
      out.write("                                    <span class=\"gender-radiobuttons\">\r\n");
      out.write("                                    <input type=\"radio\" name=\"gender\" value=\"male\"> Male\r\n");
      out.write("                                    <input type=\"radio\" name=\"gender\" value=\"female\"> Female\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-success sign-up\" value=\"Sign Up\">\r\n");
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
