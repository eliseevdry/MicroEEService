<%@ page import="java.util.List" %>
<%@ page import="domain.University" %><%--
  Created by IntelliJ IDEA.
  User: Andrey_Eliseev
  Date: 02.06.2022
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jsp-representation</title>
    <h2>Today is </h2>
    <%= request.getAttribute("today").toString() %>
    <h2>It is university list: </h2>
    <%
        List<University> list = (List<University>) request.getAttribute("universities");
        for (University u : list) {
            out.print("<p>" + u.getUniversityName() + "</p>");
        }
    %>
</head>
<body>

</body>
</html>
