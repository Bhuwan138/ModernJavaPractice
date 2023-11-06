package Stream_Proj1_LengthLessThan5;

import java.util.Arrays;

public class FirstThreeCapital {
    public static void main(String[] args) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        Arrays.stream(months)
                .map(month->month.substring(0,3))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
