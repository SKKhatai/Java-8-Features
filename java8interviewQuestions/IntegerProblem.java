package java8interviewQuestions;

import java.util.Arrays;
import java.util.List;

public class IntegerProblem {
    public static void main(String[] args) {
       // List<Integer> intList=new ArrayList<>();
        List<Integer> nums= Arrays.asList(10,45,5093,78,34,23,9,78,56,52);
        nums.stream().findFirst().ifPresent(System.out::println);
        System.out.println("Number of elements present in the list");
        System.out.println(nums.stream().count());
        //Find out all the Even and Odd numbers in the list

        System.out.println("all even Numbers");
        nums.stream().filter(num -> num%2==0).forEach(System.out::println);
        System.out.println("all odd Numbers");
        nums.stream().filter(num -> num%2!=0).forEach(System.out::println);

        //find the number which is starts with 5 or any number
        System.out.println("Numbers starts with 5");
        nums.stream().filter(num-> num.toString().startsWith("5")).forEach(System.out::println);

        //find Duplicate elements in the list using stream api
        System.out.println("Duplicate Elements are: ");


    }
}
