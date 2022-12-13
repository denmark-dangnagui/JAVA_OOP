package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("tom");
        sList.add("edward");
        sList.add("david");
        sList.add("christiano");

        // 스트림을 컬렉션으로부터 객체를 만들려면 이렇게
        Stream<String> stream =sList.stream();
        stream.forEach(s -> System.out.println("s = " + s));
        System.out.println();

        sList.parallelStream().sorted().forEach(s-> System.out.println("s = " + s));
        System.out.println();

        sList.stream().map(s->s.length()).forEach(n-> System.out.println("n = " + n));
        System.out.println();

    }
}
