package telusko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2,4,6,8,1);

        // we can use it like this
        Stream<Integer> data = num.stream();
        data.forEach(e-> System.out.println(e));
        //or directly

        // count
        long count = num.stream().count();
        System.out.println(count);

        // sort
        List<Integer> sortedNum =  num.stream().sorted().collect(Collectors.toList());

        num.forEach(e -> System.out.println(e));

        System.out.println("Double");
        num.stream().map(e->e*2).forEach(e-> System.out.println(e));


        num.stream()
                .filter(e-> e>2)
                .sorted()
                .map(e->e*2)
                .forEach(e-> System.out.println(e));
    }

}
