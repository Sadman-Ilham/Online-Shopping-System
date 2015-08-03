<%@page contentType="text/html" pageEncoding="UTF-8"
import = "com.sadman.dto.ProductDto"
import = "com.sadman.dto.CategoryDto"
import = "com.sadman.dto.SubCategoryDto"
import = "java.util.List"
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <title>oss | Category</title>

        <!-- Font Awesome 4.3.0  -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
        <!-- <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'> -->
        <!-- Modified CSS -->
        <link rel="stylesheet" type="text/css" href="css/productlist.css">
        <link href="css/index.css" type="text/css" rel="stylesheet">
        <!-- Half-slider CSS -->
        <link href="css/half-slider.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/jquery.raty.css">
    </head>
    <body>

        <jsp:include page="Header.jsp" />

        <%
        List<ProductDto> productList = (List<ProductDto>) request.getAttribute("productList");              //java code
        List<SubCategoryDto> subCategoryList = (List<SubCategoryDto>) request.getAttribute("subCategoryList");
        CategoryDto parentCategory = (CategoryDto) request.getAttribute("parentCategory");
        List<CategoryDto> categoryList = (List<CategoryDto>) request.getAttribute("categoryList");
        int cnt = 0;
        %>



        <section id="productpage" style="">
            <div class="row">
                <div class="container-fluid">
                    <div class="col-lg-2 col-md-2 col-sm-2 col-xs-2" style="border-right: 1px solid #ddd;">
                        <div class="navcontainer">
                            <span>Recent Categories</span>
                            <ul>
                                <li>
                                    <a href="/oss/category?type=All">All Categories</a>
                                    <ul>
                                        <%
                                        if(parentCategory != null) {
                                        %>
                                        <li><a href="/oss/category?type=<%=parentCategory.getName()%>"><%=parentCategory.getName()%></a>
                                            <ul>
                                        <%
                                        }
                                                if(request.getParameter("type") != null && !request.getParameter("type").equals("All")) {
                                        %>
                                                    <li>
                                                        <a href="/oss/category?type=<%=request.getParameter("type")%>"><%=request.getParameter("type")%></a>
                                                        <ul>
                                                        <%
                                                        if(subCategoryList != null) {
                                                            for(SubCategoryDto subCategory : subCategoryList) {
                                                            %>
                                                                <li>
                                                                    <a href="/oss/category?type=<%=subCategory.getName()%>"><%=subCategory.getName()%></a>
                                                                </li>
                                                            <%
                                                            }
                                                        }
                                                        %>
                                                        </ul>
                                                    </li>
                                        <%
                                                }else {
                                                    for(CategoryDto category : categoryList) {
                                        %>
                                                        <li>
                                                            <a href="/oss/category?type=<%=category.getName()%>"><%=category.getName()%></a>
                                                        </li>
                                        <%
                                                    }
                                                }
                                        if(parentCategory != null) {
                                        %>
                                            </ul>
                                        </li>
                                        <%
                                        }
                                        %>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="top-category">
                        </div>
                    </div>
                    <div class="col-lg-10 col-md-10 col-sm-10 col-xs-10 product-search">
                        <div class="row">
                            <div class="container-fluid">
                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    <ol class="breadcrumb">
                                        <li><a href="/oss">Home</a></li>
                                        <%
                                        if(request.getParameter("type") == null || request.getParameter("type").equals("")) {
                                        %>
                                        <li><a href="/oss/category?type=All">All Categories</a></li>
                                        <%
                                        }else {
                                            if(parentCategory != null) {
                                            %>
                                            <li><a href="/oss/category?type=<%=parentCategory.getName()%>"><%=parentCategory.getName()%></a></li>
                                            <%
                                            }
                                            if(request.getParameter("type").equals("All")) {
                                            %>
                                                <li><a href="/oss/category?type=<%=request.getParameter("type")%>">All Categories</a></li>
                                            <%
                                            }else {
                                            %>
                                                <li><a href="/oss/category?type=<%=request.getParameter("type")%>"><%=request.getParameter("type")%></a></li>
                                            <%
                                            }
                                        }
                                        %>
                                    </ol>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="container-fluid">
                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 product-header">
                                    <form action="/oss/category" class="searchForm">
                                    <input type="hidden" name="type" value=<%=request.getParameter("type")%>>
                                    <div class="form-group">
                                        <label >Keyword</label>
                                        <input type="text" name="key" class="search" placeholder="" >
                                    </div>
                                    <div class="form-group form-inline">
                                        <label class="price">Price</label>
                                        <input class="to" name="priceFrom" type="text" placeholder="" >
                                        <label >-</label>
                                        <input class="to" name="priceTo" type="text" placeholder="" >
                                        <label class="quantity">Quantity</label>
                                        <input class="to" name="quantityFrom" type="text" placeholder="" >
                                        <label >-</label>
                                        <input class="to" name="quantityTo" type="text" placeholder="" >
                                        <button type="submit" class="btn btn-info btn-sm">Search</button>
                                    </div>
                                    </form>
                                    <div class="form-group form-inline">
                                        <label class="sort">Sort By</label>
                                        <li><a class="sortOpt" href="#">View&nbsp;<i class="fa fa-caret-down"></i><span class="icon-text"></span></a></li>
                                        <li><a class="sortOpt" href="#">Ratings&nbsp;<i class="fa fa-caret-down"></i><span class="icon-text"></span></a></li>
                                        <li><a class="sortOpt" href="#">Order&nbsp;<i class="fa fa-caret-down"></i><span class="icon-text"></span></a></li>
                                        <li><a class="sortOpt" href="#">Price&nbsp;<i class="fa fa-caret-down"></i><span class="icon-text"></span></a></li>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="container-fluid">
                            <%
                            for(ProductDto product : productList) {   //for loop begin
                            %>
                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 product-list">
                                    <div class="row">
                                        <div class="container-fluid">
                                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 productlist-image">
                                                <img src=<%=product.getImageUrl()%> alt="" />
                                            </div>
                                            <div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
                                                <div class="row">
                                                    <div class="container-fluid">
                                                        <div class="col-lg-8 col-md-8 col-sm-8 col-xs-8 product-desc">
                                                            <div class="product-name">
                                                                <h3>
                                                                <a href="#"><span class="text-center"><%=product.getName()%></span></a>
                                                                </h3>
                                                            </div>
                                                            <div class="shop-name">
                                                                <a href="#"><span><%=product.getStoreName()%></span></a>
                                                            </div>
                                                            <div class="rating-box">
                                                                <div class="rating medal readonly-rating" data-score=<%=product.getStoreRatings()%> alt="shop-rating"></div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4 infoprice">
                                                            <span class="value">BDT <%=product.getPrice() - ((product.getSale()*product.getPrice())/100)%></span>
                                                            <span class="separator">/</span>
                                                            <span class="unit">piece</span>
                                                            <div class="rating-box">
                                                                <div class="rating readonly-rating" data-score=<%=product.getRatings()%>></div>
                                                                <span><%=product.getReview()%> Review(s)</span>
                                                            </div>
                                                            <div class="rate-history">
                                                                <span class="order-num">
                                                                <a href="" class="order-num-a">Orders  (<%=product.getOrder()%>)</a>
                                                                </span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="container-fluid">
                                                        <div class="col-lg-9 col-md-9 col-sm-9 col-xs-9" >
                                                            <div class="add-to">
                                                                <a href="#"><i class="fa fa-heart-o"></i> <span class="icon-text">Add to wishlist</span></a>
                                                                <a href="#"><i class="fa fa-shopping-cart"></i> <span class="icon-text">Add to cart</span></a>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                                                            <div class="report text-right">
                                                                <a href="#"><i class="glyphicon glyphicon-flag"></i> <span class="icon-text">Report as fraud</span></a>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            <%
                            }   //for loop end
                            %>

                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center pagination-style">
                                    <nav>
                                        <ul class="pagination">
                                            <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
                                            <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
                                            <li><a href="#">2 <span class="sr-only">(current)</span></a></li>
                                            <li><a href="#">3 <span class="sr-only">(current)</span></a></li>
                                            <li><a href="#">4 <span class="sr-only">(current)</span></a></li>
                                            <li><a href="#">5 <span class="sr-only">(current)</span></a></li>
                                            <li><a href="#">6 <span class="sr-only">(current)</span></a></li>
                                            <li><a href="#">2 <span class="sr-only">(current)</span></a></li>
                                            <li><a href="#">3 <span class="sr-only">(current)</span></a></li>
                                            <li><a href="#">4 <span class="sr-only">(current)</span></a></li>
                                            <li><a href="#">5 <span class="sr-only">(current)</span></a></li>
                                            <li><a href="#">6 <span class="sr-only">(current)</span></a></li>
                                            <li class="active"><a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
                                        </ul>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>



        <jsp:include page="Footer.jsp" />

        <script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
        <script src="js/jquery-1.11.0.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <!-- Rating JS -->
        <script type="text/javascript" src="js/jquery.raty.min.js"></script>
        <script type="text/javascript" src="js/jquery.raty.js"></script>
        <script type="text/javascript" src="js/custom.js"></script>
    </body>
</html>
