<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodawanie nowego pojazdu</title>
</head>
<body>
	<div>

		<h2>Podaj dane pojazdu:</h2>
		<form action="../DodajPojazd" method="post">
			VIN <br> <input type="text" name="vin" placeholder=""><br> 
			Marka <br> <input type="text" name="marka" placeholder=""><br>
			Model	<br> <input type="text" name="model" placeholder=""><br>
			Generacja	<br> <input type="text" name="generacja" placeholder=""><br>
            Typ nadwozia <br> <input type="text" name="typNadwozia" placeholder=""><br>
            Ilość miejsc <br> <input type="text" name="iloscMiejsc" placeholder=""><br>
            Pojemność silnika <br> <input type="text" name="pojemnoscSilnika" placeholder=""><br>
			Moc<br> <input type="text" name="moc" placeholder=""><br>
            Seria karty <br> <input type="text" name="seriaKartyPojazdu" placeholder=""><br>
			Numer karty <br> <input type="text" name="nrkartypojazdu" placeholder=""><br>
            Maksymalna masa całkowita <br> <input type="text" name="maxMasaCalkowita" placeholder=""><br>
            Masa własna <br> <input type="text" name="masaWlasna" placeholder=""><br>
            Liczba osi<br> <input type="text" name="liczbaOsi" placeholder=""><br>
			<input type="submit" value="Wyślij">
		</form>
	</div>

</body>
</html>