<%@page contentType="text/html" pageEncoding="UTF-8"
import = "com.sadman.dto.ProductDto"
import = "com.sadman.dto.CustomerDetailsDto"
import = "com.sadman.dto.OrderDto"
import = "java.util.List"
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <title>oss | Cart</title>

        <!-- Font Awesome 4.3.0  -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
        <!-- <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'> -->
        <!-- Modified CSS -->
        <link href="css/cart.css" rel="stylesheet">
        <!-- Half-slider CSS -->
        <link href="css/half-slider.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/jquery.raty.css">
    </head>
    <body>

        <jsp:include page="Header.jsp" />

        <%
        CustomerDetailsDto sessionUser = (CustomerDetailsDto) session.getAttribute("sessionUser");
        List<ProductDto> productList = (List<ProductDto>) request.getAttribute("cartProductList");
        List<OrderDto> orderPlacedProductList = (List<OrderDto>) request.getAttribute("orderPlacedProductList");
        List<OrderDto> orderPurchasedProductList = (List<OrderDto>) request.getAttribute("orderPurchasedProductList");
        %>

        <div class="modal fade" id="checkout-modal">
            <div class="modal-dialog">
                <div class="modal-dialog">
                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Code Validation</h4>
                        </div>
                        <div class="modal-body">
                            <form action="/oss/purchasecontroller" method="post" role="form">
                                <div class="form-group form-inline sad-code-form" >
                                    <input type="hidden" name="oid" id="oid" value="">
                                    <input type="text" class="form-control code-text" name="code" id="" placeholder="Enter your code here">
                                    <input type="submit" class="btn btn-success form-control checkout-modal-btn" value="Checkout">
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <section id="cart-product">
            <div class="row">
                <div class="container-fluid">
                    <div class="col-lg-9 col-md-9 col-sm-9 col-xs-9 product-content">
                        <ul class="nav nav-tabs navtab-style">
                            <li class="active"><a data-toggle="tab" href="#tab1">Cart</a></li>
                            <li><a data-toggle="tab" href="#tab2">Order Placed</a></li>
                            <li><a data-toggle="tab" href="#tab3">Order Purchased</a></li>
                        </ul>
                        <div class="tab-content">
                            <div id="tab1" class="tab-pane fade in active">
                                <div class="row">
                                    <div class="container-fluid">
                                        <%
                                        for(ProductDto product : productList) {
                                        %>
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 product-list">
                                            <div class="row">
                                                <div class="container-fluid">
                                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 productlist-image">
                                                        <img  src=<%=product.getImageUrl()%> alt="" />
                                                    </div>
                                                    <div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
                                                        <div class="row">
                                                            <div class="container-fluid">
                                                                <div class="col-lg-8 col-md-8 col-sm-8 col-xs-8 product-desc">
                                                                    <div class="product-name">
                                                                        <h3>
                                                                        <a href="#"><span class="text-center"><%=product.getName()%></a>
                                                                        </h3>
                                                                    </div>
                                                                    <div class="shop-name">
                                                                        <a href="#"><span><%=product.getStoreName()%></span></a>
                                                                    </div>
                                                                    <div class="rating-box">
                                                                        <div class="rating medal readonly-rating" data-score=<%=product.getStoreRatings()%> alt="shop-rating"></div>
                                                                    </div>
                                                                </div>
                                                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 infoprice">
                                                                    <span class="value">BDT <%=product.getPrice()%></span>
                                                                    <span class="separator">/</span>
                                                                    <span class="unit">piece</span>
                                                                    <%
                                                                    if(product.getSale() > 0) {
                                                                    %>
                                                                    <br>
                                                                    <span class="saleValue">Now BDT <%=product.getPrice() - ((product.getSale()*product.getPrice())/100)%></span>
                                                                    <span class="separator">/</span>
                                                                    <span class="unit">piece</span>
                                                                    <%
                                                                    }
                                                                    %>
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
                                                                <div class="col-lg-1 col-md-1 col-sm-1 col-xs-1 text-right cross">
                                                                    <a href=""><i class="fa fa-times"></i></a>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="container-fluid">
                                                                <form method="get" action="/oss/order" id="orderForm<%=product.getId()%>">
                                                                <input type="hidden" name="pid" value=<%=product.getId()%>>
                                                                <select name="qn">
                                                                    <%
                                                                    for(int i=0; i<product.getAvailable(); i++) {
                                                                    %>
                                                                        <option value=<%=i+1%>><%=i+1%></option>
                                                                    <%
                                                                    }
                                                                    %>
                                                                </select>
                                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 add-to text-right" >
                                                                    <a class="btn btn-sm btn-success" onclick="document.getElementById('orderForm<%=product.getId()%>').submit();"><i class="fa fa-credit-card"></i> <span class="icon-text">Buy Now</span></a>
                                                                </div>
                                                                </form>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <%
                                        }
                                        %>
                                    </div>
                                </div>
                            </div>
                            <div id="tab2" class="tab-pane fade">
                                <div class="row">
                                    <div class="container-fluid">
                                        <%
                                        if(orderPlacedProductList != null) {
                                        for(OrderDto order : orderPlacedProductList) {
                                        %>
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 product-list">
                                            <div class="row">
                                                <div class="container-fluid">
                                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 productlist-image">
                                                        <img  src=<%=order.getImageUrl()%> alt="" />
                                                    </div>
                                                    <div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
                                                        <div class="row">
                                                            <div class="container-fluid">
                                                                <div class="col-lg-8 col-md-8 col-sm-8 col-xs-8 product-desc">
                                                                    <div class="product-name">
                                                                        <h3>
                                                                        <a href="#"><span class="text-center"><%=order.getProductName()%></a>
                                                                        </h3>
                                                                    </div>
                                                                    <div class="shop-name">
                                                                        <a href="#"><span><%=order.getStoreName()%></span></a>
                                                                    </div>
                                                                    <div class="rating-box">
                                                                        <div class="rating medal readonly-rating" data-score=<%=order.getStoreRatings()%> alt="shop-rating"></div>
                                                                    </div>
                                                                </div>
                                                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 infoprice">
                                                                    <span class="value">Purchased With BDT <%=order.getPrice()%></span>
                                                                    <span class="separator">/</span>
                                                                    <span class="unit">piece</span>
                                                                    <div class="rating-box">
                                                                        <div class="rating readonly-rating" data-score=<%=order.getProductRatings()%>></div>
                                                                        <span><%=order.getProductReview()%> Review(s)</span>
                                                                    </div>
                                                                    <div class="rate-history">
                                                                        <span class="order-num">
                                                                        <a href="" class="order-num-a">Orders ()</a>
                                                                        </span>
                                                                    </div>
                                                                </div>
                                                                <div class="col-lg-1 col-md-1 col-sm-1 col-xs-1 text-right cross">
                                                                    <a href=""><i class="fa fa-times"></i></a>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="container-fluid">
                                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 add-to text-right" >
                                                                    <a class="btn btn-sm btn-success" data-toggle="modal" data-target="#checkout-modal" id=<%=order.getId()%>><i class="fa fa-credit-card"></i> <span class="icon-text">Checkout</span></a>
                                                                </div>
                                                                </form>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <%
                                        }
                                        }
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
                                                    <li class="active"><a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
                                                </ul>
                                            </nav>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div id="tab3" class="tab-pane fade">
                                <div class="row">
                                    <div class="container-fluid">
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 product-list">
                                            <div class="row">
                                                <div class="container-fluid">
                                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 productlist-image">
                                                        <img  src="images/home/product7.jpg" alt="" />
                                                    </div>
                                                    <div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
                                                        <div class="row">
                                                            <div class="container-fluid">
                                                                <div class="col-lg-8 col-md-8 col-sm-8 col-xs-8 product-desc">
                                                                    <div class="product-name">
                                                                        <h3>
                                                                        <a href="#"><span class="text-center">
                                                                        Special PU Leather Flip Case For Original Xiaomi Mi4i Mi 4i Qualcomm Snapdragon 615 Octa Core Phone Free Shipping High Quality(China (Mainland))
                                                                        5 Colors Available</span></a>
                                                                        </h3>
                                                                    </div>
                                                                    <div class="shop-name">
                                                                        <a href="#"><span>Shop Name</span></a>
                                                                    </div>
                                                                    <div class="rating-box">
                                                                        <div class="rating medal readonly-rating" data-score="3" alt="shop-rating"></div>
                                                                    </div>
                                                                </div>
                                                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 infoprice">
                                                                    <span class="value">US $9.99</span>
                                                                    <span class="separator">/</span>
                                                                    <span class="unit">piece</span>
                                                                    <div class="rating-box">
                                                                        <div class="rating readonly-rating" data-score="3"></div>
                                                                        <span>3 Review(s)</span>
                                                                    </div>
                                                                    <div class="rate-history">
                                                                        <span class="order-num">
                                                                        <a href="" class="order-num-a">Orders  (3)</a>
                                                                        </span>
                                                                    </div>
                                                                </div>
                                                                <div class="col-lg-1 col-md-1 col-sm-1 col-xs-1 text-right cross">
                                                                    <a href=""><i class="fa fa-times"></i></a>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
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
                                                    <li class="active"><a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
                                                </ul>
                                            </nav>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 product-price text-center">
                        <div class="row">
                            <div class="container-fluid">
                                <div class="product-quantity">
                                    <span class="total-product-text">No. Of Products:</span>
                                    <span class="total">5</span>
                                </div>
                                <div class="total-price">
                                    <span class="total-price-text">Total Price:</span>
                                    <span class="total">BDT 500.0</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <jsp:include page="Footer.jsp" />

        <script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <!-- Rating JS -->
        <script type="text/javascript" src="js/jquery.raty.js"></script>
        <script type="text/javascript" src="js/custom.js"></script>

         <script>
            $('#checkout-modal').on('show.bs.modal', function(e) {
                document.getElementById('oid').value = e.relatedTarget.id;
            })
        </script>
    </body>
</html>
