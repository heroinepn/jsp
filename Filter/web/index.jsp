
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>监听</title>
  </head>
  <body>
  <h1>当前有<span><%=request.getServletContext().getAttribute("OnlineCount")%></span>人在线</h1>
  </body>
</html>
