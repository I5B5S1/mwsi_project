<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Logowanie</title>
	
</head>
<body>
	<div>

		<h1>Witamy na stronie logowania CEPiK!</h1>
		<h2>Podaj swoje dane:</h2>
		<form action="/CEPiK/pl/loginCredentials" method="post">
			<!-- Reszta kodu bez zmian -->
			Nazwa użytkownika: 
			<br> 
			<input type="text" name="username" placeholder="Wprowadź login">
			<br> 
			Hasło:
			 <br> 
			<input type="password" name="password" placeholder="Wprowadź hasło">
			<br>
			<input type="submit" value="Wyślij">
		</form>
	</div>

	<%-- <div>
				<c:if test="${not empty requestScope.loginFailure }">
					Wprowadzony login lub hasło są niepoprawne
				</c:if>
		

	</div> --%>
	<jsp:include page="./home.jsp" />
</body>
</html>