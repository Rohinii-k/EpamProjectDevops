<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  <link rel="stylesheet" href="css/styleone.css">
  <link rel="stylesheet" href="css/style.css">
  <link href="https://fonts.googleapis.com/css?family=Spicy+Rice&display=swap" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Viga&display=swap" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Fredoka+One&display=swap" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
 
</head>
<body>
	<div class="main">
	<jsp:include page="navbar.jsp"></jsp:include>
	<div class="clearfix"></div>
	<div class="container mt-5">	
	<h4 class="p-2 text-white">Profile</h4>
	
	<table class="table table-bordered table-light shadow">
		
			<tbody>
				<c:forEach items="${list }" var="user">
					<tr>
					<tr>
						<th scope="row">Userid</th>
						<td><span th:text="${user.userid }"></span></td>
					</tr>
					<tr>
						<th scope="row">User Name</th>
						<td><span th:text="${user.uname }"></span></td>
					</tr>
					<tr>
						<th scope="row">Gender</th>
						<td><span th:text="${user.gender }"></span></td>
					</tr>
					<tr>
						<th scope="row">Address</th>
						<td><span th:text="${user.address }"></span></td>
					</tr>
					<tr>
						<th scope="row">Phone no</th>
						<td><span th:text="${user.phone }" ></span></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	
	</div>
</div>
</body>
</html>