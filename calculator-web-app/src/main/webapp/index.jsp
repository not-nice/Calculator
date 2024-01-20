<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculator Web App</title>
</head>
<body>
    <h1>Simple Calculator</h1>
    <form action="calculate" method="post">
        Enter Number 1: <input type="text" name="num1"><br>
        Enter Number 2: <input type="text" name="num2"><br>
        <input type="submit" value="Calculate">
    </form>
    <% if (request.getAttribute("result") != null) { %>
        <p>Result: ${result}</p>
    <% } %>
</body>
</html>
