<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodawanie nowego dowodu</title>
</head>
<body>
	<div>

		<h2>Podaj dane dowodu rejestracyjnego:</h2>
		<form action="../DodajDowod" method="post">
            Numer rejestracyjny <br> <input type="text" name="nrRejestracyjny" placeholder=""><br>
			Seria <br> <input type="text" name="seria" placeholder=""><br>
			Numer	<br> <input type="text" name="numer" placeholder=""><br>
            Organ wydajacy <br> <input type="text" name="organWydajacy" placeholder=""><br>
            Data rejestracji <br> <input type="date" name="dataRej" placeholder=""><br>
            Kraj rejestracji <br> <input type="text" name="krajRej" placeholder=""><br>
            Data piewszej rejestracji <br> <input type="date" name="dataPierwszejRej" placeholder=""><br>
            Okres Ważnosci <br> <input type="date" name="okresWaznosci" placeholder=""><br>

            Data badania <br> <input type="date" name="dataBadania" placeholder=""><br>
            Data następnego badania<br> <input type="date" name="dataNastBadania" placeholder=""><br>
			<input type="submit" value="Wyślij">
		</form>
	</div>

</body>
</html>