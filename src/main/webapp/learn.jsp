<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Learn</title>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Newsreader&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="css/styles.css">
    </head>
<body>
    <header class="site_header">
        <div class="container">
        <div>
            <a class="logo" href="/">
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
	<section>
        <div class="container">
            <h1 class="sname">${topic}</h1>
            <section class="learn">
                ${content}
            </section>
        </div>      
    </section>
</body>
</html>