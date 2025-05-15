package java8interviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ConvertWords {

    public static void main(String[] args) {
        //Medium Level Questions
        //Write a java 8 program to sort an array and then convert the sorted array into Stream?

        List<String> str= Arrays.asList("Java","SpringBoot","Microservices","jakTra");
        str.stream().map(word->word.toUpperCase()).forEach(System.out::println);
    }
}
