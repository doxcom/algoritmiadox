package InterviewProblems;

import java.util.*;
import java.util.stream.Collectors;

public class SortedStream {

    public static void main(String[] args) {
        List<Integer> unsor = Arrays.asList(1,1,0,1,0);

        List<Integer> sort = unsor.stream()
                                  .sorted()
                                  .collect(Collectors.toList());

        System.out.println("sorted: " +sort);
    }

}
