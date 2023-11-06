package FI_Proj12_Suppliers;

import java.util.Random;
import java.util.function.Supplier;

public class RamdomNumberGenerator {
    public static void main(String[] args) {
        Supplier<Integer> randomNum = () -> new Random().nextInt(10);
        for(int i = 0;i< 10;i++) System.out.println(randomNum.get());
    }
}
