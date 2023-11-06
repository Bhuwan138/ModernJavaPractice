package FI_Proj11_Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Empl{
    private String name;
    private int projectDone;

    public Empl(String name, int projectDone) {
        this.name = name;
        this.projectDone = projectDone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProjectDone() {
        return projectDone;
    }

    public void setProjectDone(int projectDone) {
        this.projectDone = projectDone;
    }

    @Override
    public String toString() {
        return "Empl{" +
                "name='" + name + '\'' +
                ", projectDone=" + projectDone +
                '}';
    }
}
public class UseEmployee {
    public static void main(String[] args) {
        List<Empl> empList= Arrays.asList(
                new Empl("Sumit",4),
                new Empl("Vikas",8),
                new Empl("Deepak",2),
                new Empl("Ankit",6),
                new Empl("Arjun",1),
                new Empl("Rakesh",0));
        Predicate<Empl> emplPredicate = empl -> empl.getProjectDone() >= 2;
        Consumer<Empl> emplConsumer = (empl) -> {
            if(emplPredicate.test(empl))
                System.out.println(empl);
        };

        for(Empl e: empList){
            emplConsumer.accept(e);
        }

    }
}
