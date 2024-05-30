package controller.v1;

import member.vo.Member;
import member.vo.MemberList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberSaveController implements Controller {
    @Override
    public void process(HttpServletRequest req, HttpServletResponse resp) {
        Member member = new Member();
        member.setName(req.getParameter("name"));
        member.setAge(Integer.parseInt(req.getParameter("age")));

        MemberList.memberList.add(member);


    }
}
