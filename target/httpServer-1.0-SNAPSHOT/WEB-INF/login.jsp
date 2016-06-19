<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: xiao
  Date: 2016/6/13
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welocme</title>
</head>
<body>
<h2>Welcome to the login system!!</h2>
    <s:form action="register" method="post">
    <s:textfield name="username" label="Username"/>
    <s:textfield name="password" label="Password"/>
    <s:submit/>


</s:form>
</body>
</html>
