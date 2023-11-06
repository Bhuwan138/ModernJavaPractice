package Stream_Proj1_LengthLessThan5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LessThan5 {
    public static void main(String[] args) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        Arrays.stream(months)
                .filter(month -> month.length()<=5)
                .sorted(Comparator
                        .comparingInt(String::length)
                        .reversed()
                        .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }
}
