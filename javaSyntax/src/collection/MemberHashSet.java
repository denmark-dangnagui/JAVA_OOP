package collection;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = hashSet.iterator();
        while (ir.hasNext()){
            Member next = ir.next();
            if (memberId == next.getMemberId()) {
                hashSet.remove(next);
                return true;
            }
        }
        System.out.println("존재 안함");
        return false;
    }

}
