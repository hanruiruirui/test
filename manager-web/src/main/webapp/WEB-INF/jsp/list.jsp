<%--
  Created by IntelliJ IDEA.
  User: 韩瑞
  Date: 2019/5/28
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="/user/addUser" method="post">
        姓名:<input type="text" name="username"> <br/>
        年龄:<input type="text" name="userage"><br/>
             <input type="button" value="添加">
    </form>
</body>
</html>
