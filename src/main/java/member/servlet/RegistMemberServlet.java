package member.servlet;

import member.vo.Member;
import member.vo.MemberList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegistMemberServlet" , urlPatterns = "/registMember")
public class RegistMemberServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Member member = new Member();
        member.setName(req.getParameter("name"));
        member.setAge(Integer.parseInt(req.getParameter("age")));

        MemberList.memberList.add(member);

        resp.sendRedirect("/retrieveMember");
    }
}
