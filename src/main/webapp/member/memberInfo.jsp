<%--
  Created by IntelliJ IDEA.
  User: JJI
  Date: 2024-05-09
  Time: 오후 7:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="member.vo.MemberList" %>
<%@ page import="member.vo.Member" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tbody>
            <% for(Member member:MemberList.memberList) { %>
            <tr>
                <td><%= member.name%></td>
                <td><%= member.age%></td>
            </tr>
                <% }%>
        </tbody>
    </table>
</body>
</html>
