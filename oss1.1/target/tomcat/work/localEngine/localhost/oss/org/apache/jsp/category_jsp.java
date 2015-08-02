package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sadman.dto.ProductDto;
import com.sadman.dto.CategoryDto;
import com.sadman.dto.SubCategoryDto;
import java.util.List;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>oss | Category</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Font Awesome 4.3.0  -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\">\r\n");
      out.write("        <!-- Latest compiled and minified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("        <!-- Optional theme -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css\">\r\n");
      out.write("        <!-- <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'> -->\r\n");
      out.write("        <!-- Modified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/productlist.css\">\r\n");
      out.write("        <link href=\"css/index.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
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

        List<ProductDto> productList = (List<ProductDto>) request.getAttribute("productList");              //java code
        List<SubCategoryDto> subCategoryList = (List<SubCategoryDto>) request.getAttribute("subCategoryList");
        CategoryDto parentCategory = (CategoryDto) request.getAttribute("parentCategory");
        List<CategoryDto> categoryList = (List<CategoryDto>) request.getAttribute("categoryList");
        int cnt = 0;
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <section id=\"productpage\" style=\"\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"col-lg-2 col-md-2 col-sm-2 col-xs-2\" style=\"border-right: 1px solid #ddd;\">\r\n");
      out.write("                        <div class=\"navcontainer\">\r\n");
      out.write("                            <span>Recent Categories</span>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"/oss/category?type=All\">All Categories</a>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        ");

                                        if(parentCategory != null) {
                                        
      out.write("\r\n");
      out.write("                                        <li><a href=\"/oss/category?type=");
      out.print(parentCategory.getName());
      out.write('"');
      out.write('>');
      out.print(parentCategory.getName());
      out.write("</a>\r\n");
      out.write("                                            <ul>\r\n");
      out.write("                                        ");

                                        }
                                                if(request.getParameter("type") != null && !request.getParameter("type").equals("All")) {
                                        
      out.write("\r\n");
      out.write("                                                    <li>\r\n");
      out.write("                                                        <a href=\"/oss/category?type=");
      out.print(request.getParameter("type"));
      out.write('"');
      out.write('>');
      out.print(request.getParameter("type"));
      out.write("</a>\r\n");
      out.write("                                                        <ul>\r\n");
      out.write("                                                        ");

                                                        if(subCategoryList != null) {
                                                            for(SubCategoryDto subCategory : subCategoryList) {
                                                            
      out.write("\r\n");
      out.write("                                                                <li>\r\n");
      out.write("                                                                    <a href=\"/oss/category?type=");
      out.print(subCategory.getName());
      out.write('"');
      out.write('>');
      out.print(subCategory.getName());
      out.write("</a>\r\n");
      out.write("                                                                </li>\r\n");
      out.write("                                                            ");

                                                            }
                                                        }
                                                        
      out.write("\r\n");
      out.write("                                                        </ul>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                        ");

                                                }else {
                                                    for(CategoryDto category : categoryList) {
                                        
      out.write("\r\n");
      out.write("                                                        <li>\r\n");
      out.write("                                                            <a href=\"/oss/category?type=");
      out.print(category.getName());
      out.write('"');
      out.write('>');
      out.print(category.getName());
      out.write("</a>\r\n");
      out.write("                                                        </li>\r\n");
      out.write("                                        ");

                                                    }
                                                }
                                        if(parentCategory != null) {
                                        
      out.write("\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        ");

                                        }
                                        
      out.write("\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"top-category\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-10 col-md-10 col-sm-10 col-xs-10 product-search\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"container-fluid\">\r\n");
      out.write("                                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("                                    <ol class=\"breadcrumb\">\r\n");
      out.write("                                        <li><a href=\"/oss\">Home</a></li>\r\n");
      out.write("                                        ");

                                        if(request.getParameter("type") == null || request.getParameter("type").equals("")) {
                                        
      out.write("\r\n");
      out.write("                                        <li><a href=\"/oss/category?type=All\">All Categories</a></li>\r\n");
      out.write("                                        ");

                                        }else {
                                            if(parentCategory != null) {
                                            
      out.write("\r\n");
      out.write("                                            <li><a href=\"/oss/category?type=");
      out.print(parentCategory.getName());
      out.write('"');
      out.write('>');
      out.print(parentCategory.getName());
      out.write("</a></li>\r\n");
      out.write("                                            ");

                                            }
                                            if(request.getParameter("type").equals("All")) {
                                            
      out.write("\r\n");
      out.write("                                                <li><a href=\"/oss/category?type=");
      out.print(request.getParameter("type"));
      out.write("\">All Categories</a></li>\r\n");
      out.write("                                            ");

                                            }else {
                                            
      out.write("\r\n");
      out.write("                                                <li><a href=\"/oss/category?type=");
      out.print(request.getParameter("type"));
      out.write('"');
      out.write('>');
      out.print(request.getParameter("type"));
      out.write("</a></li>\r\n");
      out.write("                                            ");

                                            }
                                        }
                                        
      out.write("\r\n");
      out.write("                                    </ol>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"container-fluid\">\r\n");
      out.write("                                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 product-header\">\r\n");
      out.write("                                    <form action=\"/oss/category\" class=\"searchForm\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"type\" value=");
      out.print(request.getParameter("type"));
      out.write(">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label >Keyword</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"key\" class=\"search\" placeholder=\"\" >\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group form-inline\">\r\n");
      out.write("                                        <label class=\"price\">Price</label>\r\n");
      out.write("                                        <input class=\"to\" name=\"priceTo\" type=\"text\" placeholder=\"\" >\r\n");
      out.write("                                        <label >-</label>\r\n");
      out.write("                                        <input class=\"to\" name=\"priceFrom\" type=\"text\" placeholder=\"\" >\r\n");
      out.write("                                        <label class=\"quantity\">Quantity</label>\r\n");
      out.write("                                        <input class=\"to\" name=\"quantityTo\" type=\"text\" placeholder=\"\" >\r\n");
      out.write("                                        <label >-</label>\r\n");
      out.write("                                        <input class=\"to\" name=\"quantityFrom\" type=\"text\" placeholder=\"\" >\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-info btn-sm\">Search</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                    <div class=\"form-group form-inline\">\r\n");
      out.write("                                        <label class=\"sort\">Sort By</label>\r\n");
      out.write("                                        <li><a class=\"sortOpt\" href=\"#\">View&nbsp;<i class=\"fa fa-caret-down\"></i><span class=\"icon-text\"></span></a></li>\r\n");
      out.write("                                        <li><a class=\"sortOpt\" href=\"#\">Ratings&nbsp;<i class=\"fa fa-caret-down\"></i><span class=\"icon-text\"></span></a></li>\r\n");
      out.write("                                        <li><a class=\"sortOpt\" href=\"#\">Order&nbsp;<i class=\"fa fa-caret-down\"></i><span class=\"icon-text\"></span></a></li>\r\n");
      out.write("                                        <li><a class=\"sortOpt\" href=\"#\">Price&nbsp;<i class=\"fa fa-caret-down\"></i><span class=\"icon-text\"></span></a></li>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"container-fluid\">\r\n");
      out.write("                            ");

                            for(ProductDto product : productList) {   //for loop begin
                            
      out.write("\r\n");
      out.write("                                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 product-list\">\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"container-fluid\">\r\n");
      out.write("                                            <div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-3 productlist-image\">\r\n");
      out.write("                                                <img src=");
      out.print(product.getImageUrl());
      out.write(" alt=\"\" />\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-lg-9 col-md-9 col-sm-9 col-xs-9\">\r\n");
      out.write("                                                <div class=\"row\">\r\n");
      out.write("                                                    <div class=\"container-fluid\">\r\n");
      out.write("                                                        <div class=\"col-lg-8 col-md-8 col-sm-8 col-xs-8 product-desc\">\r\n");
      out.write("                                                            <div class=\"product-name\">\r\n");
      out.write("                                                                <h3>\r\n");
      out.write("                                                                <a href=\"#\"><span class=\"text-center\">");
      out.print(product.getName());
      out.write("</span></a>\r\n");
      out.write("                                                                </h3>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"shop-name\">\r\n");
      out.write("                                                                <a href=\"#\"><span>");
      out.print(product.getStoreName());
      out.write("</span></a>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"rating-box\">\r\n");
      out.write("                                                                <div class=\"rating medal readonly-rating\" data-score=");
      out.print(product.getStoreRatings());
      out.write(" alt=\"shop-rating\"></div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-4 infoprice\">\r\n");
      out.write("                                                            <span class=\"value\">BDT ");
      out.print(product.getPrice() - ((product.getSale()*product.getPrice())/100));
      out.write("</span>\r\n");
      out.write("                                                            <span class=\"separator\">/</span>\r\n");
      out.write("                                                            <span class=\"unit\">piece</span>\r\n");
      out.write("                                                            <div class=\"rating-box\">\r\n");
      out.write("                                                                <div class=\"rating readonly-rating\" data-score=");
      out.print(product.getRatings());
      out.write("></div>\r\n");
      out.write("                                                                <span>");
      out.print(product.getReview());
      out.write(" Review(s)</span>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"rate-history\">\r\n");
      out.write("                                                                <span class=\"order-num\">\r\n");
      out.write("                                                                <a href=\"\" class=\"order-num-a\">Orders  (");
      out.print(product.getOrder());
      out.write(")</a>\r\n");
      out.write("                                                                </span>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"row\">\r\n");
      out.write("                                                    <div class=\"container-fluid\">\r\n");
      out.write("                                                        <div class=\"col-lg-9 col-md-9 col-sm-9 col-xs-9\" >\r\n");
      out.write("                                                            <div class=\"add-to\">\r\n");
      out.write("                                                                <a href=\"#\"><i class=\"fa fa-heart-o\"></i> <span class=\"icon-text\">Add to wishlist</span></a>\r\n");
      out.write("                                                                <a href=\"#\"><i class=\"fa fa-shopping-cart\"></i> <span class=\"icon-text\">Add to cart</span></a>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-3\">\r\n");
      out.write("                                                            <div class=\"report text-right\">\r\n");
      out.write("                                                                <a href=\"#\"><i class=\"glyphicon glyphicon-flag\"></i> <span class=\"icon-text\">Report as fraud</span></a>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            ");

                            }   //for loop end
                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center pagination-style\">\r\n");
      out.write("                                    <nav>\r\n");
      out.write("                                        <ul class=\"pagination\">\r\n");
      out.write("                                            <li class=\"disabled\"><a href=\"#\" aria-label=\"Previous\"><span aria-hidden=\"true\">&laquo;</span></a></li>\r\n");
      out.write("                                            <li class=\"active\"><a href=\"#\">1 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                            <li><a href=\"#\">2 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                            <li><a href=\"#\">3 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                            <li><a href=\"#\">4 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                            <li><a href=\"#\">5 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                            <li><a href=\"#\">6 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                            <li><a href=\"#\">2 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                            <li><a href=\"#\">3 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                            <li><a href=\"#\">4 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                            <li><a href=\"#\">5 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                            <li><a href=\"#\">6 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                                            <li class=\"active\"><a href=\"#\" aria-label=\"Next\"><span aria-hidden=\"true\">&raquo;</span></a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </nav>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
