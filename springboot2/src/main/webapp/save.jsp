<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/2/20
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/hello/save" method="post">
        ID:<input type="text" name="id"/><br/>
        name:<input type="text" name="name"/><br/>
        age:<input type="text" name="age"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
