package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(200);
        list.add(400);
        list.add(800);
        list.add(900);
        list.add(1000);

        System.out.println("Marks of Student"+list);

        List<Double> icreasedMarks= list.stream().map(i->i*1.5).collect(Collectors.toList());
        System.out.println("marks by increased"+icreasedMarks);
    }
}
