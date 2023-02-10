<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
 <%@taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- 

<!-- set and out tag -->
<c:set var = 'i' value = "25"></c:set>
<h2><c:out value = "${i}"></c:out></h2>
<c:if test="${ i>20 }"><h3>i is greater than 20</h3></c:if>

<!-- choose when otherwise -->
<c:set var = "opt" value = "40"></c:set>
<c:choose>
	<c:when test="${opt == 40 }"><h3>opt is 40</h3></c:when>
	<c:when test="${opt == 30 }"><h3>opt is 30</h3></c:when>
	<c:when test="${opt == 50 }"><h3>opt is 50</h3></c:when>
	<c:otherwise><h3>Other option</h3></c:otherwise>	
</c:choose>

<!-- for each -->
<c:forEach var='j' begin="1" end="10">
	<c:out value="${j}"></c:out>
</c:forEach>
--%>

<%-- 
<!-- urls -->
<!--  -->
<c:url var="newurl" value="https://www.google.com/">
	<c:param name="q" value="jstl"></c:param>
</c:url>
<c:redirect url = "${newurl}"></c:redirect>
<!-- remove tag -->
<c:remove var = "i" />
<h2><c:out value = "${i}"></c:out></h2>
--%>

<!-- Functions demo -->
<c:set var = "demostr"  value = "ABCabc123.$#@" ></c:set>
<c:out value = "${demostr}"></c:out>
<c:out value = "${fn:length(demostr)}" ></c:out>

<!-- SQL demo -->
<sql:setDataSource driver = "oracle.jdbc.driver.OracleDriver" url = "jdbc:oracle:thin:@localhost:1521/orcl.NRIFINTECH.COM" user= "SYSTEM" password = "Najanaja#28" var = "data"></sql:setDataSource>
<sql:query var="rs" dataSource="${data}">select * from loc</sql:query>

 <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of locations</h2></caption>
            <tr>
                <th>ID</th>
                <th>Location</th>
            </tr>
            <c:forEach var="loc" items="${rs.rows}">
                <tr>
                    <td><c:out value="${loc.locid}" /></td>
                    <td><c:out value="${loc.city}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>