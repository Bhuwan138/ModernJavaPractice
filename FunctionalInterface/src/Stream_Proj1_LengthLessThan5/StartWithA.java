package Stream_Proj1_LengthLessThan5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

public class StartWithA {
    public static void main(String[] args) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        Set<String> monthSet = Arrays.stream(months)
                .filter(month -> month.startsWith("A"))
                .collect(Collectors.toSet());
        System.out.println(monthSet);
    }
}
