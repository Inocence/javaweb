<%--
  Created by IntelliJ IDEA.
  User: innocence
  Date: 2019/5/21
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="javax.servlet.http.Cookie" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();
    if(null != cookies) {
        for (int i = 0; i < cookies.length; i ++) {
            response.getWriter().print(cookies[i].getName() + ":" + cookies[i].getValue() + "<br/>");
        }
    }
%>
</body>
</html>
