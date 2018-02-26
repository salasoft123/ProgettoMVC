<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body bgcolor="#ALCMRK">
        <h1>Dettaglio registrazioni studenti : </h1>
        
        <p>This is the Page details of students  !</p>
        
        <!-- nel controller occorre conservare le stesse notazioni di variabili usati come properties 
        map.put("matricola", studente.getMatricola());
		map.put("cognome", studente.getCognome());
		map.put("nome", studente.getNome());
		map.put("nome", studente.getCDS()); -->
        
        
        <table>
		
		<tr>
		<td>Matricola :</td> 
		 <td>${matricola}</td>
		
		 </tr>
		
		<tr>
		<td>Nome :</td>
		<td>${nome}</td>
		 </tr>
		 
		 <tr>
		<td>Cognome:</td><td>${cognome}</td>
		 </tr>
		 
		 <tr>
		<td>CDS  :</td><td>${CDS}</td>
		 </tr>
		 
		
       </table> 
        
     
    </body>
</html>
