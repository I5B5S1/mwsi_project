<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style type="text/css">
table {
	text-align: center;
	border: solid 2px black;
}

td {
	border-right: solid 2px black;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<c:choose>
			<c:when test="${not empty requestScope.validationError}">
			${requestScope.validationError}
		</c:when>
			<c:when test="${not empty requestScope.jpaError}">
			${requestScope.jpaError}
		</c:when>
			<c:otherwise>
			${requestScope.positiveResult}
		</c:otherwise>
		</c:choose>
	</div>
	<div>
		<c:if test="${not empty requestScope.showRecords}">
			<jsp:include page="/TableCreatorServlet" />
		</c:if>
	</div>
</body>
</html>