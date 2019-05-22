<%--
  Created by IntelliJ IDEA.
  User: innocence
  Date: 2019/5/22
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String user = (String) session.getAttribute("user");
    application.setAttribute("test", 1);
%>
pageContext:<%=pageContext.getAttribute("page")%>
session中的user: <%=user%>
</body>
</html>
