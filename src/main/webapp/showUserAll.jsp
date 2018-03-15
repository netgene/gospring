<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/14
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<div align="center" style="margin-top: 50px">
    <h2>用户列表 记录数:${listSize}</h2><br>
    <form>
        <table border="1">
            <tr>
                <td>登陆账号</td>
                <td>用户名</td>
                <td>用户类型</td>
            </tr>
            <c:forEach var="user" items="${userList}">
                <tr>
                    <td>${user.loginid}</td>
                    <td>${user.userName}</td>
                    <td>${user.userType}</td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <input type="button" value="返回" size="10" onclick="javascript:history.back();"/>
    </form>

</div>
</body>
</html>
