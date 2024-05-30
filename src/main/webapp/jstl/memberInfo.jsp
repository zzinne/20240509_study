<%@ page import="java.util.List" %>
<%@ page import="member.vo.Member" %><%--
  Created by IntelliJ IDEA.
  User: JJI
  Date: 2024-05-16
  Time: 오후 6:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    List<Member> members = (List<Member>) request.getAttribute("members");

%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <form action="/front-controller/member3/delete">
    <c:forEach var= "member" items="${members}">

        <tr>
            <td>
                name = ${member.name}
                <input type="hidden" name="name" value="${member.name}">
            </td>
            <td>
                age = ${member.age}
                <input type="hidden" name="age" value="${member.age}">

            </td>
            <td>
                <input type="submit" value="삭제">
            </td>
        </tr>
    </c:forEach>
    </form>
</table>
<button onclick="location='/front-controller/member3/regist'">등록</button>
</body>
</html>
