<%--
  Created by IntelliJ IDEA.
  User: ASUS-PC
  Date: 2019/10/16
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background-image:url("views/login.jpg");
        }
        label{
            display: inline-block;
            height: 20px;
            width: 60px;
        }
        .d1{
            width: 300px;
            margin: 150px auto;
        }
        .d2{
            margin-top: 10px;
           margin-bottom: 3px;
            margin-left:35px;
        }
        .d3{
            margin-top: 10px;
            margin-left: 100px;
        }
    </style>
</head>
<body>
<%
    String  name =   request.getParameter("name");
    request.setAttribute("name",name);
    if(name!=null){
%>
<h3>欢迎${name}小伙伴</h3>
<%
    }
%>
<div class="d1">
    <form action="login" method="post">
        <div class="d2">
            <label>用户名:</label><input type="text" name="name"/>
        </div>
        <div class="d2">
            <label>密码:</label><input type="password" name="password"/>
        </div>
        <div class="d3">
            <button type="submit">登录</button>
            <button type="reset">清空</button>
        </div>
    </form>
</div>
</body>
</html>
