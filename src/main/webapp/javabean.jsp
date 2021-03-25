<%@ page import="com.pn.entity.People" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--使用一个对象--%>
<%--<%--%>
<%--    People people=new People();
        people.setid();
--%>
<%--%>--%>
<%--<%= people.getAddress()%>--%>
<jsp:useBean id="people" class="com.pn.entity.People" scope="page"/>
<jsp:setProperty name="people" property="id" value="1"/>
<jsp:setProperty name="people" property="name" value="pn"/>
<jsp:setProperty name="people" property="age" value="1"/>
<jsp:setProperty name="people" property="address" value="河南"/>
ID：<jsp:getProperty name="people" property="id"/>
姓名：<jsp:getProperty name="people" property="name"/>
年龄：<jsp:getProperty name="people" property="age"/>
地址：<jsp:getProperty name="people" property="address"/>

</body>
</html>
