package Stream_Proj1_LengthLessThan5;

import java.util.Arrays;
import java.util.Objects;

class Employee{
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
public class FirstFirstBetween20To30 {
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
                .filter(e-> e.getAge() >=20 && e.getAge() < 30)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
