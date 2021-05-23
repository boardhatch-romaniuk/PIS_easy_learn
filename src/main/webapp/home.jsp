<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Newsreader&display=swap" rel="stylesheet">
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<header class="site_header">
        <div class="container">
        <div class="logo">
            <a href="/">
                EasyLearn
            </a>
        </div>
        <div class="head_nav">
                <input class="search_bar" type="text" placeholder="Search for courses"/>
        </div>
        <a class="loginBtn" href="#">Login</a>
        <a class="loginBtn outBtn" href="#">Sign out</a>
    </div>
    </header> 
    <main>
        <div class="container">
        <section class="subjects">
            <div>
                <a href="topics?id=1">Java</a>
                <div>
                    <c:forEach var="el" items="${list}">
                        <div class="fblock">
                        <div class="mg">
                        <a href="topics?sid=${el.id}">
                            <img src="${el.img}" alt="" width='${el.width}' height='${el.height}'/>
                        </a>
                            <p>
                                ${el.description}
                            </p>
                        </div>
                        </div>
                    </c:forEach>  
                </div>
            </div>
        </section>
    </div>
    </main>
</body>
</html>