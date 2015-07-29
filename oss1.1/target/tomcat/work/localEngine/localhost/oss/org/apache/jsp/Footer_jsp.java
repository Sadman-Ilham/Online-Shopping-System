package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <footer id=\"footer\">\r\n");
      out.write("        <div class=\"footer-top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-2\">\r\n");
      out.write("                        <div class=\"companyinfo\">\r\n");
      out.write("                            <h2><span>e</span>-shopper</h2>\r\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,sed do eiusmod tempor</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-7\">\r\n");
      out.write("                        <div class=\"col-sm-3\">\r\n");
      out.write("                            <div class=\"video-gallery text-center\">\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                <div class=\"iframe-img\">\r\n");
      out.write("                                    <img src=\"images/home/iframe1.png\" alt=\"\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"overlay-icon\">\r\n");
      out.write("                                    <i class=\"fa fa-play-circle-o\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <p>Circle of Hands</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-3\">\r\n");
      out.write("                            <div class=\"video-gallery text-center\">\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                <div class=\"iframe-img\">\r\n");
      out.write("                                    <img src=\"images/home/iframe2.png\" alt=\"\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"overlay-icon\">\r\n");
      out.write("                                    <i class=\"fa fa-play-circle-o\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <p>Circle of Hands</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-3\">\r\n");
      out.write("                            <div class=\"video-gallery text-center\">\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                <div class=\"iframe-img\">\r\n");
      out.write("                                    <img src=\"images/home/iframe3.png\" alt=\"\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"overlay-icon\">\r\n");
      out.write("                                    <i class=\"fa fa-play-circle-o\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <p>Circle of Hands</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-3\">\r\n");
      out.write("                            <div class=\"video-gallery text-center\">\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                <div class=\"iframe-img\">\r\n");
      out.write("                                    <img src=\"images/home/iframe4.png\" alt=\"\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"overlay-icon\">\r\n");
      out.write("                                    <i class=\"fa fa-play-circle-o\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <p>Circle of Hands</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                        <div class=\"address\">\r\n");
      out.write("                            <img src=\"images/home/map.png\" alt=\"\" />\r\n");
      out.write("                            <p></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer-widget\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-2\">\r\n");
      out.write("                        <div class=\"single-widget\">\r\n");
      out.write("                            <h2>Service</h2>\r\n");
      out.write("                            <ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("                                <li><a href=\"#\">Online Help</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Order Status</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Change Location</a></li>\r\n");
      out.write("                                <li><a href=\"#\">FAQâs</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-2\">\r\n");
      out.write("                        <div class=\"single-widget\">\r\n");
      out.write("                            <h2>Quock Shop</h2>\r\n");
      out.write("                            <ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("                                <li><a href=\"#\">T-Shirt</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Mens</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Womens</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Gift Cards</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Shoes</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-2\">\r\n");
      out.write("                        <div class=\"single-widget\">\r\n");
      out.write("                            <h2>Policies</h2>\r\n");
      out.write("                            <ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("                                <li><a href=\"#\">Terms of Use</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Privecy Policy</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Refund Policy</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Billing System</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Ticket System</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-2\">\r\n");
      out.write("                        <div class=\"single-widget\">\r\n");
      out.write("                            <h2>About Shopper</h2>\r\n");
      out.write("                            <ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("                                <li><a href=\"#\">Company Information</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Careers</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Store Location</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Affillate Program</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Copyright</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-3 col-sm-offset-1\">\r\n");
      out.write("                        <div class=\"single-widget\">\r\n");
      out.write("                            <h2>About Shopper</h2>\r\n");
      out.write("                            <form action=\"#\" class=\"searchform\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Your email address\" />\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-default\"><i class=\"fa fa-arrow-circle-o-right\"></i></button>\r\n");
      out.write("                                <p>Get the most recent updates from <br />our site and be updated your self...</p>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer-bottom\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <p class=\"pull-left\">All rights reserved.</p>\r\n");
      out.write("                    <p class=\"pull-right\"><span><a target=\"_blank\" href=\"#\"></a></span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
