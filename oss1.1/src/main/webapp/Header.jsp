<nav class="navbar navbar-inverse navbar-trans navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapsible">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            </button>
            <a href="index.html"><img src="images/home/logo.png" alt="" /></a>
        </div>
        <div class="navbar-collapse collapse" id="navbar-collapsible">
            <ul class="nav navbar-nav navbar-right shop-menu">
                <li> <a href="#"><i class="fa fa-heart-o fa-2x"></i><span class="icon-text"> Wishlist </span>
                    <span class="badge">0</span></a>
                </li>
                <li><a href="#"><i class="fa fa-shopping-cart fa-2x"></i> <span class="icon-text">Cart</span> <span class="badge">0</span></a></li>
                <li><a data-toggle="modal" href='#modal-id'><i class="fa fa-user fa-2x"></i><span class="icon-text"> LogIn/SignUp</span></a></li>
            </ul>
            <form class="navbar-form navbar-left">
                <div class="form-group" style="display:inline;">
                    <div class="input-group">
                        <div class="input-group-btn">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="height: 34px;"><span class="glyphicon glyphicon-chevron-down"></span></button>
                            <ul class="dropdown-menu">
                                <li><a href="#">Category 1</a></li>
                                <li><a href="#">Category 2</a></li>
                                <li><a href="#">Category 3</a></li>
                                <li><a href="#">Category 4</a></li>
                                <li><a href="#">Category 5</a></li>
                            </ul>
                        </div>
                        <input type="text" class="form-control" placeholder="What are you searching for?">
                        <div class="input-group-btn">
                            <button class="btn btn-default" type="submit" style="height: 34px;"><i class="glyphicon glyphicon-search"></i></button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</nav>
<!-- Start of modal window -->
<div class="modal fade" id="modal-id">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-body">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h3 class="text-center">Login or <a href="/oss/signup">Sign up</a></h3>
                <div class="row">
                    <div class="col-xs-4" >
                        <a href="#" class="btn btn-lg btn-block btn-facebook">Facebook</a>
                    </div>
                    <div class="col-xs-4 ">
                        <a href="#" class="btn btn-lg btn-block btn-twitter">Twitter</a>
                    </div>
                    <div class="col-xs-4 ">
                        <a href="#" class="btn btn-lg btn-block btn-google">Google+</a>
                    </div>
                </div>
                <div class="row ">
                    <div class="col-xs-12">
                        <hr class="hrStyle">
                    </div>
                </div>
                <div class="row">
                    <div class="col-xs-12 ">
                        <form action="" class="form-horizontal" method="POST" role="form">
                            <div class="input-group">
                                <span class="input-group-addon" id="basic-addon1"><i class="glyphicon glyphicon-user"></i></span>
                                <input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
                            </div>
                            <span class="help-block"></span>
                            <div class="input-group">
                                <span class="input-group-addon" id="basic-addon2"><i class="glyphicon glyphicon-lock"></i></span>
                                <input type="password" class="form-control" placeholder="Password" aria-describedby="basic-addon2">
                            </div>
                            <span class="help-block"></span>
                            <a href="#" class="btn btn-success btn-block btn-lg">Login</a>
                        </form>
                    </div>
                </div>
                <div class="row ">
                    <div class="col-xs-6 text-left">
                        <label><input type="checkbox" value="rememberMe"> Remember Me</label>
                    </div>
                    <div class="col-xs-6 text-right ">
                        <p><a href="#">Forgot Password?</a></p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>