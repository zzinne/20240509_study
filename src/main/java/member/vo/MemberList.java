package member.vo;

import java.util.ArrayList;
import java.util.List;

public class MemberList {
    public static List<Member> memberList = new ArrayList<Member>();

    static {memberList.add(new Member("ji",29));}
}
