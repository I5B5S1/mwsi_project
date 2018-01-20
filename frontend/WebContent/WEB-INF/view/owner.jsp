<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Właściciele</title>
</head>
<body>
	<div>

		<h2>Podaj dane właściciela pojazdu:</h2>
		<form action="/CEPiK/pl/ownerAction" method="post">
			Pesel <br> <input type="text" name="pesel" placeholder=""><br> 
			Imię <br> <input type="text" name="name" placeholder="Jan"><br>
			Nazwisko	<br> <input type="text" name="surname" placeholder="Kowalski"><br>
			Data Urodzenia	<br> <input type="text" name="birthday" placeholder="dd/mm/rrrr"><br>
			Adres<br>
			Miejscowość <br> <input type="text" name="town" placeholder="Warszawa"><br>
			Ulica <br> <input type="text" name="street" placeholder="Wojska Polskiego"><br>
			Numer budynku <br> <input type="text" name="buildingNubmer" placeholder="1"><br>
			Numer lokalu <br> <input type="text" name="houseNumber" placeholder="2"><br>
			REGON <br> <input type="text" name="regon" placeholder=""><br>	
			<input type="submit" value="Pobierz">
		</form>
	</div>
	<jsp:include page="./home.jsp" />
	<jsp:include page="./entity.jsp" />

</body>
</html>