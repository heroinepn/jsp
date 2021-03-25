
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>页面存储</title>
</head>
<body>
<%--内置对象--%>
<%--存--%>
<%//底层到高层寻找
   pageContext.setAttribute("name","pn");//数据只在一个页面有效
   request.setAttribute("name2","pn2");//数据只在一次请求有效，请求转发会携带这个数据
   session.setAttribute("name3","pn3");//数据只在一次会话中有效，打开/关闭浏览器
   application.setAttribute("nam4","pn4");//数据只在服务器中有效，打开/关闭服务器
%>
<%--取--%>
<%
   String namè=(String) pageContext.getAttribute("name");
    //通过寻找方式取
    String namè1= (String)pageContext.findAttribute("name");


%>
<%--使用el表达式输出${}--%>
   <h1>${name}</h1>
      <%=namè1%>
<%--区别取未知值一个不显示，一个显示为null--%>
</body>
</html>
