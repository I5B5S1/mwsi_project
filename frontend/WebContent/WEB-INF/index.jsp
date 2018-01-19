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
				<c:if test="${sessionScope.user.createPermission}">
					<div>
						Dodawanie:<br> <a href="/CEPiK/pl/registrationCertificate">Dowód
							rejestracyjny: dodaj datę badania</a>
					</div>
				</c:if>
				<c:if test="${sessionScope.user.readPermission}">
					<div>
						Wyszukiwanie:<br> <a href="/CEPiK/pl/vehicle">Wyszukaj pojazdy</a>
					</div>

				</c:if>
				<c:if test="${sessionScope.user.updatePermission}">
					<div>Modyfikacja:</div>
				</c:if>
				<c:if test="${sessionScope.user.deletePermission}">
					<div>Usuwanie:</div>
				</c:if>



			</c:otherwise>
		</c:choose>
	</div>

</body>
</html>