<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/13
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登陆</title>
</head>
<body>
<div align="center" style="margin-top: 50px">
    <h2>用户登陆</h2><br>
    <form action="/dologin" method="post">
        账号：<input name="loginid" size="20"/><br>
        密码：<input name="password" type="password" size="20"/><br><br>
        <input type="submit" value="登录" size="10"/>
        <input type="button" value="返回" size="10" onclick="javascript:history.back();"/>
    </form>
    <table align="center">
        <tr>
            <td style="color:red;">${message}</td>
        </tr>
    </table>
</div>
</body>
</html>
