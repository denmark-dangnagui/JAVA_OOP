package stream;

import java.util.Arrays;

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int sum = Arrays.stream(arr).sum();
        int count = (int)Arrays.stream(arr).count();

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);

        System.out.println(Arrays.stream(arr).reduce(0,(a,b)->a+b)); // 0 은 초기값!

    }
}
