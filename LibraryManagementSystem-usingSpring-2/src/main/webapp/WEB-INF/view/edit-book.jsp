<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Library</title>

</head>
<body>
	<div>
		<h2> NEW USER</h2>
	</div>
	<div>
		<form:form method = "post" modelAttribute="book" action="${book.id}/update">
			<div>
				Id: ${book.id }
			</div>	
			<div>
				<form:label path="author">AUTHOR</form:label>
				<form:input path="author" type="text"/>
			</div>
			<div>
				<form:label path="name">NAME</form:label>
				<form:input path="name" type="text"/>
			</div>
			<div>
				<div>
					<input type='submit' value='Update User'>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>


<!-- 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Library</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" />
</head>
<body>
	<div class="card">
	<div class="card-header bg-info text-center text-yellow">
		<h2> UPDATE USER</h2>
		</div>
	</div>
	<div>
		<form:form method = "post" modelAttribute="book" action="${book.id}/update">
			<div>
				Id: ${book.id }
			</div>	
			<div>
				<form:label path="author">AUTHOR</form:label>
				<form:input path="author" type="text"/>
			</div>
			<div>
				<form:label path="name">NAME</form:label>
				<form:input path="name" type="text"/>
			</div>
			<div>
				<div>
					<button type="submit" value='update user' class="btn btn-success">
					ADD USERS <i class="fa fa-plus-square" aria-hidden="true"></i>
				</button>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>
 -->