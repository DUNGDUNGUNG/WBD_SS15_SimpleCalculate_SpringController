<%--
  Created by IntelliJ IDEA.
  User: lecongdung
  Date: 27/05/2019
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculate</title>
    <style>
        body {
            font-size: 25px;
            margin: 20px;
            color: black;
        }
    </style>
</head>
<body>
<h1>Calculate</h1>
<form action="" method="post">
    <label>
        <input type="text" name="numberOne">
        <select name="operand">
            <option>+</option>
            <option>-</option>
            <option>*</option>
            <option>/</option>
        </select>
        <input type="text" name="numberTwo">
        <input type="submit" value="submit">
    </label><br>
    <label>
        Result: ${result}
    </label>
</form>
</body>
</html>
