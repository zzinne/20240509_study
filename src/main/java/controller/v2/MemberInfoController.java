package controller.v2;

import controller.v2.Controller;
import member.vo.MemberList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberInfoController implements Controller {
    @Override
    public MyView process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        return new MyView("/jstl/memberInfo.jsp");

    }
}
