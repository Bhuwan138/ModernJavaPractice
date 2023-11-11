package org.example;
public class App
{
    public static void main( String[] args )
    {
        Employee employee = new Employee(101,"Bhuwan","Angular",98.2);
        System.out.println(employee);
        employee.setPercentage(100);
        System.out.println(employee);

    }
}
