package java8interviewQuestions;

import java.util.*;

public class FindDuplicateElement {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(34,78,9,45,2,2,4,5,9,4,-6,0);

        Set<Integer> set = new HashSet<Integer>();
        list.stream().filter(num->!set.add(num)).forEach(System.out::println);

        //find out the max and min value in the list
        Optional<Integer>max=list.stream().max(Integer::compareTo);
        Optional<Integer>min=list.stream().min(Integer::compareTo);
        System.out.println("Max Value is :");
        System.out.println(max.orElse(null));
        System.out.println("Min Value is :");
        System.out.println(min.orElse(null));




    }
}
