<%--
  Created by IntelliJ IDEA.
  User: heroine
  Date: 2021/3/19
  Time: 3:12 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp jstl标签</title>
</head>
<body>
<%--转发
http://localhost:8081/jsptag?name=pn$age=11
--%>
<jsp:forward page="jsptag02.jsp">
    <jsp:param name="name" value="11"/>
    <jsp:param name="age" value="12"/>
</jsp:forward>










</body>
</html>
