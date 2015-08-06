<%@page contentType="text/html" pageEncoding="UTF-8"
import = "com.sadman.dto.ProductDto"
import = "com.sadman.dto.CustomerDetailsDto"
import = "java.util.List"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

    <%
    CustomerDetailsDto customer = (CustomerDetailsDto) session.getAttribute("sessionUser");

    %>

    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <title>oss | Order</title>

        <!-- Font Awesome 4.3.0  -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
        <!-- <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'> -->
        <!-- Modified CSS -->
        <link href="css/edit.css" rel="stylesheet">
    </head>
    <body>
        <!-- Login content -->
        <section id="login-content" >
            <div class="container-fluid">
                <div class="row form-content">
                    <div class="container-fluid">
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                            <form action="/oss/ordercontroller" method="post" role="form" style="padding-top: 105px;">
                                <h2>You can change your address to take your delivery and your contact number if you've changed it</h2>
                                <input type="hidden" name="pid" value=<%=request.getParameter("pid")%>>
                                <input type="hidden" name="qn" value=<%=request.getParameter("qn")%>>
                                <div class="input-group form-group">
                                    <span class="input-group-addon" id="basic-addon1"><i class="glyphicon glyphicon-user"></i></span>
                                    <input type="text" class="form-control" placeholder="Name" aria-describedby="basic-addon" value=<%=customer.getFirstName()%> readonly>
                                </div>
                                <div class="input-group form-group">
                                    <span class="input-group-addon" id="basic-addon1"><i class="fa fa-envelope-o"></i></span>
                                    <input type="text" class="form-control" placeholder="Email address" aria-describedby="basic-addon1" value="sadman.ilham@gmail.com" readonly>
                                </div>

                                <div class="input-group form-group">
                                    <span class="input-group-addon" id="basic-addon4"><i class=" glyphicon glyphicon-phone"></i></span>
                                    <span class="input-group-addon">+880</span>
                                    <input type="text" class="form-control" placeholder="Enter your phone number" aria-describedby="basic-addon4" name="cp" value=<%=customer.getPhone()%>>
                                </div>
                                <div class="input-group form-group">
                                    <span class="input-group-addon" id="basic-addon5"><i class="glyphicon glyphicon-home"></i></span>
                                    <textarea rows="4" cols="50" class="form-control" placeholder="Enter your address" aria-describedby="basic-addon5" name="dp" value=<%=customer.getAddress()%>><%=customer.getAddress()%></textarea>
                                </div>
                                <input type="submit" class="btn btn-success sign-up" value="Place Order" />
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Start of footer -->
        <footer id="footer">
            <div class="footer-bottom">
                <div class="container">
                    <div class="row">
                        <p class="text-center">All rights reserved</p>
                    </div>
                </div>
            </div>
        </footer>
        <script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <!-- Rating JS -->
        <script type="text/javascript" src="js/jquery.raty.js"></script>
        <script type="text/javascript" src="js/custom.js"></script>
    </body>
</html>