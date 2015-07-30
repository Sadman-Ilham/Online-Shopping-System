package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sadman.dto.ProductDto;
import com.sadman.dto.ReviewDto;
import java.util.List;

public final class item_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("    ");

    ProductDto productDetails = (ProductDto) request.getAttribute("productDetails");                                //java code
    List<ReviewDto> reviewList = (List<ReviewDto>) request.getAttribute("reviewList");
    List<ProductDto> productFromThisSeller = (List<ProductDto>) request.getAttribute("productFromThisSeller");
    List<ProductDto> productOfSameType = (List<ProductDto>) request.getAttribute("productOfSameType");
    int cnt = 0, size = 0, i = 0;
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\r\n");
      out.write("        <title>oss | ");
      out.print(productDetails.getName());
      out.write("</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Font Awesome 4.3.0  -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\">\r\n");
      out.write("        <!-- Latest compiled and minified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("        <!-- Optional theme -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css\">\r\n");
      out.write("        <!-- <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'> -->\r\n");
      out.write("        <!-- Modified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/productinfo.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/perfect-scrollbar.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/settings.css\" media=\"screen\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animation.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.theme.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/chosen.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.raty.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <aside id=\"productinfo\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"col-xs-12\">\r\n");
      out.write("                        <div id=\"product-single\">\r\n");
      out.write("                            <!-- Product -->\r\n");
      out.write("                            <div class=\"product-single\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <!-- Product Images Carousel -->\r\n");
      out.write("                                    <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-4 product-single-image\">\r\n");
      out.write("                                        <div id=\"product-slider\">\r\n");
      out.write("                                            <ul class=\"slides\">\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <img class=\"cloud-zoom\" src=");
      out.print(productDetails.getImageUrl());
      out.write(" data-large=");
      out.print(productDetails.getImageUrl());
      out.write(" alt=\"\"/>\r\n");
      out.write("                                                    <a class=\"fullscreen-button\" href=\"img/products/single1.jpg\">\r\n");
      out.write("                                                    </a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div id=\"product-carousel\">\r\n");
      out.write("                                            <ul class=\"slides\">\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a class=\"fancybox\" rel=\"product-images\" href=");
      out.print(productDetails.getImageUrl());
      out.write("></a>\r\n");
      out.write("                                                    <img src=");
      out.print(productDetails.getImageUrl());
      out.write(" data-large=");
      out.print(productDetails.getImageUrl());
      out.write(" alt=\"\"/>\r\n");
      out.write("                                                </li>\r\n");
      out.write("\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a class=\"fancybox\" rel=\"product-images\" href=\"images/products/45.jpg\"></a>\r\n");
      out.write("                                                    <img src=\"images/products/45.jpg\" data-large=\"images/products/45.jpg\" alt=\"\"/>\r\n");
      out.write("                                                </li>\r\n");
      out.write("\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a class=\"fancybox\" rel=\"product-images\" href=\"images/products/48.jpg\"></a>\r\n");
      out.write("                                                    <img src=\"images/products/48.jpg\" data-large=\"images/products/48.jpg\" alt=\"\"/>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                            <div class=\"product-arrows\">\r\n");
      out.write("                                                <div class=\"left-arrow\">\r\n");
      out.write("                                                    <i class=\"icons fa fa-caret-left\"></i>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"right-arrow\">\r\n");
      out.write("                                                    <i class=\"icons fa fa-caret-right\"></i>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-8 col-md-8 col-sm-8 col-xs-8 productinfo-style\">\r\n");
      out.write("                                        <h1><strong>");
      out.print(productDetails.getName());
      out.write("</strong></h1>\r\n");
      out.write("                                        <div class=\"rating-box\">\r\n");
      out.write("                                            <div class=\"rating readonly-rating\" data-score=");
      out.print(productDetails.getRatings());
      out.write("></div>\r\n");
      out.write("                                            <span><h5 style=\"float: left;\">");
      out.print(productDetails.getReview());
      out.write(" Review(s)</h5></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        ");

                                        if(productDetails.getSale() > 0) {
                                        
      out.write("\r\n");
      out.write("                                        <div class=\"product-price\">\r\n");
      out.write("                                            <span>BDT ");
      out.print(productDetails.getPrice() - ((productDetails.getSale()*productDetails.getPrice())/100));
      out.write("</span>\r\n");
      out.write("                                            <del>BDT ");
      out.print(productDetails.getPrice());
      out.write("</del>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        ");

                                        }else {
                                        
      out.write("\r\n");
      out.write("                                        <div class=\"product-price\">\r\n");
      out.write("                                            <span>BDT ");
      out.print(productDetails.getPrice());
      out.write("</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        ");

                                        }
                                        
      out.write("\r\n");
      out.write("                                        <table class=\"product-actions-single\">\r\n");
      out.write("                                            <tbody>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>Quantity:</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <div class=\"numeric-input\">\r\n");
      out.write("                                                            <input type=\"text\" value=\"1\">\r\n");
      out.write("                                                            <span class=\"arrow-up\"><i class=\"icons fa fa-caret-up\"></i></span>\r\n");
      out.write("                                                            <span class=\"arrow-down\"><i class=\"icons fa fa-caret-down\"></i></span>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </tbody>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                        <div class=\"total-price\">\r\n");
      out.write("                                            <span class=\"total-price-text\">Total Price:</span>\r\n");
      out.write("                                            <span class=\"total\">BDT ");
      out.print(productDetails.getPrice() * 1);
      out.write("</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"seller-info\">\r\n");
      out.write("                                            <span>Selling by,</span>\r\n");
      out.write("                                            <a href=\"#\">");
      out.print(productDetails.getStoreName());
      out.write("</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"product-actions\">\r\n");
      out.write("                                            <span class=\"green product-action current\">\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                            <span class=\"action-wrapper\">\r\n");
      out.write("                                            <i class=\"icons fa fa-credit-card\"></i>\r\n");
      out.write("                                            <span class=\"action-name\">Buy Now</span>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                            <span class=\"add-to-favorites\">\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                            <span class=\"action-wrapper\">\r\n");
      out.write("                                            <i class=\"icons fa fa-heart-o\"></i>\r\n");
      out.write("                                            <span class=\"action-name\">Add to wishlist</span>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                            <span class=\"add-to-compare\">\r\n");
      out.write("                                            <a href=\"#\"> <span class=\"action-wrapper\">\r\n");
      out.write("                                            <i class=\"icons fa fa-shopping-cart\"></i>\r\n");
      out.write("                                            <span class=\"action-name\">Add to cart</span>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- /Product -->\r\n");
      out.write("                            <!-- Product Tabs -->\r\n");
      out.write("                            <div class=\"row tab-style\">\r\n");
      out.write("                                <div class=\"container-fluid\">\r\n");
      out.write("                                    <div class=\"col-sm-12\">\r\n");
      out.write("                                        <ul class=\"nav nav-tabs navtab-style\">\r\n");
      out.write("                                            <li class=\"active\"><a  data-toggle=\"tab\" href=\"#tab1\">Description</a></li>\r\n");
      out.write("                                            <li><a  data-toggle=\"tab\" href=\"#tab2\">Review</a></li>\r\n");
      out.write("                                            <li><a  data-toggle=\"tab\" href=\"#tab3\">Images</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                        <div class=\"page-content tab-content\">\r\n");
      out.write("                                            <div id=\"tab1\" class=\"tab-pane fade in active\">\r\n");
      out.write("                                                <p>");
      out.print(productDetails.getDescription());
      out.write("</p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div id=\"tab2\" class=\"tab-pane fade\">\r\n");
      out.write("                                                <div class=\"row\">\r\n");
      out.write("                                                    <div class=\"col-lg-6 col-md-6 col-sm-6\">\r\n");
      out.write("                                                        <div class=\"category-results\">\r\n");
      out.write("                                                            <p>Results 1-6 of 6</p>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"col-lg-6 col-md-6 col-sm-6\">\r\n");
      out.write("                                                        <div class=\"pagination\">\r\n");
      out.write("                                                            <a href=\"#\"><div class=\"previous\"><i class=\"icons fa fa-caret-left\"></i></div></a>\r\n");
      out.write("                                                            <a href=\"#\"><div class=\"page-button\">1</div></a>\r\n");
      out.write("                                                            <a href=\"#\"><div class=\"page-button\">2</div></a>\r\n");
      out.write("                                                            <a href=\"#\"><div class=\"page-button\">3</div></a>\r\n");
      out.write("                                                            <a href=\"#\"><div class=\"next\"><i class=\"icons fa fa-caret-right\"></i></div></a>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <ul class=\"comments\">\r\n");
      out.write("\r\n");
      out.write("                                                    ");
                                                                      //java code
                                                    for(ReviewDto review : reviewList) {
                                                    
      out.write("\r\n");
      out.write("                                                    <li>\r\n");
      out.write("                                                        <p><strong><a href=\"#\">");
      out.print(review.getCustomerName());
      out.write("</a></strong></p>\r\n");
      out.write("                                                        <span class=\"date\">");
      out.print(review.getDateTime());
      out.write("</span>\r\n");
      out.write("                                                        <i class=\"icons green fa fa-thumbs-o-up\"></i>\r\n");
      out.write("                                                        <i class=\"icons sum no-pointer green-sum\">1</i>\r\n");
      out.write("                                                        <i class=\"icons red fa fa-thumbs-o-down\"></i>\r\n");
      out.write("                                                        <i class=\"icons fa fa-reply\"></i>\r\n");
      out.write("                                                        <div class=\"rating-box\">\r\n");
      out.write("                                                            <div class=\"rating readonly-rating\" data-score=\"4\"></div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <br>\r\n");
      out.write("                                                        <p>");
      out.print(review.getComment());
      out.write("</p>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    ");

                                                    }
                                                    
      out.write("\r\n");
      out.write("                                                    <li>\r\n");
      out.write("                                                        <p><strong><a href=\"#\">Anna Doe</a></strong></p>\r\n");
      out.write("                                                        <span class=\"date\">2013-10-09 09:23</span>\r\n");
      out.write("                                                        <i class=\"icons green fa fa-thumbs-o-up\"></i>\r\n");
      out.write("                                                        <i class=\"icons sum no-pointer\">0</i>\r\n");
      out.write("                                                        <i class=\"icons red fa fa-thumbs-o-down\"></i>\r\n");
      out.write("                                                        <i class=\"icons fa fa-reply\"></i>\r\n");
      out.write("                                                        <div class=\"rating-box\">\r\n");
      out.write("                                                            <div class=\"rating readonly-rating\" data-score=\"4\"></div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <br>\r\n");
      out.write("                                                        <p>Ut tellus dolor, dapibus eget, elementum vel, cursus eleifend, elit. Aenean auctor wisi et urna. Aliquam erat volutpat. Duis ac turpis. Integer rutrum ante eu lacus.Vestibulum libero nisl, porta vel, scelerisque eget, malesuada at, neque.</p>\r\n");
      out.write("                                                        <ul>\r\n");
      out.write("                                                            <li>\r\n");
      out.write("                                                                <p><strong><a href=\"#\">Anna Doe</a></strong></p>\r\n");
      out.write("                                                                <p>Ut tellus dolor, dapibus eget, elementum vel, cursus eleifend, elit. Aenean auctor wisi et urna. Aliquam erat volutpat. Duis ac turpis. Integer rutrum ante eu lacus.Vestibulum libero nisl, porta vel, scelerisque eget, malesuada at, neque.</p>\r\n");
      out.write("                                                            </li>\r\n");
      out.write("                                                        </ul>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div id=\"tab3\" class=\"tab-pane fade\">\r\n");
      out.write("                                                <ul class=\"comments\">\r\n");
      out.write("                                                    <li>\r\n");
      out.write("                                                        <img style=\"width: 100%; height: 100%;\" src=");
      out.print(productDetails.getImageUrl());
      out.write(" />\r\n");
      out.write("                                                        <img style=\"width: 100%; height: 100%;\" src=");
      out.print(productDetails.getImageUrl());
      out.write(" />\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </aside>\r\n");
      out.write("        <!-- Related Product -->\r\n");
      out.write("        <section id=\"related-product\" class=\"product-content\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"col-sm-2 col-xs-2\">\r\n");
      out.write("                        <h4>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                        <i>Product From This Store</i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        </h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-offset-9 col-xs-offset-9 col-sm-1 col-xs- text-center\">\r\n");
      out.write("                        <h4>\r\n");
      out.write("                        <a href=\"#\"><i>View more</i></a>\r\n");
      out.write("                        </h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"col-sm-12 col-xs-12\">\r\n");
      out.write("                        <div class=\"row first-row\">\r\n");
      out.write("                            <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                ");

                                size = productFromThisSeller.size();
                                if(size > 4) {
                                    cnt = 4;
                                }else {
                                    cnt = size;
                                }
                                for(i=0; i<cnt; i++) {
                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                <div class=\"col-sm-3 col-xs-3 product-info text-center\">\r\n");
      out.write("                                    <img class=\"product-image\" src=");
      out.print(productFromThisSeller.get(i).getImageUrl());
      out.write(" alt=\"\" />\r\n");
      out.write("                                    <span>BDT ");
      out.print(productFromThisSeller.get(i).getPrice());
      out.write("</span>\r\n");
      out.write("                                    <div class=\"rating-box\">\r\n");
      out.write("                                        <div class=\"rating readonly-rating\" data-score=");
      out.print(productFromThisSeller.get(i).getRatings());
      out.write("></div>\r\n");
      out.write("                                        <span>");
      out.print(productFromThisSeller.get(i).getReview());
      out.write(" Review(s)</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                ");

                                }
                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row second-row\">\r\n");
      out.write("                            <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                                ");

                                if( (size - cnt) > 4) {
                                    cnt = 4;
                                }else {
                                    cnt = size - cnt;
                                }
                                for(i = 0; i<cnt; i++) {
                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                <div class=\"col-sm-3 col-xs-3 product-info text-center\">\r\n");
      out.write("                                    <img class=\"product-image\" src=");
      out.print(productFromThisSeller.get(i+4).getImageUrl());
      out.write(" alt=\"\" />\r\n");
      out.write("                                    <span>BDT ");
      out.print(productFromThisSeller.get(i+4).getPrice());
      out.write("</span>\r\n");
      out.write("                                    <div class=\"rating-box\">\r\n");
      out.write("                                        <div class=\"rating readonly-rating\" data-score=");
      out.print(productFromThisSeller.get(i+4).getRatings());
      out.write("></div>\r\n");
      out.write("                                        <span>");
      out.print(productFromThisSeller.get(i+4).getReview());
      out.write(" Review(s)</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                ");

                                }
                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Products On Sale -->\r\n");
      out.write("        <section id=\"products-on-sale\" class=\"product-content\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"col-sm-2 col-xs-2\">\r\n");
      out.write("                        <h4>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                        <i>Related Products</i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        </h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-offset-9 col-xs-offset-9 col-sm-1 col-xs- text-center\">\r\n");
      out.write("                        <h4>\r\n");
      out.write("                        <a href=\"#\"><i>View more</i></a>\r\n");
      out.write("                        </h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"col-sm-12 col-xs-12\">\r\n");
      out.write("                        <div class=\"row first-row\">\r\n");
      out.write("                            <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                                ");

                                size = productOfSameType.size();
                                if(size > 4) {
                                    cnt = 4;
                                }else {
                                    cnt = size;
                                }
                                for(i=0; i<cnt; i++) {
                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                <div class=\"col-sm-3 col-xs-3 product-info text-center\">\r\n");
      out.write("                                    <img class=\"product-image\" src=");
      out.print(productOfSameType.get(i).getImageUrl());
      out.write(" alt=\"\" />\r\n");
      out.write("                                    <span>BDT ");
      out.print(productOfSameType.get(i).getPrice());
      out.write("</span>\r\n");
      out.write("                                    <div class=\"rating-box\">\r\n");
      out.write("                                        <div class=\"rating readonly-rating\" data-score=");
      out.print(productOfSameType.get(i).getRatings());
      out.write("></div>\r\n");
      out.write("                                        <span>");
      out.print(productOfSameType.get(i).getReview());
      out.write(" Review(s)</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                ");

                                }
                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row second-row\">\r\n");
      out.write("                            <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                                ");

                                if( (size - cnt) > 4) {
                                    cnt = 4;
                                }else {
                                    cnt = size - cnt;
                                }
                                for(i = 0; i<cnt; i++) {
                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                <div class=\"col-sm-3 col-xs-3 product-info text-center\">\r\n");
      out.write("                                    <img class=\"product-image\" src=");
      out.print(productOfSameType.get(i+4).getImageUrl());
      out.write(" alt=\"\" />\r\n");
      out.write("                                    <span>BDT ");
      out.print(productOfSameType.get(i+4).getPrice());
      out.write("</span>\r\n");
      out.write("                                    <div class=\"rating-box\">\r\n");
      out.write("                                        <div class=\"rating readonly-rating\" data-score=");
      out.print(productOfSameType.get(i+4).getRatings());
      out.write("></div>\r\n");
      out.write("                                        <span>");
      out.print(productOfSameType.get(i+4).getReview());
      out.write(" Review(s)</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                ");

                                }
                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- JavaScript -->\r\n");
      out.write("        <script src=\"js/modernizr.min.js\"></script>\r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-ui.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.raty.js\"></script>\r\n");
      out.write("        <!-- Scroll Bar -->\r\n");
      out.write("        <script src=\"js/perfect-scrollbar.min.js\"></script>\r\n");
      out.write("        <!-- Cloud Zoom -->\r\n");
      out.write("        <script src=\"js/zoomsl-3.0.min.js\"></script>\r\n");
      out.write("        <!-- FancyBox -->\r\n");
      out.write("        <script src=\"js/jquery.fancybox.pack.js\"></script>\r\n");
      out.write("        <!-- jQuery REVOLUTION Slider  -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.themepunch.plugins.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.themepunch.revolution.min.js\"></script>\r\n");
      out.write("        <!-- FlexSlider -->\r\n");
      out.write("        <script defer src=\"js/flexslider.min.js\"></script>\r\n");
      out.write("        <!-- IOS Slider -->\r\n");
      out.write("        <script src = \"js/jquery.iosslider.min.js\"></script>\r\n");
      out.write("        <!-- noUi Slider -->\r\n");
      out.write("        <script src=\"js/jquery.nouislider.min.js\"></script>\r\n");
      out.write("        <!-- Owl Carousel -->\r\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("        <!-- Cloud Zoom -->\r\n");
      out.write("        <script src=\"js/zoomsl-3.0.min.js\"></script>\r\n");
      out.write("        <!-- SelectJS -->\r\n");
      out.write("        <script src=\"js/chosen.jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- Main JS -->\r\n");
      out.write("        <script src=\"js/main-script.js\"></script>\r\n");
      out.write("        <script src=\"js/custom.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
