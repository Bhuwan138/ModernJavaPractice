package FI_Proj10_Function;

import java.util.function.Function;

public class StringSequencer {
    public static void main(String[] args) {
        Function <String,String> sub = str -> str.substring(0,str.indexOf(" "));
        System.out.println("First name:: "+ sub.apply("Bhuwan Pandey"));
        System.out.println("First name:: "+ sub.apply("Ramesh Bhattrai"));
    }
}
