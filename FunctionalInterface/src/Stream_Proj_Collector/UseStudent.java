package Stream_Proj_Collector;


import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

class Student{
    private String name;
    private Integer id;
    private String subject;
    private double percentage;

    public Student() {
    }

    public Student(String name, Integer id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", subject='" + subject + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Double.compare(percentage, student.percentage) == 0 && Objects.equals(name, student.name) && Objects.equals(id, student.id) && Objects.equals(subject, student.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, subject, percentage);
    }
}

public class UseStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Paul", 11, "Economics", 78.9));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Student("Harish", 13, "History", 83.7));
        studentList.add(new Student("Xiano", 14, "Literature", 71.5));
        studentList.add(new Student("Soumya", 15, "Economics", 77.5));
        studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
        studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
        studentList.add(new Student("Mitshu", 18, "History", 73.5));
        studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
        studentList.add(new Student("Harry", 20, "History", 71.9));

        List<Student> top3PerformingStudent = studentList.stream()
                .sorted((a,b)-> (int) (b.getPercentage()- a.getPercentage()))
                .limit(3)
                .toList();
//        top3PerformingStudent.forEach(System.out::println);

        Set<String> subjectOffered = studentList.stream()
                .map(Student::getSubject)
                .collect(Collectors.toSet());
//        subjectOffered.forEach(System.out::println);

        Map<String,Double> allStudentNamePercentage = studentList.stream()
                .collect(Collectors.toMap(Student::getName,Student::getPercentage));
//        allStudentNamePercentage.forEach((key,value)-> System.out.println(key+","+ value));

        Optional<Double> highestPercentage =  studentList.stream().
                map(Student::getPercentage)
                .max(Double::compareTo);
//        System.out.println(highestPercentage);
        double total = studentList.stream().mapToDouble(Student::getPercentage).sum();
        OptionalDouble averaged = studentList.stream().mapToDouble(Student::getPercentage).average();
//        System.out.println(total);
//        System.out.println(averaged);
        Map<String,List<Student>> studentEnrolledInParticularSubject= studentList.stream()
                .collect(Collectors.groupingBy(Student::getSubject));
        studentEnrolledInParticularSubject.
                forEach((k,v)-> System.out.println(k + " -> " + v
                        .stream()
                        .map(Student::getName)
                        .collect(Collectors.joining(","))));

    }
}
