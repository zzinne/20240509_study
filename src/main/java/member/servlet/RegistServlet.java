package member.servlet;

import member.vo.Member;
import member.vo.MemberList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegistServlet" , urlPatterns = "/regist")
public class RegistServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"/registMember\" >\n" +
                "<table>\n" +
                "    <tbody>\n" +
                "    <tr><td> 이름 </td> <td> <input type=\"text\" name = \"name\"/> </td></tr>\n" +
                "    <tr><td> 나이 </td> <td> <input type=\"text\" name = \"age\"/> </td></tr>\n" +
                "\n" +
                "    </tbody>\n" +
                "</table>\n" +
                "<input type=\"submit\" >저장</input>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(html);
    }
}
