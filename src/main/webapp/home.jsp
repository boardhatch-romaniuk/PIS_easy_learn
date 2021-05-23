<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
                <div class="fblock">
                    <p class="pr">Java is a high-level, class-based, object-oriented programming language that is designed to have as 
                        few implementation dependencies as possible. It is a general-purpose programming 
                        language intended to let application developers write once, run anywhere (WORA), 
                        meaning that compiled Java code can run on all platforms that support 
                        Java without the need for recompilation. Java applications are typically
                        compiled to bytecode that can run on any Java virtual machine (JVM) regardless 
                        of the underlying computer architecture. The syntax of Java is similar to C and C++, 
                        but has fewer low-level facilities than either of them. The Java runtime provides
                        dynamic capabilities (such as reflection and runtime code modification) that are typically 
                        not available in traditional compiled languages. As of 2019, Java was one of the most popular 
                        programming languages in use according to GitHub,[18][19] particularly for client-server web applications, 
                        with a reported 9 million developers.</p>
                    <img src="https://upload.wikimedia.org/wikipedia/ru/thumb/3/39/Java_logo.svg/558px-Java_logo.svg.png" width="400" height="400" alt="Java">
                </div>
            </div>
            <div>
                <a href="topics?id=2">JavaScript</a>
                <div>
                    <p>JavaScript  is a programming language that conforms to the ECMAScript specification. JavaScript is high-level,
                         often just-in-time compiled, and multi-paradigm. It has curly-bracket syntax, dynamic typing, prototype-based 
                         object-orientation, and first-class functions.
                        Alongside HTML and CSS, JavaScript is one of the core technologies of the World Wide Web. 
                        Over 97% of websites use it client-side for web page behavior, often incorporating third-party libraries.
                         All major web browsers have a dedicated JavaScript engine to execute the code on the user's device.
                        As a multi-paradigm language, JavaScript supports event-driven, functional, and imperative programming styles. 
                        It has application programming interfaces (APIs) for working with text, dates, regular expressions, 
                        standard data structures, and the Document Object Model (DOM).</p>
                    <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Unofficial_JavaScript_logo_2.svg/768px-Unofficial_JavaScript_logo_2.svg.png" width="400" height="400" alt="">
                </div>
            </div>
            <div>
                <a href="topics?id=3">Python</a>
                <div>
                    <p>
                        Python is an interpreted high-level general-purpose programming language. Python's design philosophy emphasizes 
                        code readability with its notable use of significant indentation. Its language constructs as well as its 
                        object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.
                        Python is dynamically-typed and garbage-collected. It supports multiple programming paradigms, including structured
                         (particularly, procedural), object-oriented and functional programming. Python is often described as a 
                         "batteries included" language due to its comprehensive standard library.
                    </p>
                    <img src="https://i.pinimg.com/originals/91/94/c9/9194c978fa63798b2e882e6fda5eb953.png" width="400" height="400" alt="">
                </div>
            </div>
            <div>
                <a href="topics?id=4">C#</a>
                <div>
                    <p>
                        is a general-purpose, multi-paradigm programming language encompassing static typing, strong typing, lexically scoped, imperative, 
                        declarative, functional, generic, object-oriented (class-based), and component-oriented programming disciplines.[15]
                        C# was developed around 2000 by Microsoft as part of its .NET initiative and later approved as an international 
                        standard by Ecma (ECMA-334) 
                        in 2002 and ISO (ISO/IEC 23270) in 2003. It was designed by Anders Hejlsberg, and its development team is 
                        currently led by Mads Torgersen, being one of the programming languages designed for the Common Language Infrastructure (CLI).
                    </p>
                    <img src="https://www.secret-source.eu/wp-content/uploads/2017/11/C-sharp-logo.jpg" width="400" height="400" alt="">
                </div>
            </div>
        </section>
    </div>
    </main>
</div>
</body>
</html>