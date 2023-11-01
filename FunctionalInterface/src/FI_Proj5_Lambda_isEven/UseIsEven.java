package FI_Proj5_Lambda_isEven;
@FunctionalInterface
interface  NumText{
    public boolean isEven(int num);
}
public class UseIsEven {
    public static void main(String[] args) {
        NumText num = (numb) -> (numb & 1) == 0 ? true : false;
        System.out.println(num.isEven(998));
    }
}
