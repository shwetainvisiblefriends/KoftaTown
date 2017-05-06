
<!DOCTYPE html>
<html ng-app="mainApp">
    <head>

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="static/CSS/app/app.css" rel="stylesheet"></link>
  <link href="static/CSS/lib/bootstrap-min.css" rel="stylesheet"></link>
    <link href="static/CSS/lib/ui-grid.css" rel="stylesheet"></link>
        
    </head>
<body>

<div >
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container headerWidth container-fluid">
		<div class="top-navbar header b-b  navbar-header">
			<a href="#home" class="navbar-brand"> TheDietCafe.com </a>
			<button class=" navbar navbar-toggle" data-toggle="collapse"
				data-target=".navheadercollapse">
				<span class=" icon-bar"></span> <span class=" icon-bar"></span> <span
					class=" icon-bar"></span>
			</button>
			
			<div >
		
				<ul class=" nav navbar-nav">
					<li><a ui-sref="home">Home</a></li>
					<li><a ui-sref="aboutUs">About us</a></li>
					<li><a ui-sref="plans">Plans</a></li>
					
					<li><a ui-sref="whyUs">Why us</a></li>
					<li><a ui-sref="fAQ">FAQ</a></li>
					<li><a ui-sref="contactUs">Contact us</a></li>
				</ul>
				<ul  class="nav navbar-nav navbar-right">
				
					<li><a ui-sref="signUp"> Signup</a></li>
					<li><a ui-sref="loginPage">Log In </a></li>
				</ul>
				<!-- <ul ng-if="name!=null" class="nav navbar-nav navbar-right">
				
					<li><a > {{name}}</a></li> 
					<li><a ui-sref="logout">logout </a></li>
				</ul> -->
			</div>
		</div>
		</div>
</nav>
    <div ui-view style="margin-top:5%">
    </div>


</div>
 <script src="static/JS/lib/angular-min.js" ></script> 
 
<script src="static/JS/lib/jquery.min.js" ></script> 
<script src="static/JS/lib/angular-ui-router.js" ></script> 
<script src="static/JS/lib/ui-grid.js"></script>
<script src="static/JS/lib/ui-bootstrap-tpls.js"></script>
<script src="static/JS/lib/bootstrap.min.js" ></script> 
<script type="text/javascript" src="//maps.googleapis.com/maps/api/js?key=AIzaSyCV8_sfFNo41J-ppln6MIDNJeFGmiI0330&language=en&libraries=places"></script>
<!-- <script src="static/JS/lib/angularMap.js"></script> -->
<script src="static/JS/app.js"></script> 	
<script src="static/JS/app/controller/aboutUs_controller.js" /></script>
<script src="static/JS/app/controller/home-controller.js" /></script>
<script src="static/JS/app/controller/login-controller.js" /></script>
<script src="static/JS/app/controller/singUp-controller.js" /></script>
<script src="static/JS/app/controller/productDetails-controller.js"></script>
<script src="static/JS/app/controller/admin-controller.js"></script>
<script src="static/JS/app/controller/addNewProduct-controller.js"></script>
<script src="static/JS/app/controller/createNewAdmin-controller.js"></script>
<script src="static/JS/app/controller/checkTotalSale-controller.js"></script>
<script src="static/JS/app/controller/checkOrder-controller.js"></script>

<script src="static/JS/app/service/getPath-service.js" /></script>
<script src="static/JS/app/service/signUp-service.js" /></script>
<script src="static/JS/app/service/createCompleatePath.js" /></script>
<script src="static/JS/app/service/singlton-service.js" /></script>
<script src="static/JS/app/service/login-service.js" /></script>
<script src="static/JS/app/service/addNewProduct-service.js" /></script>
<script src="static/JS/app/service/getAllProduct-service.js" /></script>
<script src="static/JS/app/service/orderDetail-service.js" /></script>

<script src=static/JS/app/controller/address-payment-controller.js></script>


     



      
    </body>
    </html>