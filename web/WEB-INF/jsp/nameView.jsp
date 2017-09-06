<%--
View í MVC módelinu sem birtir forsíðu til notanda

    Document   : helloView
    Created on : 6. September 2017
    Author     : Viktor Jón Helgason
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sláðu inn nafn</title>
    </head>
    <body>
        <h1>Sláðu inn nafnið þitt!</h1>

        <spring:nestedPath path="name">
            <form action="" method="post">
                Nafn:
                <spring:bind path="value">
                    <input type="text" name="${status.expression}" value="${status.value}">
                </spring:bind>
                <input type="submit" value="OK">
            </form>
        </spring:nestedPath>

    </body>
</html>