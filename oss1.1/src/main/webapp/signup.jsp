<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <title>Project</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <!-- Font Awesome 4.3.0  -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
        <!-- <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'> -->
        <!-- Modified CSS -->
        <link href="css/register.css" rel="stylesheet">
    </head>
    <body>

        <jsp:include page="Header.jsp" />

        <!-- Login content -->
        <section id="login-content" >
            <div class="container-fluid">
                <!-- <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="jumbotron-style text-center">
                            <h1>E-Shopper</h1>
                            <h3>Register here for full access</h3>
                        </div>
                    </div>
                </div> -->
                <div class="row form-content">
                    <div class="container-fluid">
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6 col-lg-offset-6 col-md-offset-6 col-sm-offset-6 col-xs-offset-6">
                            <form action="/oss/signingup" method="post" role="form">
                                <div class="form-group form-inline" >
                                    <label class="sr-only" for="">first name</label>
                                    <input type="text" class="form-control first-name" id="" placeholder="First Name" name="firstName">
                                    <label class="sr-only" for="">Last name</label>
                                    <input type="text" class="form-control last-name" id="" placeholder="Last Name" name="lastName">
                                </div>
                                <div class="input-group form-group">
                                    <span class="input-group-addon" id="basic-addon1"><i class="fa fa-envelope-o"></i></span>
                                    <input type="text" class="form-control" placeholder="Enter your email address" aria-describedby="basic-addon1" name="email">
                                </div>
                                <div class="input-group form-group">
                                    <span class="input-group-addon" id="basic-addon2"><i class="glyphicon glyphicon-lock"></i></span>
                                    <input type="password" class="form-control" placeholder="Enter password" aria-describedby="basic-addon2" name="password">
                                </div>
                                <div class="input-group form-group">
                                    <span class="input-group-addon" id="basic-addon3"><i class="glyphicon glyphicon-lock"></i></span>
                                    <input type="password" class="form-control" placeholder="Re-Enter password" aria-describedby="basic-addon3">
                                </div>
                                <div class="input-group form-group">
                                    <span class="input-group-addon" id="basic-addon4"><i class=" glyphicon glyphicon-phone"></i></span>
                                    <span class="input-group-addon">+880</span>
                                    <input type="text" class="form-control" placeholder="Enter your phone number" aria-describedby="basic-addon4" name="phone">
                                </div>
                                <div class="input-group form-group">
                                    <span class="input-group-addon" id="basic-addon5"><i class="glyphicon glyphicon-home"></i></span>
                                    <textarea rows="4" cols="50" class="form-control" placeholder="Enter your address" aria-describedby="basic-addon5" name="address"></textarea>
                                </div>
                                <div class="input-group form-group form-inline">
                                    <label>Date Of Birth</label>
                                    <span>
                                    <select title="Day" id="day" name="birthday_day" aria-label="Day">
                                        <option selected="1" value="0">Day</option>
                                        <option value="01">1</option>
                                        <option value="02">2</option>
                                        <option value="03">3</option>
                                        <option value="04">4</option>
                                        <option value="05">5</option>
                                        <option value="06">6</option>
                                        <option value="07">7</option>
                                        <option value="08">8</option>
                                        <option value="09">9</option>
                                        <option value="10">10</option>
                                        <option value="11">11</option>
                                        <option value="12">12</option>
                                        <option value="13">13</option>
                                        <option value="14">14</option>
                                        <option value="15">15</option>
                                        <option value="16">16</option>
                                        <option value="17">17</option>
                                        <option value="18">18</option>
                                        <option value="19">19</option>
                                        <option value="20">20</option>
                                        <option value="21">21</option>
                                        <option value="22">22</option>
                                        <option value="23">23</option>
                                        <option value="24">24</option>
                                        <option value="25">25</option>
                                        <option value="26">26</option>
                                        <option value="27">27</option>
                                        <option value="28">28</option>
                                        <option value="29">29</option>
                                        <option value="30">30</option>
                                        <option value="31">31</option>
                                    </select>
                                    <select title="Month" id="month" name="birthday_month" aria-label="Month" >
                                        <option selected="1" value="0">Month</option>
                                        <option value="01">Jan</option>
                                        <option value="02">Feb</option>
                                        <option value="03">Mar</option>
                                        <option value="04">Apr</option>
                                        <option value="05">May</option>
                                        <option value="06">Jun</option>
                                        <option value="07">Jul</option>
                                        <option value="08">Aug</option>
                                        <option value="09">Sep</option>
                                        <option value="10">Oct</option>
                                        <option value="11">Nov</option>
                                        <option value="12">Dec</option>
                                    </select>
                                    <select title="Year" id="year" name="birthday_year" aria-label="Year" >
                                        <option selected="1" value="0">Year</option>
                                        <option value="2015">2015</option>
                                        <option value="2014">2014</option>
                                        <option value="2013">2013</option>
                                        <option value="2012">2012</option>
                                        <option value="2011">2011</option>
                                        <option value="2010">2010</option>
                                        <option value="2009">2009</option>
                                        <option value="2008">2008</option>
                                        <option value="2007">2007</option>
                                        <option value="2006">2006</option>
                                        <option value="2005">2005</option>
                                        <option value="2004">2004</option>
                                        <option value="2003">2003</option>
                                        <option value="2002">2002</option>
                                        <option value="2001">2001</option>
                                        <option value="2000">2000</option>
                                        <option value="1999">1999</option>
                                        <option value="1998">1998</option>
                                        <option value="1997">1997</option>
                                        <option value="1996">1996</option>
                                        <option value="1995">1995</option>
                                        <option value="1994">1994</option>
                                        <option value="1993">1993</option>
                                        <option value="1992">1992</option>
                                        <option value="1991">1991</option>
                                        <option value="1990">1990</option>
                                        <option value="1989">1989</option>
                                        <option value="1988">1988</option>
                                        <option value="1987">1987</option>
                                        <option value="1986">1986</option>
                                        <option value="1985">1985</option>
                                        <option value="1984">1984</option>
                                        <option value="1983">1983</option>
                                        <option value="1982">1982</option>
                                        <option value="1981">1981</option>
                                        <option value="1980">1980</option>
                                    </select>
                                    </span>
                                    <label class="gender-text">Gender </label>
                                    <span class="gender-radiobuttons">
                                    <input type="radio" name="gender" value="male"> Male
                                    <input type="radio" name="gender" value="female"> Female
                                    </span>
                                </div>
                                <input type="submit" class="btn btn-success sign-up" value="Sign Up">
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