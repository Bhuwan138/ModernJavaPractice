package FI_Proj10_Function;


import java.util.function.Function;

public class UseSquareRootApply {
    public static void main(String[] args) {
        Function<Integer,Double> function = n -> Math.sqrt(n);
        System.out.println("Sqrt of 8:: " + function.apply(8));
        System.out.println("Sqrt of 9:: " + function.apply(9));

    }
}
