<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Studenti</title>
</head>
  <body bgcolor="#ALCMRK"   style="display:block;
    border: 2px solid black;
    border-collapse: separate;
    border-spacing: 4px; ">
    
	<h1>Lista degli Studenti</h1>
	
	
	
	<div align="center"><font></font>
        <table border="1" cellpadding="5" class="table table-striped"><font></font>
        
            <caption><h2>List of Students of Turin politecnic </h2></caption><font></font>
            <tr><font></font>
                <th>CODINS</th><font></font>
                <th>Crediti</th><font></font>
                <th>Nome</th><font></font>
                <th>PD</th><font></font>
               
            </tr><font></font>
            <c:forEach items="${listaCorsi}" var="corseList"><font></font>
                <tr><font></font>
                    <td><c:out value="${corseList.codins}" /></td><font></font>
                    <td><c:out value="${corseList.crediti}" /></td><font></font>
                    <td><c:out value="${corseList.nome}" /></td><font></font>
                    <td><c:out value="${corseList.pd}" /></td><font></font>
                     <td><a href="#"><c:out value="update" /></a></td><font></font>
                      <td><a href="#"><c:out value="delete" /></a></td><font></font>
                       
                </tr><font></font><font><font>
            </c:forEach></font></font><font></font><font><font>
        </ Table></font></font><font></font><font><font>
    </ Div></font></font><font></font><font><font>
</ Body></font></font><font></font><font><font>
</ Html></font></font><font></font>
	

           