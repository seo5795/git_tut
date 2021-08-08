<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<noscript>
	<link rel="stylesheet" href="assets/css/noscript.css" />
</noscript>
</head>
<body class="is-preload">

	<!-- Wrapper -->
	<div id="wrapper">

		<custom:header />

		<!-- Main -->
		<div id="main">

			<!-- Main -->
			<div id="main">

				<!-- Content -->
				<section id="content" class="main">
					<span class="image main"><img src="images/pic04.jpg" alt="" /></span>
					<h2>아이디 찾기</h2>
					<form action="findId.do" method="post">
						<span>이름</span><input type="text" id="name"> <br> <span>이메일</span><input
							type="text" id="mail"> <input type="submit" value="id찾기">
					</form>
				
					
					<br>
					<hr>
					<br>
					<h2>비밀번호찾기</h2>
					<form action="findPw.do" method="post">
						<span>ID입력</span><input type="text" id="id"> <span>이메일</span><input
							type="text" id="mail"> <input type="submit" value="pw찾기">
						<br>
					</form>
					<div id="ans"></div>


				</section>

			</div>

		</div>
		<custom:footer />


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