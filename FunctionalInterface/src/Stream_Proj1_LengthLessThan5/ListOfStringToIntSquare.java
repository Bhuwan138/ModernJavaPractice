package Stream_Proj1_LengthLessThan5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfStringToIntSquare {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("1","2","4","5","6","1","3","4","8","7"));
        stringList.stream()
                .mapToInt(Integer::parseInt)
                .distinct()
                .map(n->n*n)
                .sorted()
                .forEach(System.out::println);
    }
}
