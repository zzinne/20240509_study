package member.servlet;


import member.vo.Member;
import member.vo.MemberList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RetrieveMemServlet" , urlPatterns = "/retrieveMember")
public class RetrieveMemServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<table>\n" +
                "    <thead>\n" +
                "        <tr><td>이름</td><td>나이</td></tr>\n" +
                "    </thead>\n" +
                "    <tbody>\n" ;
        for (int i = 0; i < MemberList.memberList.size(); i++) {
            Member member = MemberList.memberList.get(i);
            html = html +
                    "        <tr>" +
                    "<td>" + member.getName()+"</td>"+"<td>"+member.getAge()+"</td> </tr>\n" ;
        }
                html = html+
                "    </tbody>\n" +
                "</table>" +
                "<button onclick=\"location.href='/regist'\">등록</button>\n" +
                "</body>\n" +
                "</html>";
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(html);
    }
}
