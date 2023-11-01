package FI_Proj6_Lambda_DiceRoller;

import java.util.Random;

@FunctionalInterface
interface DiceRoller{
    public int rollDice();
}
public class UseDiceRoller {
    public static void main(String[] args) {
        DiceRoller diceRoller = ()-> new Random().nextInt(1,7);
        System.out.println("Dice rolled and you got ::  " + diceRoller.rollDice());
    }
}
