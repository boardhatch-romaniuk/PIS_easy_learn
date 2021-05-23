<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Topics</title>
</head>
<body>
	<section>
        <c:forEach var="el" items="${list}">
            <c:out value="${el.id}"/>
            <c:out value="${el.str}"/>
            <br>
        </c:forEach>      
    </section>
</body>
</html>