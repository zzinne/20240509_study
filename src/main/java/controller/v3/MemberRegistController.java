package controller.v3;


import member.vo.MemberList;

import java.util.Map;

public class MemberRegistController implements Controller {
    @Override
    public ModelView process(Map<String,String> param) {
        return  new ModelView("/jstl/memberRegist.jsp");

    }
}
