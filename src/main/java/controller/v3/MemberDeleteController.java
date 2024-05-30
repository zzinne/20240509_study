package controller.v3;

import member.vo.Member;
import member.vo.MemberList;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class MemberDeleteController implements Controller {

    @Override
    public ModelView process(Map<String, String> paramMap) {
        Iterator<Member> iterator = MemberList.memberList.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next().getName();
            if (paramMap.get("name").equals(str)) {
                iterator.remove();
            }
        }
//        MemberList.memberList.forEach(
//                member -> {
//                    if(paramMap.get("name").equals(member.getName())) {
//                        MemberList.memberList.remove(member);
//                    }
//                }
//        );
        ModelView modelView = new ModelView("/jstl/memberInfo.jsp");
        modelView.setMemberList((List<Member>) iterator);
        return modelView;
    }
}
