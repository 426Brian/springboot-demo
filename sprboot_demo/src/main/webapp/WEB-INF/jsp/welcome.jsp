<%--
  Created by IntelliJ IDEA.
  User: Brian
  Date: 2018/5/4
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.0.0-2/css/bootstrap-jsf.css"/>
    <c:url value="/css/main.css" var="jstlCss"/>
    <link href="${jstlCss}" rel="stylesheet"/>
    <title>welcome</title>
</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-band" href="#">Spring Boot</a>
        </div>
        <div class="navbar" content="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#">about</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <div class="starter-template">
        <h1>Spring Boot Web JSP Example</h1>
        <h2>Message:${message}</h2>
    </div>
</div>
<div>
    <video height="240" width="240" controls="controls">
        <source src="C:\Users\Brian\Videos\mov_bbb.mp4" type="video/mp4">
    </video>

    <video height="240" width="240" controls="controls">
        <source src="C:\Users\Brian\Videos\parrot.mp4" type="video/mp4">
    </video>

</div>
<script type="text/javascript" src="webjars/bootstrap/4.0.0-2/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
  $(function(){
      // alert('a');
  })
</script>
</body>
</html>