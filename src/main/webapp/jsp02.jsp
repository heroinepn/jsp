<%--<%@ page errorPage="/error/500.jsp" %>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--显示说明这是一个错误页面--%>
<%@ page isErrorPage="false" %>
<html>
<head>
    <title>指令</title>
</head>
<body>
<%--<%--%>
<%--    int i=0;--%>
<%--    System.out.println(1/i);--%>
<%--%>--%>
<h1>jsp指令标签</h1>
<h2>@include会将两个页面合二为一</h2>
<h2>jsp：include：拼接页面本质还是两个两个页面设置同一变量不影响</h2>
<%@include file="common/header.jsp"%>
<h1>网页主体</h1>
<%@include file="common/bottom.jsp"%>
<h1>jsp标签与之不同点在路径/上但现在却不影响</h1>
<jsp:include page="/common/header.jsp"></jsp:include>
<h2>主体</h2>
</body>
</html>
