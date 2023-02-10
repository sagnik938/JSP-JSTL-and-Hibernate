<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.jsp"%>
<!--%@include file = "index.html" %-->
<!--%@taglib uri = "library location..." prefix="c" %-->

<!-- <p.out></p.out> custom tag perfix.tag created -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Declarative tag to specify things above service method -->

<%!
int sq(int num){
	return(num*num);
}
%>

<!-- this is a scriplet tag it goes in the service method of servlet generated -->
<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	out.println(i+j);
	out.println(sq(i+j));
%>
<!-- This is an expression tag all this goes to the out.print() method internally-->
<%="Expression tag" %>
<br>
<%=" sq of addition value is: " + sq(i+j) %>
<br>
<%= "Value of num1 is: "+request.getParameter("num1")  %>

<!-- page directive, include directive and taglib -->
<!-- multiple imports in page tag can be used -->
<!-- include directive is used to include some other things -->
<!-- taglib is used to include custom tags made in any library using prefix.tagname -->
<!-- Exception handling demo -->
<%
	try{
		int k = 9/0;
	}catch(Exception e){
		out.println(e.getStackTrace());
	}
%>
<%
	int k = 8/0;
%>
</body>
</html>