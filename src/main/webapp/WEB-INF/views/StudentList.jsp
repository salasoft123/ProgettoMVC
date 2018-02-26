<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="webjars/bootstrap/3.3.6/css/bootstrap.min.css">

<script type="text/javascript" src="webjars/jquery/3.2.1/jquery.min.js"></script>

<script type="text/javascript"
	src="webjars/angularjs/1.6.4/angular.min.js"></script>




<title>Studenti <!-- without version number (ref: WebJarsResourceResolver) -->
	<!--link href="webjars/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet"/-->
	<!--link href="webjars/font-awesome/css/font-awesome.css" type="text/css" rel="stylesheet"/-->





	<!-- self hosted libraries -->
	<link href="webjars/css/style.css" type="text/css" rel="stylesheet" />

</title>
</head>
<body bgcolor="#ALCMRK"
	style="display: block; border: 2px solid black; border-collapse: separate; border-spacing: 4px;">

	<h1>Lista degli Studenti</h1>



	<div align="center">
		<font></font>
		<table border="1" cellpadding="5"  class="table table-striped table-bordered">
			<font></font>

			<caption>
				<h2>List Students of Turin politecnic</h2>
			</caption>
			<font></font>
			<tr class="success">
				<font></font>
				<th>Matricola</th>
				<font></font>
				<th>Name</th>
				<font></font>
				<th>SurName</th>
				<font></font>
				<th>CDS</th>
				<font></font>
			</tr>
			<font></font>
			<c:forEach items="${lista}" var="stdList">
				<font></font>
				<tr>
					<font></font>
					<td><c:out value="${stdList.matricola}" /></td>
					<font></font>
					<td><c:out value="${stdList.nome}" /></td>
					<font></font>
					<td><c:out value="${stdList.cognome}" /></td>
					<font></font>
					<td><c:out value="${stdList.cds}" /></td>
					<font></font>
					<td><button Type="button" class="btn btn-success custom-width">Update</button></td>

						<font></font> <font></font>
					<td><button Type="button" class="btn btn-danger custom-width">Remove</button></td>

						<font></font>
				</tr>
				<font></font>
				<font><font>
			</c:forEach>
			</font>
			</font>
			<font></font>
			<font><font> </ Table></font></font>
			<font></font>
			<font><font> </ Div></font></font>
			<font></font>
			<font><font> <!--link href="webjars/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet"/-->
					<!--link href="webjars/font-awesome/css/font-awesome.css" type="text/css" rel="stylesheet"/-->

					</ Body>
			</font></font>
			<font></font>
			<font><font> </ Html></font></font>
			<font></font>

			<html>
<body ng-controller="studentController">

	<script type="text/javascript">

var myapp=angular.module('myapp',[]);

myapp.controller('studentController',function($scope,$http))
{

	$http.get("http://localhost:8080/ProgettoMVC/ListaStudentJson").success(function(response) {

		$scope.result=response.ListaStudentJson;
		
	});

	});
 </script>


</body>
			</html>