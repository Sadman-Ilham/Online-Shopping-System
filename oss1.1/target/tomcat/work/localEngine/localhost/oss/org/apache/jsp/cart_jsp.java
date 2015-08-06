package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sadman.dto.ProductDto;
import com.sadman.dto.CustomerDetailsDto;
import com.sadman.dto.OrderDto;
import java.util.List;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>oss | Cart</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Font Awesome 4.3.0  -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\">\r\n");
      out.write("        <!-- Latest compiled and minified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("        <!-- Optional theme -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css\">\r\n");
      out.write("        <!-- <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'> -->\r\n");
      out.write("        <!-- Modified CSS -->\r\n");
      out.write("        <link href=\"css/cart.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Half-slider CSS -->\r\n");
      out.write("        <link href=\"css/half-slider.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.raty.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");

        CustomerDetailsDto sessionUser = (CustomerDetailsDto) session.getAttribute("sessionUser");
        List<ProductDto> productList = (List<ProductDto>) request.getAttribute("cartProductList");
        List<OrderDto> orderPlacedProductList = (List<OrderDto>) request.getAttribute("orderPlacedProductList");
        List<OrderDto> orderPurchasedProductList = (List<OrderDto>) request.getAttribute("orderPurchasedProductList");
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"modal fade\" id=\"checkout-modal\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-dialog\">\r\n");
      out.write("                    <!-- Modal content-->\r\n");
      out.write("                    <div class=\"modal-content\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                            <h4 class=\"modal-title\">Code Validation</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body\">\r\n");
      out.write("                            <form action=\"\" method=\"POST\" role=\"form\">\r\n");
      out.write("                                <div class=\"form-group form-inline sad-code-form\" >\r\n");
      out.write("                                    <input type=\"hidden\" name=\"oid\" id=\"oid\" value=\"\">\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control code-text\" id=\"\" placeholder=\"Enter your code here\">\r\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-success form-control checkout-modal-btn\" value=\"Checkout\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <section id=\"cart-product\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"col-lg-9 col-md-9 col-sm-9 col-xs-9 product-content\">\r\n");
      out.write("                        <ul class=\"nav nav-tabs navtab-style\">\r\n");
      out.write("                            <li class=\"active\"><a data-toggle=\"tab\" href=\"#tab1\">Cart</a></li>\r\n");
      out.write("                            <li><a data-toggle=\"tab\" href=\"#tab2\">Order Placed</a></li>\r\n");
      out.write("                            <li><a data-toggle=\"tab\" href=\"#tab3\">Order Purchased</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div class=\"tab-content\">\r\n");
      out.write("                            <div id=\"tab1\" class=\"tab-pane fade in active\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"container-fluid\">\r\n");
      out.write("                                        ");

                                        for(ProductDto product : productList) {
                                        
      out.write("\r\n");
      out.write("                                        <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 product-list\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"container-fluid\">\r\n");
      out.write("                                                    <div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-3 productlist-image\">\r\n");
      out.write("                                                        <img  src=");
      out.print(product.getImageUrl());
      out.write(" alt=\"\" />\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"col-lg-9 col-md-9 col-sm-9 col-xs-9\">\r\n");
      out.write("                                                        <div class=\"row\">\r\n");
      out.write("                                                            <div class=\"container-fluid\">\r\n");
      out.write("                                                                <div class=\"col-lg-8 col-md-8 col-sm-8 col-xs-8 product-desc\">\r\n");
      out.write("                                                                    <div class=\"product-name\">\r\n");
      out.write("                                                                        <h3>\r\n");
      out.write("                                                                        <a href=\"#\"><span class=\"text-center\">");
      out.print(product.getName());
      out.write("</a>\r\n");
      out.write("                                                                        </h3>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"shop-name\">\r\n");
      out.write("                                                                        <a href=\"#\"><span>");
      out.print(product.getStoreName());
      out.write("</span></a>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"rating-box\">\r\n");
      out.write("                                                                        <div class=\"rating medal readonly-rating\" data-score=");
      out.print(product.getStoreRatings());
      out.write(" alt=\"shop-rating\"></div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                <div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-3 infoprice\">\r\n");
      out.write("                                                                    <span class=\"value\">BDT ");
      out.print(product.getPrice());
      out.write("</span>\r\n");
      out.write("                                                                    <span class=\"separator\">/</span>\r\n");
      out.write("                                                                    <span class=\"unit\">piece</span>\r\n");
      out.write("                                                                    ");

                                                                    if(product.getSale() > 0) {
                                                                    
      out.write("\r\n");
      out.write("                                                                    <br>\r\n");
      out.write("                                                                    <span class=\"saleValue\">Now BDT ");
      out.print(product.getPrice() - ((product.getSale()*product.getPrice())/100));
      out.write("</span>\r\n");
      out.write("                                                                    <span class=\"separator\">/</span>\r\n");
      out.write("                                                                    <span class=\"unit\">piece</span>\r\n");
      out.write("                                                                    ");

                                                                    }
                                                                    
      out.write("\r\n");
      out.write("                                                                    <div class=\"rating-box\">\r\n");
      out.write("                                                                        <div class=\"rating readonly-rating\" data-score=");
      out.print(product.getRatings());
      out.write("></div>\r\n");
      out.write("                                                                        <span>");
      out.print(product.getReview());
      out.write(" Review(s)</span>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"rate-history\">\r\n");
      out.write("                                                                        <span class=\"order-num\">\r\n");
      out.write("                                                                        <a href=\"\" class=\"order-num-a\">Orders  (");
      out.print(product.getOrder());
      out.write(")</a>\r\n");
      out.write("                                                                        </span>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                <div class=\"col-lg-1 col-md-1 col-sm-1 col-xs-1 text-right cross\">\r\n");
      out.write("                                                                    <a href=\"\"><i class=\"fa fa-times\"></i></a>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"row\">\r\n");
      out.write("                                                            <div class=\"container-fluid\">\r\n");
      out.write("                                                                <form method=\"get\" action=\"/oss/order\" id=\"orderForm");
      out.print(product.getId());
      out.write("\">\r\n");
      out.write("                                                                <input type=\"hidden\" name=\"pid\" value=");
      out.print(product.getId());
      out.write(">\r\n");
      out.write("                                                                <select name=\"qn\">\r\n");
      out.write("                                                                    ");

                                                                    for(int i=0; i<product.getAvailable(); i++) {
                                                                    
      out.write("\r\n");
      out.write("                                                                        <option value=");
      out.print(i+1);
      out.write('>');
      out.print(i+1);
      out.write("</option>\r\n");
      out.write("                                                                    ");

                                                                    }
                                                                    
      out.write("\r\n");
      out.write("                                                                </select>\r\n");
      out.write("                                                                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 add-to text-right\" >\r\n");
      out.write("                                                                    <a class=\"btn btn-sm btn-success\" onclick=\"document.getElementById('orderForm");
      out.print(product.getId());
      out.write("').submit();\"><i class=\"fa fa-credit-card\"></i> <span class=\"icon-text\">Buy Now</span></a>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                </form>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        ");

                                        }
                                        
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"tab2\" class=\"tab-pane fade\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"container-fluid\">\r\n");
      out.write("                                        ");

                                        if(orderPlacedProductList != null) {
                                        for(OrderDto order : orderPlacedProductList) {
                                        
      out.write("\r\n");
      out.write("                                        <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 product-list\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"container-fluid\">\r\n");
      out.write("                                                    <div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-3 productlist-image\">\r\n");
      out.write("                                                        <img  src=");
      out.print(order.getImageUrl());
      out.write(" alt=\"\" />\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"col-lg-9 col-md-9 col-sm-9 col-xs-9\">\r\n");
      out.write("                                                        <div class=\"row\">\r\n");
      out.write("                                                            <div class=\"container-fluid\">\r\n");
      out.write("                                                                <div class=\"col-lg-8 col-md-8 col-sm-8 col-xs-8 product-desc\">\r\n");
      out.write("                                                                    <div class=\"product-name\">\r\n");
      out.write("                                                                        <h3>\r\n");
      out.write("                                                                        <a href=\"#\"><span class=\"text-center\">");
      out.print(order.getProductName());
      out.write("</a>\r\n");
      out.write("                                                                        </h3>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"shop-name\">\r\n");
      out.write("                                                                        <a href=\"#\"><span>");
      out.print(order.getStoreName());
      out.write("</span></a>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"rating-box\">\r\n");
      out.write("                                                                        <div class=\"rating medal readonly-rating\" data-score=");
      out.print(order.getStoreRatings());
      out.write(" alt=\"shop-rating\"></div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                <div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-3 infoprice\">\r\n");
      out.write("                                                                    <span class=\"value\">Purchased With BDT ");
      out.print(order.getPrice());
      out.write("</span>\r\n");
      out.write("                                                                    <span class=\"separator\">/</span>\r\n");
      out.write("                                                                    <span class=\"unit\">piece</span>\r\n");
      out.write("                                                                    <div class=\"rating-box\">\r\n");
      out.write("                                                                        <div class=\"rating readonly-rating\" data-score=");
      out.print(order.getProductRatings());
      out.write("></div>\r\n");
      out.write("                                                                        <span>");
      out.print(order.getProductReview());
      out.write(" Review(s)</span>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"rate-history\">\r\n");
      out.write("                                                                        <span class=\"order-num\">\r\n");
      out.write("                                                                        <a href=\"\" class=\"order-num-a\">Orders ()</a>\r\n");
      out.write("                                                                        </span>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                <div class=\"col-lg-1 col-md-1 col-sm-1 col-xs-1 text-right cross\">\r\n");
      out.write("                                                                    <a href=\"\"><i class=\"fa fa-times\"></i></a>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"row\">\r\n");
      out.write("                                                            <div class=\"container-fluid\">\r\n");
      out.write("                                                                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 add-to text-right\" >\r\n");
      out.write("                                                                    <a class=\"btn btn-sm btn-success\" data-toggle=\"modal\" data-target=\"#checkout-modal\" id=");
      out.print(order.getId());
      out.write("><i class=\"fa fa-credit-card\"></i> <span class=\"icon-text\">Checkout</span></a>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                </form>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        ");

                                        }
                                        }
                                        
      out.write("\r\n");
      out.write("                                        <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center pagination-style\">\r\n");
      out.write("                                            <nav>\r\n");
      out.write("                                                <ul class=\"pagination\">\r\n");
      out.write("                                                    <li class=\"disabled\"><a href=\"#\" aria-label=\"Previous\"><span aria-hidden=\"true\">&laquo;</span></a></li>\r\n");
      out.write("                                                    <li class=\"active\"><a href=\"#\">1 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">2 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">3 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">4 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">5 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">6 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                                    <li class=\"active\"><a href=\"#\" aria-label=\"Next\"><span aria-hidden=\"true\">&raquo;</span></a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </nav>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"tab3\" class=\"tab-pane fade\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"container-fluid\">\r\n");
      out.write("                                        <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 product-list\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"container-fluid\">\r\n");
      out.write("                                                    <div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-3 productlist-image\">\r\n");
      out.write("                                                        <img  src=\"images/home/product7.jpg\" alt=\"\" />\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"col-lg-9 col-md-9 col-sm-9 col-xs-9\">\r\n");
      out.write("                                                        <div class=\"row\">\r\n");
      out.write("                                                            <div class=\"container-fluid\">\r\n");
      out.write("                                                                <div class=\"col-lg-8 col-md-8 col-sm-8 col-xs-8 product-desc\">\r\n");
      out.write("                                                                    <div class=\"product-name\">\r\n");
      out.write("                                                                        <h3>\r\n");
      out.write("                                                                        <a href=\"#\"><span class=\"text-center\">\r\n");
      out.write("                                                                        Special PU Leather Flip Case For Original Xiaomi Mi4i Mi 4i Qualcomm Snapdragon 615 Octa Core Phone Free Shipping High Quality(China (Mainland))\r\n");
      out.write("                                                                        5 Colors Available</span></a>\r\n");
      out.write("                                                                        </h3>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"shop-name\">\r\n");
      out.write("                                                                        <a href=\"#\"><span>Shop Name</span></a>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"rating-box\">\r\n");
      out.write("                                                                        <div class=\"rating medal readonly-rating\" data-score=\"3\" alt=\"shop-rating\"></div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                <div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-3 infoprice\">\r\n");
      out.write("                                                                    <span class=\"value\">US $9.99</span>\r\n");
      out.write("                                                                    <span class=\"separator\">/</span>\r\n");
      out.write("                                                                    <span class=\"unit\">piece</span>\r\n");
      out.write("                                                                    <div class=\"rating-box\">\r\n");
      out.write("                                                                        <div class=\"rating readonly-rating\" data-score=\"3\"></div>\r\n");
      out.write("                                                                        <span>3 Review(s)</span>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"rate-history\">\r\n");
      out.write("                                                                        <span class=\"order-num\">\r\n");
      out.write("                                                                        <a href=\"\" class=\"order-num-a\">Orders  (3)</a>\r\n");
      out.write("                                                                        </span>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                <div class=\"col-lg-1 col-md-1 col-sm-1 col-xs-1 text-right cross\">\r\n");
      out.write("                                                                    <a href=\"\"><i class=\"fa fa-times\"></i></a>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center pagination-style\">\r\n");
      out.write("                                            <nav>\r\n");
      out.write("                                                <ul class=\"pagination\">\r\n");
      out.write("                                                    <li class=\"disabled\"><a href=\"#\" aria-label=\"Previous\"><span aria-hidden=\"true\">&laquo;</span></a></li>\r\n");
      out.write("                                                    <li class=\"active\"><a href=\"#\">1 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">2 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">3 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">4 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">5 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">6 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                                    <li class=\"active\"><a href=\"#\" aria-label=\"Next\"><span aria-hidden=\"true\">&raquo;</span></a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </nav>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-3 product-price text-center\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"container-fluid\">\r\n");
      out.write("                                <div class=\"product-quantity\">\r\n");
      out.write("                                    <span class=\"total-product-text\">No. Of Products:</span>\r\n");
      out.write("                                    <span class=\"total\">5</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"total-price\">\r\n");
      out.write("                                    <span class=\"total-price-text\">Total Price:</span>\r\n");
      out.write("                                    <span class=\"total\">BDT 500.0</span>\r\n");
      out.write("                                </div>\r\n");
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
      out.write("        <script src=\"http://code.jquery.com/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- Rating JS -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.raty.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("         <script>\r\n");
      out.write("            $('#checkout-modal').on('show.bs.modal', function(e) {\r\n");
      out.write("                document.getElementById('oid').value = e.relatedTarget.id;\r\n");
      out.write("            })\r\n");
      out.write("        </script>\r\n");
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
