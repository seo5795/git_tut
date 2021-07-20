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
    				var txt=document.createTextNode('enter yout password��!');
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
				<li><a href="#second">Second Section</a></li>
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
							<h2>Login��</h2>
						</header>
						<form action="#" method="post" name="login">
							<table>
								<tr>
									<td>ID</td>
									<td><input type="text" id="id"></td>
								</tr>
								<tr>
									<td>PW</td>
									<td><input type="password" id="pw"></td>
								</tr>
								<tr>
									<td colspan="2"><input type="submit" value="Login"></td>
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

			<!-- First Section -->
			<section id="first" class="main special">
				<header class="major">
					<h2>Magna veroeros</h2>
				</header>
				<ul class="features">
					<li><span class="icon solid major style1 fa-code"></span>
						<h3>Ipsum consequat</h3>
						<p>Sed lorem amet ipsum dolor et amet nullam consequat a
							feugiat consequat tempus veroeros sed consequat.</p></li>
					<li><span class="icon major style3 fa-copy"></span>
						<h3>Amed sed feugiat</h3>
						<p>Sed lorem amet ipsum dolor et amet nullam consequat a
							feugiat consequat tempus veroeros sed consequat.</p></li>
					<li><span class="icon major style5 fa-gem"></span>
						<h3>Dolor nullam</h3>
						<p>Sed lorem amet ipsum dolor et amet nullam consequat a
							feugiat consequat tempus veroeros sed consequat.</p></li>
				</ul>
				<footer class="major">
					<ul class="actions special">
						<li><a href="generic.html" class="button">Learn More</a></li>
					</ul>
				</footer>
			</section>

			<!-- Second Section -->
			<section id="second" class="main special">
				<header class="major">
					<h2>Ipsum consequat</h2>
					<p>
						Donec imperdiet consequat consequat. Suspendisse feugiat congue<br />
						posuere. Nulla massa urna, fermentum eget quam aliquet.
					</p>
				</header>
				<ul class="statistics">
					<li class="style1"><span class="icon solid fa-code-branch"></span>
						<strong>5,120</strong> Etiam</li>
					<li class="style2"><span class="icon fa-folder-open"></span> <strong>8,192</strong>
						Magna</li>
					<li class="style3"><span class="icon solid fa-signal"></span>
						<strong>2,048</strong> Tempus</li>
					<li class="style4"><span class="icon solid fa-laptop"></span>
						<strong>4,096</strong> Aliquam</li>
					<li class="style5"><span class="icon fa-gem"></span> <strong>1,024</strong>
						Nullam</li>
				</ul>
				<p class="content">Nam elementum nisl et mi a commodo porttitor.
					Morbi sit amet nisl eu arcu faucibus hendrerit vel a risus. Nam a
					orci mi, elementum ac arcu sit amet, fermentum pellentesque et
					purus. Integer maximus varius lorem, sed convallis diam accumsan
					sed. Etiam porttitor placerat sapien, sed eleifend a enim pulvinar
					faucibus semper quis ut arcu. Ut non nisl a mollis est efficitur
					vestibulum. Integer eget purus nec nulla mattis et accumsan ut
					magna libero. Morbi auctor iaculis porttitor. Sed ut magna ac risus
					et hendrerit scelerisque. Praesent eleifend lacus in lectus aliquam
					porta. Cras eu ornare dui curabitur lacinia.</p>
				<footer class="major">
					<ul class="actions special">
						<li><a href="generic.html" class="button">Learn More</a></li>
					</ul>
				</footer>
			</section>

			<!-- Get Started -->
			<section id="cta" class="main special">
				<header class="major">
					<h2>Congue imperdiet</h2>
					<p>
						Donec imperdiet consequat consequat. Suspendisse feugiat congue<br />
						posuere. Nulla massa urna, fermentum eget quam aliquet.
					</p>
				</header>
				<footer class="major">
					<ul class="actions special">
						<li><a href="generic.html" class="button primary">Get
								Started</a></li>
						<li><a href="generic.html" class="button">Learn More</a></li>
					</ul>
				</footer>
			</section>

		</div>

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