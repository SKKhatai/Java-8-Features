package stream_api;

import java.util.Objects;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //StreamApi->Collection Process
        //collection/group of object
        //1-empty/blank
        Stream<Objects> emptyStream =Stream.empty();

        //2-Array,Object,Collection
        String names[]={"rohan","rohit","Divya","Kohli"};
        //creating Object using of method
        Stream<String> stream1=Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });
        //3-Using StreamBuilder
        Stream<Object> streambuilder=Stream.builder().build();


        //
        

    }
}
