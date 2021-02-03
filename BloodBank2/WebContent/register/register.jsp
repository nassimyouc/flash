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

</head>
<body>
	<jsp:include page="../common/header.jsp"></jsp:include>
	
	<form action="<%=request.getContextPath()%>/register" method="post">
	<div class="container">

	<h2>User Register Form</h2>
	<div class="col-md-6 col-md-offset-3">
			<div class="alert alert-success center" role="alert">
				<p>${NOTIFICATION}</p>
			</div>
			
				

					<div class="form-group">
						<label for="uname">name:</label> <input type="text"
							class="form-control" id="uname" placeholder="votre nom"
							name="name" required>
					</div>

					<div class="form-group">
						<label for="uname">mobil:</label> <input type="text"
							class="form-control" id="uname" placeholder=" votre numero de telephone"
							name="mobile_number" required>
					</div>

					<div class="form-group">
						<label for="uname">email:</label> <input type="mail"
							class="form-control" id="username" placeholder="botre adress email"
							name="email" required>
					</div>

					<div class="form-group">
						<label for="uname">group Blood:</label> <input type="text"
							class="form-control" id="password" placeholder="type de sang"
							name="blood_group" required>
					</div>

					<button type="submit" class="btn btn-primary">Submit</button>

				
			</div>
		</div>
	
	</form>
</body>
</html>