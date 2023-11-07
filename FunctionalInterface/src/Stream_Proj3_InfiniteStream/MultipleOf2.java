package Stream_Proj3_InfiniteStream;

import java.util.stream.Stream;

public class MultipleOf2 {
    public static void main(String[] args) {
        Stream.iterate(2,x->x*2)
                .limit(10)
                .forEach(System.out::println);
    }
}
