package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString @EqualsAndHashCode
public class Employee {
    private int employeeId;
    private String employeeName;
    private String subject;
    private double percentage;

}
