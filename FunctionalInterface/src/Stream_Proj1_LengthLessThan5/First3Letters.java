package Stream_Proj1_LengthLessThan5;

import java.util.Arrays;
import java.util.Comparator;

public class First3Letters {
    public static void main(String[] args) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        Arrays.stream(months)
                .map(full-> full.substring(0,3))
                .forEach(System.out::println);
    }
}
