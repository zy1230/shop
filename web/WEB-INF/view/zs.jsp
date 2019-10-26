<%--
  Created by IntelliJ IDEA.
  User: ASUS-PC
  Date: 2019/10/16
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/jqu/jquery.min.js"></script>
    <style>
        body{
            background-image: url("../../views/back1.jpg");
        }
        a{
            text-decoration: none;
        }
    </style>
</head>
<body>
<%
    String  name =   request.getParameter("name");
    request.setAttribute("name",name);
    if(name!=null){
%>
<h3>${name}小伙伴，最近又新上市了不少东西哟</h3>
<%
    }
%>
<br/>
<h4>水果栏</h4>
<ul>
    <li>
        <a class = "a1" href="${pageContext.request.contextPath}/detail?name=苹果" title="点击我跳转详情">苹果</a>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/addShop?name=苹果">添加到购物车</a>
    </li>
    <li>
        <a class = "a1" href="${pageContext.request.contextPath}/detail?name=香蕉" title="点击我跳转详情">香蕉</a>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/addShop?name=香蕉">添加到购物车</a>
    </li>
    <li>
        <a class = "a1" href="${pageContext.request.contextPath}/detail?name=桃子" title="点击我跳转详情">桃子</a>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/addShop?name=桃子">添加到购物车</a>
    </li>
    <li>
        <a class = "a1" href="${pageContext.request.contextPath}/detail?name=橘子" title="点击我跳转详情">橘子</a>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/addShop?name=橘子">添加到购物车</a>
    </li>
</ul>
</body>
</html>
