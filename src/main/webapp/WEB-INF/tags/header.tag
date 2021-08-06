<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Header -->
		<header id="header" class="alt">
			<span class="logo"><a href="index.jsp"><img src="images/logo.svg" alt="" /></a></span>
			<h1>Job Planet</h1>
			<c:choose>
			<c:when test="${ vvv == null }">
				<p>환영합니다!</p>
			</c:when>
			<c:otherwise>
				<p>환영합니다 ${vvv.name}!</p>
			</c:otherwise>
		</c:choose>
		</header>
<c:if test="${vvv.id ==null}"><!-- 만약 작성자라면, -->
	<!-- Nav -->
		<nav id="nav">
			<ul>
				<li><a href="insertBoard.jsp">Board</a></li>
				<li><a href="getBoardList.do">BoardList</a></li>
				<li><a href="login.do">Login</a></li>
				<li><a href="insertUsers.jsp">Registration</a></li>
			</ul>
		</nav>
</c:if>
<c:if test="${vvv.id != null}"><!-- 만약 작성자라면, -->
	<!-- Nav -->
		<nav id="nav">
			<ul>
				<li><a href="insertBoard.jsp">Board</a></li>
				<li><a href="getBoardList.do">BoardList</a></li>
				<li><a href="logout.do">Logout</a></li>
				<li><a href="mypage.jsp">My Page</a></li>
			</ul>
		</nav>

</c:if>