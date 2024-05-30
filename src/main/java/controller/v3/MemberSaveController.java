package controller.v3;

import controller.v3.Controller;
import member.vo.Member;
import member.vo.MemberList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class MemberSaveController implements Controller {

    @Override
    public ModelView process(Map<String, String> paramMap) {
        Member member = new Member();
        member.setName(paramMap.get("name"));
        member.setAge(Integer.parseInt(paramMap.get("age")));

        MemberList.memberList.add(member);
        ModelView modelView = new ModelView("/jstl/memberInfo.jsp");
        modelView.setMemberList(MemberList.memberList);
        return modelView;
    }
}
