package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("이순신");
        set.add("호날두");
        set.add("메시");
        set.add("이순신");

        Iterator<String> ir = set.iterator();

        while (ir.hasNext()) {
            String next = ir.next();
            System.out.println(next);
        }
    }
}
