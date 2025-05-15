package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<String> companyList= new ArrayList<>();

        companyList.add("Google");
        companyList.add("Microsoft");
        companyList.add("Amazon");
        companyList.add("OLA");

//       List<String>sortedList= companyList.stream().sorted().collect(Collectors.toList());
//
//        System.out.println(sortedList);

        companyList.stream().sorted().forEach(
                System.out::println
        );

    }
}
