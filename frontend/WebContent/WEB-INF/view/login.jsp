<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Logowanie</title>
</head>
<body>
	<div>

		<h1>Witamy na stronie logowania CEPiK!</h1>
		<h2>Podaj swoje dane:</h2>
		<form action="../Login" method="post">
			<!-- Reszta kodu bez zmian -->
			Nazwa użytkownika: <br> <input type="text" name="username"
				placeholder="Wprowadź login"><br> Hasło: <br> <input
				type="password" name="pass" placeholder="Wprowadź hasło"><br>
			<input type="submit" value="Wyślij">
		</form>
	</div>
	
	<div>
	
		<%if(response.containsHeader("Błąd logowania")){ %>
		Wprowadzony login lub hasło są niepoprawne
		<%} %>
		<p>
			<a href="/../CEPiK">Strona główna</a>
		</p>

	</div>
</body>
</html>