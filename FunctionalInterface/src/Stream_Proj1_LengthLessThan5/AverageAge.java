package Stream_Proj1_LengthLessThan5;

import java.util.Arrays;

public class AverageAge {
    public static void main(String[] args) {
        Employee[] staffs = {
                new Employee("Ram",45),
                new Employee("Shyam",32),
                new Employee("Hari",28),
                new Employee("Gita",22),
                new Employee("Sita",25),
                new Employee("Ramesh",18)
        };

         Arrays.stream(staffs)
                .mapToInt(Employee::getAge)
                .average()
                .ifPresent(System.out::println);
    }
}
