package Stream_Proj1_LengthLessThan5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfStringToInt_Sum_Average {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("1","2","4","5","6","1","3","4","8","7"));
        int sum = stringList.stream()
                .mapToInt(Integer::parseInt)
                .distinct()
                .sum();
        double average = stringList.stream()
                .mapToInt(Integer::parseInt)
                .distinct()
                .average()
                .getAsDouble();
        System.out.println("Sum of elements is:: "+ sum);
        System.out.println("Average of elements is:: "+ average);
    }
}
