<!DOCTYPE HTML>
<html>
<head>
<title>index page</title>
<link rel="icon" href="images/3.jpg">
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<noscript>
	<link rel="stylesheet" href="assets/css/noscript.css" />
</noscript>
<style>
#ans {
	color: red;
}
</style>
<script type="text/javascript">
    	window.onload=function(){
    		var login=document.login;
    		login.onsubmit=function(){
    			var ans=document.getElementById('ans');
    			ans.innerHTML='<div id="ans"></div>';
    			if(!login.id.value){
    				var txt=document.createTextNode('enter your id!');
    				ans.appendChild(txt);
    				return false;
    			}
    			if(!login.pw.value){
    				var txt=document.createTextNode('enter yout passwordš”!');
    				ans.appendChild(txt);
    				return false;
    			}
    		}
    	}
    </script>
</head>
<body class="is-preload">

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header" class="alt">
			<span class="logo"><img src="images/logo.svg" alt="" /></span>
			<h1>Title</h1>
			<p>Title..2</p>
		</header>

		<!-- Nav -->
		<nav id="nav">
			<ul>
				<li><a href="insertBoard.jsp">Board</a></li>
				<li><a href="getBoardList.do">BoardList</a></li>
				<li><a href="login.jsp">Login</a></li>
				<li><a href="#cta">Get Started</a></li>
			</ul>
		</nav>

		<!-- Main -->
		<div id="main">

			<!-- Introduction -->
			<section id="intro" class="main">
				<div class="spotlight">
					<div class="content">
						<header class="major">
							<h2>Login—…</h2>
						</header>
						<form action="login.do" method="post">
							<table>
								<tr>
									<td>ID</td>
									<td><input type="text" name="id"></td>
								</tr>
								<tr>
									<td>PW</td>
									<td><input type="password" name="pw"></td>
								</tr>
								<tr>
									<td colspan="2"><input type="submit"></td>
								</tr>
							</table>
						</form>
						<div id="ans"></div>
						<br>
						<br>

						<ul class="actions">
							<li><a href="#" class="button">Registration</a></li>
							<li><a href="generic.html" class="button">Find ID/PW</a></li>
						</ul>
					</div>
					<span class="image"><img src="images/pic01.jpg" alt="" /></span>
				</div>
			</section>

			

		<!-- Footer -->
		<footer id="footer">
			<section>
				<h2>Aliquam sed mauris</h2>
				<p>Sed lorem ipsum dolor sit amet et nullam consequat feugiat
					consequat magna adipiscing tempus etiam dolore veroeros. eget
					dapibus mauris. Cras aliquet, nisl ut viverra sollicitudin, ligula
					erat egestas velit, vitae tincidunt odio.</p>
				<ul class="actions">
					<li><a href="generic.html" class="button">Learn More</a></li>
				</ul>
			</section>
			<section>
				<h2>Etiam feugiat</h2>
				<dl class="alt">
					<dt>Address</dt>
					<dd>1234 Somewhere Road &bull; Nashville, TN 00000 &bull; USA</dd>
					<dt>Phone</dt>
					<dd>(000) 000-0000 x 0000</dd>
					<dt>Email</dt>
					<dd>
						<a href="#">information@untitled.tld</a>
					</dd>
				</dl>
				<ul class="icons">
					<li><a href="#" class="icon brands fa-twitter alt"><span
							class="label">Twitter</span></a></li>
					<li><a href="#" class="icon brands fa-facebook-f alt"><span
							class="label">Facebook</span></a></li>
					<li><a href="#" class="icon brands fa-instagram alt"><span
							class="label">Instagram</span></a></li>
					<li><a href="#" class="icon brands fa-github alt"><span
							class="label">GitHub</span></a></li>
					<li><a href="#" class="icon brands fa-dribbble alt"><span
							class="label">Dribbble</span></a></li>
				</ul>
			</section>
			<p class="copyright">
				&copy; Untitled. Design: <a href="https://html5up.net">HTML5 UP</a>.
			</p>
		</footer>

	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/jquery.scrolly.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>