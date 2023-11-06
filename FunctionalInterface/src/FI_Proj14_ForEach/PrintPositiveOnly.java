package FI_Proj14_ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PrintPositiveOnly {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>(Arrays.asList(-1,23,43,54,-13,3,53,-4));
        Predicate<Integer> predicate = n -> n>=0 ;
        mylist.forEach(integer -> {
            if(predicate.test(integer))
                System.out.println(integer);
        });
    }
}
