
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- Page Heading -->
	<table border='1' cellpadding='5' cellspacing='0' width='400'>
		<tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>
			<td><h3>Duke's Soccer League: Add League</h3></td>
		</tr>
	</table>

	<p>This is for Adding new league</p>
	
	<form action="">
		<label>Title :</label><input type=text name=title> <br>
		     <label>Season
			:</label><select name=season>
			<option>Summer</option>
			<option>Winter</option>
			<option>Fall</option>
			<option>Autumn</option>
           </select><br> 
           <label>Year :</label><input type=text name=year>
           <input type="submit">
           <a href='/views/listleague.jsp'>List all leagues</a>

	</form>
	<%
	String msg=(String) request.getAttribute("msg");
 	List<String> errMsg=(List<String>) request.getAttribute("errMsg");
 	if(msg!=null){
 		%>
 		 		<span style="color :red"><%=msg %>></span><br>
 		
 		<% 
 	}
 	if(msg!=null){
 		for(String msgg: errMsg){
 		%>
 		 		<span style="color :red"><%=msg %></span><br>
 		
 		<% 
 		}
 	}
	%>

</body>
</html>