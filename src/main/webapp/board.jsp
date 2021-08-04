<%@ page language="java"  contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="custom"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Board</title>
<link rel="icon" href="images/3.jpg">
<style>
#ans {
	color: red;
}
</style>
<script src="jquery-3.6.0.min.js"></script>
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
		<custom:head/>
		<!-- Main -->
		<div id="main">

			<!-- Content -->
			<section id="content" class="main">
				<div>

					<table border="1">
						<tr>
							<td bgcolor="lightblue">글 제목</td>
							<td>${v.title}</td>
						</tr>
						<tr>
							<td bgcolor="lightblue">작성일</td>
							<td>${v.wdate}</td>
						</tr>

						<tr>
							<td bgcolor="lightblue">상세 내용</td>
							<td><input type="text" name="content" value="${v.content}"
								disabled></td>
						</tr>
					</table>
					<a href="#"><img src="${seo}" alt="파일업로드"></a>
					
					<p>
						<a href="getBoardList.do">목록</a>&nbsp; &nbsp; <a
							href="updateBoardPage.do?bid=${v.bid }">수정하기</a>
					</p>

				</div>


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