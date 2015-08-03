package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sadman.dto.ProductDto;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\r\n");
      out.write("        <title>oss | Home</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Font Awesome 4.3.0  -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\">\r\n");
      out.write("        <!-- Latest compiled and minified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("        <!-- Optional theme -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css\">\r\n");
      out.write("        <!-- <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'> -->\r\n");
      out.write("        <!-- Modified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\r\n");
      out.write("        <!-- Half-slider CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/half-slider.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.raty.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");

        List<ProductDto> productsByRatings = (List<ProductDto>) request.getAttribute("productsByRatings");              //java code
        List<ProductDto> productsBySale = (List<ProductDto>) request.getAttribute("productsBySale");
        List<ProductDto> productsByView = (List<ProductDto>) request.getAttribute("productsByView");
        int cnt = 0;
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Half Page Image Background Carousel Header -->\r\n");
      out.write("        <div id=\"myCarousel\" class=\"carousel slide\">\r\n");
      out.write("            <!-- Indicators -->\r\n");
      out.write("            <ol class=\"carousel-indicators\">\r\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("            </ol>\r\n");
      out.write("            <!-- Wrapper for Slides -->\r\n");
      out.write("            <div class=\"carousel-inner\">\r\n");
      out.write("                <div class=\"item active\">\r\n");
      out.write("                    <!-- Set the first background image using inline CSS below. -->\r\n");
      out.write("                    <div class=\"fill\" style=\"background-image:url('http://placehold.it/1900x1080&text=Slide One');\"></div>\r\n");
      out.write("                    <div class=\"carousel-caption\">\r\n");
      out.write("                        <h2>Caption 1</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <!-- Set the second background image using inline CSS below. -->\r\n");
      out.write("                    <div class=\"fill\" style=\"background-image:url('http://placehold.it/1900x1080&text=Slide Two');\"></div>\r\n");
      out.write("                    <div class=\"carousel-caption\">\r\n");
      out.write("                        <h2>Caption 2</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <!-- Set the third background image using inline CSS below. -->\r\n");
      out.write("                    <div class=\"fill\" style=\"background-image:url('http://placehold.it/1900x1080&text=Slide Three');\"></div>\r\n");
      out.write("                    <div class=\"carousel-caption\">\r\n");
      out.write("                        <h2>Caption 3</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Controls -->\r\n");
      out.write("            <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\r\n");
      out.write("            <span class=\"icon-prev\"></span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\r\n");
      out.write("            <span class=\"icon-next\"></span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Product On Sale -->\r\n");
      out.write("        <section id=\"product-on-sale\" class=\"product-content\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"col-sm-2 col-xs-2col-lg-7 col-md-7 col-sm-7 col-xs-7\">\r\n");
      out.write("                        <h4>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                        <i>PRODUCT'S ON SALE</i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        </h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-offset-2 col-lg-offset-2 col-sm-offset-2 col-xs-offset-2 col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right\">\r\n");
      out.write("                        <h4>\r\n");
      out.write("                        <a href=\"#\"><i>View more</i></a>\r\n");
      out.write("                        </h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"col-sm-4 col-xs-4 logo\">\r\n");
      out.write("                        <img src=\"images/home/girl4.jpg\" alt=\"\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-8 col-xs-8\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"container-fluid\">\r\n");
      out.write("                            ");
                                                                                          //java code
                            cnt = 0;
                            for(ProductDto product : productsBySale) {
                            if(cnt < 3){
                            
      out.write("\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                <div class=\"col-sm-4 col-xs-4 product-info text-center\">\r\n");
      out.write("                                    <img class=\"product-image\" src=");
      out.print(product.getImageUrl());
      out.write(" alt=");
      out.print(product.getName());
      out.write(" />\r\n");
      out.write("                                    <span>BDT ");
      out.print(product.getPrice() - ((product.getSale()*product.getPrice())/100));
      out.write("</span>\r\n");
      out.write("                                    <del>BDT ");
      out.print(product.getPrice());
      out.write("</del>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            ");

                            cnt += 1;
                            }}
                            
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"container-fluid\">\r\n");
      out.write("                            ");

                            cnt = 0;                                                                                            //java code
                            for(ProductDto product : productsBySale) {
                            if(cnt == 3){
                            
      out.write("\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                <div class=\"col-sm-4 col-xs-4 product-info text-center\">\r\n");
      out.write("                                    <img class=\"product-image\" src=");
      out.print(product.getImageUrl());
      out.write(" alt=");
      out.print(product.getName());
      out.write(" />\r\n");
      out.write("                                    <span>BDT ");
      out.print(product.getPrice() - ((product.getSale()*product.getPrice())/100));
      out.write("</span>\r\n");
      out.write("                                    <del>BDT ");
      out.print(product.getPrice());
      out.write("</del>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            ");

                            }else{
                                cnt += 1;
                            }
                            }
                            
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Start of top rated-->\r\n");
      out.write("        <section id=\"top-rated\" class=\"product-content\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"col-lg-7 col-md-7 col-sm-7 col-xs-7\">\r\n");
      out.write("                        <h4>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                        <i>TOP RATED</i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        </h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-offset-2 col-lg-offset-2 col-sm-offset-2 col-xs-offset-2 col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right\">\r\n");
      out.write("                        <h4>\r\n");
      out.write("                        <a href=\"#\"><i>View more</i></a>\r\n");
      out.write("                        </h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"col-sm-4 col-xs-4 logo\">\r\n");
      out.write("                        <img  src=\"images/home/girl1.jpg\" alt=\"\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-8 col-xs-8\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"container-fluid\">\r\n");
      out.write("                            ");
                                                                                          //java code
                            cnt = 0;
                            for(ProductDto product : productsByRatings) {
                            if(cnt < 3){
                            
      out.write("\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                <div class=\"col-sm-4 col-xs-4 product-info text-center\">\r\n");
      out.write("                                    <img class=\"product-image\" src=");
      out.print(product.getImageUrl());
      out.write(" alt=");
      out.print(product.getName());
      out.write(" />\r\n");
      out.write("                                    <span>BDT ");
      out.print(product.getPrice());
      out.write("</span>\r\n");
      out.write("                                    <div class=\"rating-box\">\r\n");
      out.write("                                        <div class=\"rating readonly-rating\" data-score=\"4\"></div>\r\n");
      out.write("                                        <span>");
      out.print(product.getReview());
      out.write(" Review(s)</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            ");

                            cnt += 1;
                            }
                            }
                            
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"container-fluid\">\r\n");
      out.write("                            ");
                                                                                          //java code
                            cnt = 0;
                            for(ProductDto product : productsByRatings) {
                            if(cnt == 3){
                            
      out.write("\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                <div class=\"col-sm-4 col-xs-4 product-info text-center\">\r\n");
      out.write("                                    <img class=\"product-image\" src=");
      out.print(product.getImageUrl());
      out.write(" alt=");
      out.print(product.getName());
      out.write(" />\r\n");
      out.write("                                    <span>BDT ");
      out.print(product.getPrice());
      out.write("</span>\r\n");
      out.write("                                    <div class=\"rating-box\">\r\n");
      out.write("                                        <div class=\"rating readonly-rating\" data-score=");
      out.print(product.getRatings());
      out.write("></div>\r\n");
      out.write("                                        <span>");
      out.print(product.getReview());
      out.write(" Review(s)</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            ");

                            }else{
                                cnt += 1;
                            }
                            }
                            
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Best Seller -->\r\n");
      out.write("        <!-- Start of footer -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- Rating JS -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.raty.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.raty.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/custom.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
