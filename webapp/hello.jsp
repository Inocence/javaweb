<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: innocence
  Date: 2019/5/21
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*, javax.servlet.http.Cookie,bean.Hero" isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

Hello,JSP
<%
    String name = "111";
    Hero hero = new Hero();
    hero.setHp(100);
    hero.setName("概论");
    request.setAttribute("hero", hero);
%>
<%--<c:set var="name" value="${'aaaa'}" scope="request"/>--%>
name is ${hero.name}
<a href="cookie.jsp">cookie.jsp</a>
<a href="session.jsp">session.jsp</a>

</body>
</html>
