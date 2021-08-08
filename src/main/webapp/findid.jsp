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

					<p>확인확인</p>
					
						<c:forEach var="v" items="${users}">
						<tr>
						<td>확인확인2</tr>
						<td><a href=#> ${v.id}</a></td>
						</c:forEach>
					
</body>
</html>