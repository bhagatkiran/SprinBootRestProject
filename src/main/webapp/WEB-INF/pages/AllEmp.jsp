<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>WELL COME TO EMPLOYEE DATA PAGE</h2>
<table border="1">
<tr>
<td>ID</td>
<td>NAME</td>
<td>MAIL</td>
<td>SALARY</td>
<td>DEPT</td>
<td>HRA</td>
<td>DA</td>
<td>LINK</td>
</tr>
<c:forEach var="d" items="${list}">

<tr>
<td>${d.eid}</td>
<td>${d.ename}</td>
<td>${d.email}</td>
<td>${d.esal}</td>
<td>${d.esal}</td>
<td>${d.hra}</td>
<td>${d.da}</td>
<td><a href=delete?eid=${d.eid}>DELET</a></td>
<td><a href=edit?eid=${d.eid}>EDIT</a></td>

</tr>>
</c:forEach>
</table>
${message}
</body>

</html>