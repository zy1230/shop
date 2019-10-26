<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="object.Fruit" %><%--
  Created by IntelliJ IDEA.
  User: ASUS-PC
  Date: 2019/10/16
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="${pageContext.request.contextPath}/jqu/jquery.min.js"></script>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background-image: url("../../views/back1.jpg");
        }
    </style>
</head>
<body>
<h3>你的购物车：</h3>
      <div>
          <%
              List<String> list = (List<String>)session.getAttribute("list");
              Iterator<String> iterator = list.iterator();
              while (iterator.hasNext()){
                  String a = iterator.next();
          %>
          <ul>
              <li>
                  <%
                  out.print(a);
                  session.setAttribute("name",a);
                  %>
                  <a href="${pageContext.request.contextPath}/delete?name=${name}">移除</a>
              </li>
          </ul>
          <%
              }
          %>
      </div>
<button onclick="go1()">返回列表</button>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button onclick="go()">移除后点击返回列表</button>
<script>
    function go(){
        window.history.go(-2);
    }
    function go1() {
        window.history.go(-1);

    }
</script>

</body>
</html>
