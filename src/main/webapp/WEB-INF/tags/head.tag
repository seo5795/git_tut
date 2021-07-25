<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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