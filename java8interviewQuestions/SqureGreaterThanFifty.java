package java8interviewQuestions;

import java.util.Arrays;

public class SqureGreaterThanFifty {
    public static void main(String[] args) {
        int[] arr={10,34,78,23,12,90,4,5};

        Arrays.stream(arr).map(num->num*num).filter(num->num>50).forEach(System.out::println);

        //Write a java 8 program to sort an array and then convert the sorted array into Stream;

        Arrays.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);


    }
}
