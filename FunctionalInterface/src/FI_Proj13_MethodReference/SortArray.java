package FI_Proj13_MethodReference;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        String[] sports = {"Football","Cricket","Volleyball","Kabbadi","Table Tenis"};
        Arrays.sort(sports,String::compareTo);
        System.out.println(Arrays.toString(sports));
    }
}
