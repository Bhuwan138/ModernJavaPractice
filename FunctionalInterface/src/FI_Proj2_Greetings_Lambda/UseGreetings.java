package FI_Proj2_Greetings_Lambda;

import java.time.LocalDateTime;

public class UseGreetings {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        Greetings greetings = (username) ->{
            int hrs =  date.getHour(); // in 24hrs format
            if(hrs < 12)
                return "GoodMorning " + username;
            else if(hrs <16)
                return "GoodAfternoon " + username;
            else if(hrs <20)
                return "GoodEvening " + username;
            else
                return "GoodNight " + username;
        };

        System.out.println(greetings.greet("Bhuwan"));
    }
}
