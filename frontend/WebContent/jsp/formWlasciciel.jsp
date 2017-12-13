<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodawanie nowego właściciela</title>
</head>
<body>
	<div>

		<h2>Podaj dane właściciela pojazdu:</h2>
		<form action="../DodajWlasc" method="post">
			Pesel <br> <input type="text" name="pesel" placeholder=""><br> 
			Imię <br> <input type="text" name="imie" placeholder="Jan"><br>
			Nazwisko	<br> <input type="text" name="nazwisko" placeholder="Kowalski"><br>
			Data Urodzenia	<br> <input type="date" name="dataurodzenia" placeholder=""><br>
			Adres<br>
			Miejscowość <br> <input type="text" name="miejscowosc" placeholder="Warszawa"><br>
			Ulica <br> <input type="text" name="ulica" placeholder="Wojska Polskiego"><br>
			Numer budynku <br> <input type="text" name="nrbudynku" placeholder="1"><br>
			Numer lokalu <br> <input type="text" name="nrlokalu" placeholder="2"><br>
			REGON <br> <input type="text" name="regon" placeholder=""><br>	
			<input type="submit" value="Wyślij">
		</form>
	</div>

</body>
</html>