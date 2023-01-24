package collection;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");
        // treeset을 쓰면 알아서 오름차순으로 정렬 됨.
        for (String str : treeSet) {
            System.out.println(str);
        }
    }
}
