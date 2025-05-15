package java8interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListProgram {
    public static void main(String[] args) {
        //Q:How to check if list is empty in java 8 using Optional Class if not null iterate through the list and print the object?

        List <String> list= Arrays.asList("Hello","HIi");
        Optional<List<String>> optionalList= Optional.ofNullable(list);
        optionalList.ifPresentOrElse(i->i.stream().forEach(System.out::println),()->System.out.println("The list is empty"));


    }
}
