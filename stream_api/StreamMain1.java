package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

    public static void main(String[] args) {
        //Q)Create a List and filter all the Even number from List

        List<Integer> list= List.of(2,4,7,9,23,7,45);
        List<Integer>list2=new ArrayList<>();
        list2.add(12);
        list2.add(9);
        list2.add(34);
        list2.add(7);
        list2.add(0);

        List<Integer> list3= Arrays.asList(23,780,34,12,34);

        //List1
        //without Stream

        //This is called BoilerPlate code
//        List<Integer>listEven=new ArrayList<>();
//        for(Integer i:list){
//            if(i%2==0){
//                listEven.add(i);
//            }
//        }
//        System.out.println(list);
//        System.out.println(listEven);

        //using stream api
       Stream<Integer> stream= list.stream();
//       List<Integer>newList= stream.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(newList);

       List<Integer>newEvenList= list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newEvenList);

        List<Integer> greater10=list.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println(greater10);
    }
}
