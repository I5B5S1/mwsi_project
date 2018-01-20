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
<title>Dodawanie nowego dowodu</title>
</head>
<body>
	<div>

		<h2>Podaj dane dowodu rejestracyjnego:</h2>
		<form action="/CEPiK/pl/registrationCertificateAction" method="get">
			Numer rejestracyjny <br> <input type="text"
				name="registrationNumber" placeholder=""><br> Seria <br>
			<input type="text" name="series" placeholder=""><br>
			Numer <br> <input type="text" name="number" placeholder=""><br>
			Organ wydajacy <br> <input type="text" name="issuingAuthority"
				placeholder=""><br> Data rejestracji <br> <input
				type="text" name="registrationDate" placeholder=""><br>
			Kraj rejestracji <br> <input type="text"
				name="registrationCountry" placeholder=""><br> Data
			piewszej rejestracji <br> <input type="text"
				name="firstRegistrationDate" placeholder=""><br> Okres
			Ważnosci <br> <input type="text" name="expireDsate"
				placeholder=""><br> Data badania <br> <input
				type="text" name="examinationDate" placeholder=""><br>
			Data następnego badania<br> <input type="text"
				name="nextExaminationDate" placeholder=""><br> Data
			utraty dowodu rejestracyjnego <br> <input type="text"
				name="registrationCertificateLoss" placeholder=""><br>
			Data odzyskania dowodu rejestracyjnego<br> <input type="text"
				name="registrationCertificateRetrieval" placeholder=""><br>
			<input type="submit" name="get" value="Pobierz"> <input
				type="submit" name="add" value="Dodaj">
		</form>
	</div>
	<jsp:include page="./home.jsp" />
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