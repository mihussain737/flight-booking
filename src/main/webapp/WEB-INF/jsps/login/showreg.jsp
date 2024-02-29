<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
	<h2>New Registration</h2>
	<div class="container">
	${msg}
	</div class="container">
	<form action="saveReg" method="post">
		<table>
			<tr>
				<td>FirstName</td>
				<td><input type="text" name="firstName"
					placeholder="enter your firstName">></td>
			</tr>
			<tr>
				<td>LastName</td>
				<td><input type="text" name="lastName"
					placeholder="enter your lastName">></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"
					placeholder="enter your email">></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password"
					placeholder="enter your password">></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="save">></td>
			</tr>
		</table>

	</form>
</body>
</html>