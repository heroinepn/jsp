创建maven缓慢解决方案加属性再创建
archetypeCatalog = internal
web.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
version="3.1"
metadata-complete="true">
</web-app>
```
JSP
```text
1.什么是jsp
    Java Server page：Java服务器端页面，和servlet一样，用于动态Web技术。
2.最大的特点
    写jsp就像在写HTML
    区别：
        HTML只给用户提供静态数据
        JSP页面中可以嵌入Java代码为用户提供动态数据
3.JSP原理
    服务器内部工作
    tomacat有一个work目录
    IDEA中使用Tomcat的会在IDEA的Tomcat中生产一个work目录
4.JSP页面
    Java代码原封不动的输出
    HTML代码要转换 out.write("<html>\r\n");
```
**浏览器向服务器发送请求，不管访问什么资源，其实都是在访问Servlet**
**jsp最终也会被转换成为一个Java类 本质上就是一个Servlet**
**九大内置对象**
```text
PageContext  存东西
Request     存东西
Response
Session      存东西
Application [ServletContext] 存东西
config  [ServletConfig]
out
page
exception
   pageContext.setAttribute("name","pn");//数据只在一个页面有效
   request.setAttribute("name2","pn2");//数据只在一次请求有效，请求转发会携带这个数据
   session.setAttribute("name3","pn3");//数据只在一次会话中有效，打开/关闭浏览器
   application.setAttribute("nam4","pn4");//数据只在服务器中有效，打开/关闭服务器
```
El表达式：${}
* 获取数据
* 执行运算
* 获取web开发的常用对象

**JSP标签**
```java
<jsp:forward page="jsptag02.jsp">
    <jsp:param name="name" value="11"/>
    <jsp:param name="age" value="12"/>
</jsp:forward>

```
**JSTL表达式**

JSTL标签库的使用就是为了弥补HTML标签的不足；自定义许多标签，可以供我们使用，标签的功能和Java代码一样。
**核心标签**
核心标签是最常用的 JSTL标签。引用核心标签库的语法如下：
```xml
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
```
**格式化标签**
**SQL标签**
**XML标签**

**JavaBean**

实体类
javabean 有特定的写法
* 必须要有一个无参构造
* 属性必须私有化
* 必须由对应的get/set方法
一般用来和数据库的字段做映射 ORM
  ORM：对象关系映射
    * 表---类
    * 字段--属性
    * 行记录--对象
  
**people表**
 
ID  name  age  address
0   财宝   2     河南
1   小可   0     河南
2   喵     1     河南

```java
class people{
    private int id;
    private String name;
    private int age;
    private String  address;


}
```
**MVC**

```java
登录--->接收用户的登录请求--->处理用户的请求（获取用户登录的参数，username，password）
        ---->交给业务层处理登录业务（判断用户名密码是否正确：事务）
        --->Dao层查询用户名和密码是否正确-->数据库
```
**拦截器**

```java
        chain.doFilter(request,response);//让请求继续走，关闭拦截

```
 **监听器**     
 实现一个监听器接口
 **事务**
 ACID原则：保证数据安全
 ```txt
开启事务
事务提交 commit()
事务回滚 rollback()
关闭事务
start transaction ;#开始事务
update account set money=money-100 where name='A';
commit;#提交事务
```
@Test 不用new一个对象来调test方法可直接调用,只在方法上有效

    