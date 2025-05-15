package java8interviewQuestions;

import java.util.stream.Stream;

public class ConcatTwoStream {

    public static void main(String[] args) {
        //Write a java8 program to concatenate two Stream.

        Stream<Integer> s1= Stream.of(2,3,4,7);
        Stream<Integer> s2= Stream.of(1,8,9);

        //Stream concat
        Stream.concat(s1,s2).forEach(System.out::println);

        //concat with sorted
        Stream.concat(s1,s2).sorted().forEach(System.out::println);



    }
}
