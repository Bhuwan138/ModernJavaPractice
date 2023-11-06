package FI_Proj10_Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    private String name;
    private int projectDone;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int projectDone, double salary) {
        this.name = name;
        this.projectDone = projectDone;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", projectDone=" + projectDone +
                ", salary=" + salary +
                '}';
    }
}

public class UseEmployee{
    public static void main(String[] args) {
        List<Employee> empList= Arrays.asList(
                new Employee("Sumit",4,50000.0),
                new Employee("Vikas",8,150000.0),
                new Employee("Deepak",2,40000.0),
                new Employee("Ankit",6,100000.0),
                new Employee("Arjun",1,20000.0),
                new Employee("Rakesh",0,10000.0));
        Function<Employee,Character> employeeFunction = emp -> {
            Character ch;
            ch = emp.getProjectDone() > 5 ? 'A' :
                    emp.getProjectDone() >= 3 ? 'B' :
                            emp.getProjectDone() > 0 ? 'C' : 'D';
            return ch;
        };
        Predicate<Character> predicate = grade -> grade =='A' || grade == 'B';

        process(empList,employeeFunction,predicate);
    }

    private static void process(List<Employee> empList, Function<Employee, Character> employeeFunction, Predicate<Character> predicate) {
        for(Employee e: empList){
            System.out.print("Employe Name: " + e.getName());
            System.out.print(", Salary: " + e.getSalary());
            Character grade = employeeFunction.apply(e);
            System.out.print(", Grade: " + grade);
            if(predicate.test(grade)){
                e.setSalary(e.getSalary() + e.getSalary()*0.10);
                System.out.print(", New Salary : " + e.getSalary());
            }
            System.out.println(" ");

        }
    }
}
