<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<head>
    <title>取</title>
</head>
<body>
<%--取出参数--%>
名字：<%=request.getParameter("name")%>
年龄：<%=request.getParameter("age")%>
<%--EL表达式获取表单的数据
${param.参数名}
--%>
<form action="jsptag02.jsp" method="post">
    <input type="text" name="username" value="${param.username}">
    <input type="submit" value="登录">
</form>
<%--判断jstl标签--%>
<c:if test="${param.username=='admin'}" var="isAdmin">
    <c:out value="hello"></c:out>
</c:if>
<%--var	用于存储条件结果的变量--%>
<c:out value="${isAdmin}"></c:out>
<c:set var="score" value="88"></c:set>
<c:choose>
    <c:when test="${score>=80}">
        成绩ok
    </c:when>
    <c:when test="${score>=90}">
        成绩good
    </c:when>
    <c:when test="${score<80}">
        成绩up
    </c:when>
</c:choose>

<%
    ArrayList<String> App=new ArrayList<>();
    App.add(0,"微博");
    App.add(1,"微信");
    App.add(2,"抖音");
    App.add(3,"QQ");
request.setAttribute("list",App);
%>
<%--
var 每一次遍历出来的变量
items	要被循环的信息
begin	开始的元素（0=第一个元素，1=第二个元素）--%>
<c:forEach var="App" items="${list}">
    <c:out value="${list}"></c:out></br>

</c:forEach>

</body>
</html>
