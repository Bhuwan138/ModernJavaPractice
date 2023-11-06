package FI_Proj14_ForEach;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyEvenOnly {
    public static void main(String[] args) {
        List<Integer> evenOnly = new ArrayList<>();
        List<Integer> mynums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        mynums.forEach(n -> {
            if(n%2==0) evenOnly.add(n);
        });
       evenOnly.forEach(System.out::println);
    }
}
