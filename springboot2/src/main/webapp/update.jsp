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
    <form action="/hello/update" method="post">
        ID:<input type="text" value="${student.id}" readonly/><br/>
        name:<input type="text" value="${student.name}"/><br/>
        age:<input type="text" value="${student.age}"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
