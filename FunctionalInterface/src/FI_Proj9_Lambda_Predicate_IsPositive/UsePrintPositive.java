package FI_Proj9_Lambda_Predicate_IsPositive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UsePrintPositive {
    public static void main(String[] args) {
        Predicate<Integer> num = n -> n>= 0;
        List<Integer> numberList = new ArrayList<>(Arrays.asList(12,14,-4,-53,-53,23,5,-50));

        for (Integer n : numberList) {
            if(num.test(n)) System.out.println(n);
        }
    }
}
