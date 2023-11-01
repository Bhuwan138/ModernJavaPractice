package FI_Proj4_Lambda_ReverseString;
@FunctionalInterface
interface ReverseString{
    String reverse(String name);
}
public class UseReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = (username) -> {
            return new  StringBuffer(username).reverse().toString();
        };

        System.out.println("Reverse of name is:: "+ reverseString.reverse("Bhuwan"));
    }
}
