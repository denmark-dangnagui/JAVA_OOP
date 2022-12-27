package array;

import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        for (String s : list) {
            System.out.println("s = " + s);
        }
    }
}
