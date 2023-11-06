package FI_Proj14_ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParelleStreamDemo {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        mylist.parallelStream().forEach(System.out::println);
    }
}
