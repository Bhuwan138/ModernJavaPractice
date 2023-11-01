package FI_Proj8_Player_Lambda_Collections;

import java.util.*;

public class UsePlayer {
    public static void main(String[] args) {
        Player player1 = new Player(2,"Bhuwan",22);
        Player player2 = new Player(3,"Ram",27);
        Player player3 = new Player(3,"Rajesh",21);
        Player player4 = new Player(1,"Hari",28);

        List<Player> playerList = new ArrayList<>(Arrays.asList(player1,player2,player3,player4));
        System.out.println("Before Sorting:: ");
        for(Player p:playerList)
            System.out.println( p);

        playerList.sort((obj1, obj2) -> {
            if (obj1.getRanking() != obj2.getRanking()) {
                return obj1.getRanking() - obj2.getRanking();
            } else {
                int nameComparison = obj1.getName().compareTo(obj2.getName());
                if (nameComparison != 0) {
                    return nameComparison;
                } else {
                    return obj2.getAge() - obj1.getAge();
                }
            }
        });

        System.out.println("After Sorting:: ");
        for(Player p:playerList)
            System.out.println( p);

    }
}
