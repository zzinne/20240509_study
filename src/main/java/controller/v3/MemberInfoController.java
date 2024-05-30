package controller.v3;


import member.vo.Member;
import member.vo.MemberList;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.*;

public class MemberInfoController implements Controller {
    @Override
    public ModelView process(Map<String,String> param) {
        ModelView modelView = new ModelView("/jstl/memberInfo.jsp");
        modelView.setMemberList(MemberList.memberList);
        return modelView;

    }
}
