package java8interviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortTheList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(78);
        list.add(90);
        list.add(89);
        list.add(23);
        list.add(198);
        list.add(9);

        System.out.println("Sort the list in ascending order:");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("sorting the list in descending order");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
