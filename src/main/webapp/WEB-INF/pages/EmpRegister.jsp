<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>WELL COME TO EMP REGISTER PAGE</h3>
	<form action="save" method="POST">

		NAME:<input type="text" name="eName" /> 
		EMAIL:<input type="text" name="eEmail" />
		SALARY:<input type="text" name="eSal" /> 
		DEPT:<select name="dept">
		<option value="">-select-</option>
		<option value="Dev">DEV</option>
		<option value="QA">QA</option>
		<option value="Tester">Tester</option>
		<option value="BA">BA</option>
		</select> 
		
		<input type="submit" value="ADD EMPLOYEE">

	</form>
	${msg}
</body>
</html>