<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
	String user1= "sagniks"; 
	String pass1 = "12345";
%>
<% 
	String user = request.getParameter("username");
	String pass = request.getParameter("pass");
	if(user.length()==0 || pass.length()==0){
		throw new Exception("Username and Password cannot be blank");
	}
	else if(!(user.equals(user1) &&  pass.equals(pass1)) ){
		throw new Exception("Incorrect Credentials");
	}
	else{
		out.println("User: "+user);
		out.println("Pass: "+pass);
	}
	%>
</body>
</html>