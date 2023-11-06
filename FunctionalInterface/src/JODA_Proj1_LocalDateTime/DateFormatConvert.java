package JODA_Proj1_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatConvert {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String dateString = date.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy G"));
        System.out.println(dateString);
    }
}
