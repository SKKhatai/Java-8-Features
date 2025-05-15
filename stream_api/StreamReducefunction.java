package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamReducefunction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int length=sc.nextInt();
        List<Integer> input=new ArrayList<>();
        for (int i = 0; i < length; i++) {
            input.add(sc.nextInt());
        }
        //searching even number using filter method
//        List<Integer> evenList=input.stream().filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(evenList);
        //searching even numbers using reduce method
        List<Integer>evenList2=input.stream().reduce(new ArrayList<Integer>(),(a,b)->{
           if(b%2==0) {
               a.add(b);
           }
           return a;
           },
            (l,b)->{
               l.addAll(b);
               return l ;

        });

        System.out.println(evenList2);
    }
}
