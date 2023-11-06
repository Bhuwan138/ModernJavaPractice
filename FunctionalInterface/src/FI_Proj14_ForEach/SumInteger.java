package FI_Proj14_ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SumInteger {
    static int sum;
    public static void main(String[] args) {
        List<Integer> mynums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        mynums.forEach( n-> sum+=n);
        System.out.println("Sum:: " + sum);
    }
}
