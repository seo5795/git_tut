<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="custom"%>
<!DOCTYPE HTML>
<!--
	Stellar by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>Elements - Stellar by HTML5 UP</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
	</head>
	<body class="is-preload">

		<!-- Wrapper -->
			<div id="wrapper">


				<custom:header/>
				<!-- Main -->
					<div id="main">

						<!-- Content -->
							<section id="content" class="main">

								<!-- Form -->
									<section>
										<h2>Form</h2>
										<form method="post" action="insertUsers.do">
											<div class="row gtr-uniform">
												<div class="col-12">
													<input type="text" name="id" placeholder="id" />
												</div>
												<div class="col-12">
													<input type="password" name="pw" placeholder="password" />
												</div>
												<div class="col-12">
													<input type="text" name="name" placeholder="name" />
												</div>
												<div class="col-12">
													<input type="text" name="mail" placeholder="mail" />
												</div>
												<div class="col-12">
													<select name="role">
														<option value="">- Role -</option>
														<option value="admin">Admin</option>
														<option value="customer">Customer</option>
													</select>
												</div>
												
												
												<div class="col-12">
													<ul class="actions">
														<li><input type="submit" value="Send Message" class="primary" /></li>
													</ul>
												</div>
											</div>
										</form>
									</section>

							</section>

					</div>

				
				<custom:footer/>

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