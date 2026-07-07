package InterviewProblems;

import java.util.*;
import java.util.stream.Collectors;

public class SortedStream {

    public static void main(String[] args) {
        List<Integer> unsor = Arrays.asList(53, 5, 5, 105, 455, 35, 76, 98, 2, 7001,4, 4949, 9393, 645, 424);

        List<Integer> sort = unsor.stream()
                                  .sorted()
                                  .collect(Collectors.toList());

        System.out.println("sorted: " +sort);
    }

}
