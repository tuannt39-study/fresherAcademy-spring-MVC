<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<div align="center">
		<form:form action="userRegister" method="POST" modelAttribute="fresher">
			<table>
				<tr>
					<td><form:label path="username">Username</form:label></td>
					<td><form:input path="username" name="username" id="username" />
					</td>
				</tr>
				<tr>
					<td><form:label path="password">Password</form:label></td>
					<td><form:input path="password" name="password" id="password" />
					</td>
				</tr>
				<tr>
					<td><form:label path="location">Location</form:label></td>
					<td><form:input path="location" name="location" id="location" />
					</td>
				</tr>
				<tr>
					<td><form:label path="year">Year</form:label></td>
					<td><form:input path="year" name="year" id="year" /></td>
				</tr>
				<tr>
					<td></td>
					<td><form:button name="login" id="register">Register</form:button></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>