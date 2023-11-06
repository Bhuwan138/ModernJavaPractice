package FI_Proj11_Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DoubleNumber {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Consumer<List<Integer>> listConsumerA = num -> {
            for(Integer i: num) System.out.print((i*2) + " ");
            System.out.println(" ");
        };
        listConsumerA.accept(integerList);
    }
}
