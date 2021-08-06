<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="custom"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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

			<!-- Content -->
			<section id="content" class="main">


				<!-- Table -->
				<section>
					<h2>BoardList</h2>
						<form action="getBoardList.do" method="post">
							<table width="800">
								<tr>
									<td align="right">
										<div class="col-6 col-12-xsmall">
											<select name="search" >
												<option value="title">제목</option>
												<option value="theme">카테고리</option>
												<option value="content">내용</option>

											</select>
										</div> 
										<input type="text" name="searchContent"> <input
										type="submit" value="검색하기">
									</td>
								</tr>
							</table>
						</form>
					<div class="table-wrapper">
						
						<table>
							<thead>
								<tr>
									<th>Number</th>
									<th>Title</th>
									<th>Date</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="v" items="${boardList}">
									<tr>
										<td>${v.bid}</td>
										<td><a href="getBoard.do?bid=${v.bid}">${v.title}</a></td>
										<td>${v.theme}
										<td>${v.wdate}</td>
									</tr>

								</c:forEach>
							</tbody>
						</table>
					</div>
				</section>
				</section>
		</div>

		<custom:footer />
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
</body>
</html>