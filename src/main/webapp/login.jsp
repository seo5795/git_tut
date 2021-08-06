<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="custom"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
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
	window.onload = function() {
		var login = document.login;
		login.onsubmit = function() {
			var ans = document.getElementById('ans');
			ans.innerHTML = '<div id="ans"></div>';
			if (!login.id.value) {
				var txt = document.createTextNode('enter your id!');
				ans.appendChild(txt);
				return false;
			}
			if (!login.pw.value) {
				var txt = document.createTextNode('enter yout password!');
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


		<custom:header />

		<!-- Main -->
		<div id="main">

			<!-- Introduction -->
			<section id="intro" class="main">
				<div class="spotlight">
					<div class="content">
						<header class="major">
							<h2>로그인 페이지</h2>
						</header>
						
						<form action="login.do" method="post">
							<table>
								<tr>
									<td>아이디</td>
									<td><input type="text" name="id"></td>
								</tr>
								<tr>
									<td>패스워드</td>
									<td><input type="password" name="pw"></td>
								</tr>
								<tr>
									<td colspan="2"><input type="submit" value="로그인하기"></td>
								</tr>
							</table>
						</form>
						<div id="ans"></div>
						<br> <br>

						<ul class="actions">
							<li><a href="insertUsers.jsp" class="button">회원가입</a></li>
							<li><a href="generic.html" class="button">아이디/비밀번호 찾기</a></li>
						</ul>
					</div>
					<span class="image"><img src="images/pic01.jpg" alt="" /></span>
				</div>
			</section>



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