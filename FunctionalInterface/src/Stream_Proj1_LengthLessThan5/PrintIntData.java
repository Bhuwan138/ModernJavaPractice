package Stream_Proj1_LengthLessThan5;

import java.util.Arrays;
import java.util.stream.Stream;

public class PrintIntData {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        char[] chars = {'A','B','C'};
        Arrays.stream(arr).forEach(System.out::println);
        String.valueOf(chars).chars().forEach(c-> System.out.println((char)c));
    }
}
