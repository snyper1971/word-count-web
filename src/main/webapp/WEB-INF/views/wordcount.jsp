<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Word Count</title>
</head>
<body>
	<center>
		<h2>Enter Text Below</h2>
		<br/>
		<div id="container">
			<form:form method = "POST" action = "parse" modelAttribute="text">
				<table>
		            <tr>
		               <td><form:textarea rows="10" cols="50"  path="text" /></td>
		            </tr>
		            <tr>		            
		            	<td><form:button>Input</form:button>
		            </tr>
				</table>
			</form:form>
		</div>
	</center>
</body>
</html>