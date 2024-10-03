import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intList.stream();
        intList.stream()
                .filter(x -> (x > 0) && (x % 2 == 0))
                .sorted()
                .forEach(System.out::println);

    }
}