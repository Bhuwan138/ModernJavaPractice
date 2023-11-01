package FunctionalIInterface.LambdaExample1_OldWay;

import java.time.LocalDateTime;

public class GreetingImpl implements Greetings{
    private LocalDateTime date = LocalDateTime.now();
    @Override
    public String greet(String username) {
        int hrs =  date.getHour(); // in 24hrs format
        if(hrs < 12)
            return "GoodMorning " + username;
        else if(hrs <16)
            return "GoodAfternoon " + username;
        else if(hrs <20)
            return "GoodEvening " + username;
        else
            return "GoodNight " + username;
    }
}
