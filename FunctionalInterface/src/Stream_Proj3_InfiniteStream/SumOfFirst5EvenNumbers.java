package Stream_Proj3_InfiniteStream;

import java.util.stream.Stream;

public class SumOfFirst5EvenNumbers {
    public static void main(String[] args) {
        int sum = Stream.iterate(2,x->x+2)
                .limit(5)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

    }
}
