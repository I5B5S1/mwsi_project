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
		<form action="../AddProofOfRegistration" method="post">
			Numer rejestracyjny <br> <input type="text" name="registrationNumber" placeholder=""><br> 
			Seria <br> <input type="text" name="serier" placeholder=""><br>
			Numer	<br> <input type="text" name="number" placeholder=""><br>
			Organ wydajacy	<br> <input type="text" name="issuingAuthority" placeholder=""><br>
			Data rejestracji <br> <input type="date" name="registrationDate" placeholder=""><br>
			Kraj rejestracji <br> <input type="text" name="registrationCountry" placeholder=""><br>
			Data piewszej rejestracji <br> <input type="date" name="firstRegistrationDate" placeholder=""><br>
			Okres Ważnosci <br> <input type="date" name="expireDate" placeholder=""><br>
			
			Data badania <br> <input type="date" name="examinationDate" placeholder=""><br>	
			Data następnego badania<br> <input type="date" name="nextExaminationDate" placeholder=""><br>	
			<input type="submit" value="Wyślij">
		</form>
	</div>
	</div>
	<jsp:include page="./home.jsp" />
	<div>

</body>
</html>