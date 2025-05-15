package java8interviewQuestions;

import java.util.Random;
import java.util.stream.Stream;

public class PrintTenRandomNumber {
    public static void main(String[] args) {
        Random rNum= new Random();
        Stream.generate(rNum::nextInt).limit(5).forEach(System.out::println);
        Stream.generate(rNum::nextBoolean).limit(10).forEach(System.out::println);
    }
}
