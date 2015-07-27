<%@page contentType="text/html" pageEncoding="UTF-8"
import = "com.sadman.dto.ProductDto"
import = "java.util.List"
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <title>oss | Home</title>

        <!-- Font Awesome 4.3.0  -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
        <!-- <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'> -->
        <!-- Modified CSS -->
        <link rel="stylesheet" type="text/css" href="css/index.css">
        <!-- Half-slider CSS -->
        <link rel="stylesheet" type="text/css" href="css/half-slider.css">
        <link rel="stylesheet" type="text/css" href="css/jquery.raty.css">
    </head>
    <body>

        <jsp:include page="Header.jsp" />

        <%
        List<ProductDto> productsByRatings = (List<ProductDto>) request.getAttribute("productsByRatings");              //java code
        List<ProductDto> productsBySale = (List<ProductDto>) request.getAttribute("productsBySale");
        List<ProductDto> productsByView = (List<ProductDto>) request.getAttribute("productsByView");
        int cnt = 0;
        %>

        <!-- Half Page Image Background Carousel Header -->
        <div id="myCarousel" class="carousel slide">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>
            <!-- Wrapper for Slides -->
            <div class="carousel-inner">
                <div class="item active">
                    <!-- Set the first background image using inline CSS below. -->
                    <div class="fill" style="background-image:url('http://placehold.it/1900x1080&text=Slide One');"></div>
                    <div class="carousel-caption">
                        <h2>Caption 1</h2>
                    </div>
                </div>
                <div class="item">
                    <!-- Set the second background image using inline CSS below. -->
                    <div class="fill" style="background-image:url('http://placehold.it/1900x1080&text=Slide Two');"></div>
                    <div class="carousel-caption">
                        <h2>Caption 2</h2>
                    </div>
                </div>
                <div class="item">
                    <!-- Set the third background image using inline CSS below. -->
                    <div class="fill" style="background-image:url('http://placehold.it/1900x1080&text=Slide Three');"></div>
                    <div class="carousel-caption">
                        <h2>Caption 3</h2>
                    </div>
                </div>
            </div>
            <!-- Controls -->
            <a class="left carousel-control" href="#myCarousel" data-slide="prev">
            <span class="icon-prev"></span>
            </a>
            <a class="right carousel-control" href="#myCarousel" data-slide="next">
            <span class="icon-next"></span>
            </a>
        </div>
        <!-- Product On Sale -->
        <section id="product-on-sale" class="product-content">
            <div class="row">
                <div class="container-fluid">
                    <div class="col-sm-2 col-xs-2">
                        <h4>
                        <a href="#">
                        <i>PRODUCT'S ON SALE</i>
                        </a>
                        </h4>
                    </div>
                    <div class="col-sm-offset-9 col-xs-offset-9 col-sm-1 col-xs- text-center">
                        <h4>
                        <a href="#"><i>View more</i></a>
                        </h4>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="container-fluid">
                    <div class="col-sm-4 col-xs-4 logo">
                        <img src="images/home/girl4.jpg" alt="" />
                    </div>
                    <div class="col-sm-8 col-xs-8">
                        <div class="row">
                            <div class="container-fluid">
                            <%                                                                                          //java code
                            cnt = 0;
                            for(ProductDto product : productsBySale) {
                            if(cnt < 3){
                            %>
                                <a href="#">
                                <div class="col-sm-4 col-xs-4 product-info text-center">
                                    <img class="product-image" src="images/products/1.jpg" alt=<%=product.getName()%> />
                                    <span>BDT <%=product.getPrice() - ((product.getSale()*product.getPrice())/100)%></span>
                                    <del>BDT <%=product.getPrice()%></del>
                                </div>
                                </a>
                            <%
                            cnt += 1;
                            }}
                            %>
                            </div>
                        </div>
                        <div class="row">
                            <div class="container-fluid">
                            <%
                            cnt = 0;                                                                                            //java code
                            for(ProductDto product : productsBySale) {
                            if(cnt == 3){
                            %>
                                <a href="#">
                                <div class="col-sm-4 col-xs-4 product-info text-center">
                                    <img class="product-image" src="images/products/2.jpg" alt=<%=product.getName()%> />
                                    <span>BDT <%=product.getPrice() - ((product.getSale()*product.getPrice())/100)%></span>
                                    <del>BDT <%=product.getPrice()%></del>
                                </div>
                                </a>
                            <%
                            }else{
                                cnt += 1;
                            }
                            }
                            %>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Start of top rated-->
        <section id="top-rated" class="product-content">
            <div class="row">
                <div class="container-fluid">
                    <div class="col-sm-2 col-xs-2">
                        <h4>
                        <a href="#">
                        <i>TOP RATED</i>
                        </a>
                        </h4>
                    </div>
                    <div class="col-sm-offset-9 col-xs-offset-9 col-sm-1 col-xs- text-center">
                        <h4>
                        <a href="#"><i>View more</i></a>
                        </h4>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="container-fluid">
                    <div class="col-sm-4 col-xs-4 logo">
                        <img  src="images/home/girl1.jpg" alt="" />
                    </div>
                    <div class="col-sm-8 col-xs-8">
                        <div class="row">
                            <div class="container-fluid">
                            <%                                                                                          //java code
                            cnt = 0;
                            for(ProductDto product : productsByRatings) {
                            if(cnt < 3){
                            %>
                                <a href="#">
                                <div class="col-sm-4 col-xs-4 product-info text-center">
                                    <img class="product-image" src="images/products/3.jpg" alt=<%=product.getName()%> />
                                    <span>BDT <%=product.getPrice()%></span>
                                    <div class="rating-box">
                                        <div class="rating readonly-rating" data-score="4"></div>
                                        <span><%=product.getReview()%> Review(s)</span>
                                    </div>
                                </div>
                                </a>
                            <%
                            cnt += 1;
                            }
                            }
                            %>
                            </div>
                        </div>
                        <div class="row">
                            <div class="container-fluid">
                            <%                                                                                          //java code
                            cnt = 0;
                            for(ProductDto product : productsByRatings) {
                            if(cnt == 3){
                            %>
                                <a href="#">
                                <div class="col-sm-4 col-xs-4 product-info text-center">
                                    <img class="product-image" src="images/products/4.jpg" alt=<%=product.getName()%> />
                                    <span>BDT <%=product.getPrice()%></span>
                                    <div class="rating-box">
                                        <div class="rating readonly-rating" data-score=<%=product.getRatings()%>></div>
                                        <span><%=product.getReview()%> Review(s)</span>
                                    </div>
                                </div>
                                </a>
                            <%
                            }else{
                                cnt += 1;
                            }
                            }
                            %>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Best Seller -->
        <!-- Start of footer -->
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
