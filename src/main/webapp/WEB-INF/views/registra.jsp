<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body bgcolor="#ALCLSC">
        <h1>Form Registration of students </h1>
        

   <form method ="GET"  action="/details">

		<table>
		
		<tr>
		<td>Matricola :</td>  <td><input type="text" name="matricola"> </td>
		
		 </tr>
		
		<tr>
		<td>Nome :</td><td><input type="text" name="nome"></td>
		 </tr>
		 
		 <tr>
		<td>Cognome</td><td><input type="text" name="cognome"></td>
		 </tr>
		 
		 <tr>
		<td>CDS  :</td><td><input type="text" name="CDS"></td>
		 </tr>
		 
		 <tr>
		<td colspan="2"><input type="submit" value="add student"></td>
		 </tr>
		
		
		</table>


      </form>
       <hr> 
       
    </body>
</html>
