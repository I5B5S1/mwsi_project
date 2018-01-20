<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CEPiK</title>
<style type="text/css">
div {
	float: left;
	margin: 0px 150px 0px 0px;
}
</style>
</head>
<body>
	<div>
		<c:choose>
			<c:when test="${empty sessionScope.user}">
				<a href="/CEPiK/pl/login">Zaloguj się</a>
			</c:when>
			<c:otherwise>
				<div>
					<a href="/CEPiK/pl/registrationCertificate">Dowody
						rejestracyjne</a>
				</div>
				<div>
					<a href="/CEPiK/pl/vehicle">Pojazdy</a>
				</div>
				<a href="/CEPiK/pl/logOut">Wyloguj się</a>
			</c:otherwise>
		</c:choose>
	</div>


</body>
</html>