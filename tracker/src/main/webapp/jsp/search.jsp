<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="getByName">
<div align="center">
<fieldset>
<legend>Search</legend>
ClientName: <select id="text" name="Clientname">
				<option value="indosat">Indosat</option>
				<option value="starhub">Starhub</option>
				<option value="dtac">Dtac</option>
				<option value="omantel">Omantel</option>
				<option value="batelco">Batelco</option>
			</select><br>
			<input type="submit" value="Get Details"/>
			
</fieldset>
</div>
</form>
</body>
</html>