package controller.v1;

import member.vo.MemberList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberInfoController implements Controller {
    @Override
    public void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String viewPath = "/member/memberInfo.jsp";

        RequestDispatcher dispatcher = req.getRequestDispatcher(viewPath);
        req.setAttribute("memberList",MemberList.memberList);
        dispatcher.forward(req, resp);
    }
}
