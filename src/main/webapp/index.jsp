
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$title$</title>
</head>
<body>
<%--  <%= 变量或者表达式%>
      <% jsp脚本片段%>

--%>
<%=new java.util.Date()%>
<% int sum=0;
    for (int i = 0; i < 30; i++) {
        sum+=i;
    }out.println("<h1>Sum="+sum+"</h1>");%>

<h1>html语法适用</h1>
<input type="text" value="text">在代码中嵌入html元素
<% for (int i = 0; i < 6; i++) {

%>
<h2>hello html <%=i%></h2>

<% }%>

<h3>在默认 _jspservice方法外写方法</h3>
<h2>jsp声明会被jsp生成到Java类中</h2>
<%!
    static {
        System.out.println("hello static");
    }
    private int globalVar=0;
    public void jspInit(){
        System.out.println("进入方法");
    }
%>
<h2>el表达式简化jsp语法 \${}</h2>
<h3>jsp注释不会在客户端显示html可以审查元素中查看<%----%></h3>
</body>

</html>
