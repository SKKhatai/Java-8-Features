package java8interviewQuestions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        //print Current Date and time using java 8

        LocalDateTime localDateTime= LocalDateTime.now();

        System.out.println(localDateTime);
        //Print the date in "dd-MM-YYYY" format

        System.out.print("dd-mm-yyyy :");
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println(format.format(localDateTime));
    }
}
