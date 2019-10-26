<%--
  Created by IntelliJ IDEA.
  User: ASUS-PC
  Date: 2019/10/16
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="${pageContext.request.contextPath}/jqu/jquery.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>点击添加：<a href="/addShop?name=${fruit.name}&price=${fruit.price}">${fruit.name}</a></h4>
<img src="${fruit.photo}" style="width: 300px;height: 300px"/>
<h4>价格:<span>${fruit.price}</span>元/斤</h4>
<button onclick="go()">返回</button>
<script>
    function go(){
        window.history.go(-1);
    }
</script>
</body>
</html>
