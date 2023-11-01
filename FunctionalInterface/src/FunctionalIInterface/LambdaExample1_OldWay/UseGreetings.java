package FunctionalIInterface.LambdaExample1_OldWay;

public class UseGreetings {
    public static void main(String[] args) {
        GreetingImpl greeting = new GreetingImpl();
        System.out.println(greeting.greet("Bhuwan"));
    }
}
