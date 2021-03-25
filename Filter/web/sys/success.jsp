
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
<%--<%-注销后不能直接回到主页-%>

<%--    Object usersession= request.getSession().getAttribute("user_session");--%>
<%--    if (usersession == null) {--%>
<%--//        pageContext.forward("/login.jsp");--%>
<%--        response.sendRedirect("/login.jsp");--%>
<%--    }--%>
<%--%>--%>
<h1>主页</h1>
success
<p><a href="/servlet/logout">注销</a></p>
</body>
</html>
