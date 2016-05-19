<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: xzhb
  Date: 16-5-19
  Time: 上午11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Name Collector</title>
</head>
<body>
<h4>Enter your name</h4>
<s:form action="HelloAction">
    <s:textfield name="name" label="your name"/>
    <s:submit/>


</s:form>
</body>
</html>
