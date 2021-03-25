<%--
  Created by IntelliJ IDEA.
  User: heroine
  Date: 2021/3/19
  Time: 2:39 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>转发</title>
</head>
<body>
<%
    pageContext.forward("/index.jsp");
//    等价
   // request.getRequestDispatcher("/index.jsp").forward(request,response);
%>
</body>
</html>
