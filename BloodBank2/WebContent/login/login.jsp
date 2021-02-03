<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<jsp:include page="../common/header.jsp"></jsp:include>
	<div class="container col-md-8 col-md-offset-3" style="overflow: auto">
		<h1>Login Form</h1>
		<form action="<%=request.getContextPath()%>/login" method="post">
		

			<div class="form-group">
				<label for="uname">name:</label> <input type="text"
					class="form-control" id="username" placeholder="your name"
					name="name" required>
			</div>

			<div class="form-group">
				<label for="uname">email:</label> <input type="mail"
					class="form-control" id="password" placeholder="votre mail"
					name="email" required>
			</div>


			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
	
</body>
</html>