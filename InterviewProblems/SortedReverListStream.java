package InterviewProblems;

import java.util.*;
import java.util.stream.Collectors;

public class SortedReverListStream {

    public static void main(String[] args) {

        List<Integer> unso = Arrays.asList(53, 5, 5, 105, 455, 35, 76, 98, 2, 7001,4, 4949, 9393, 645, 424);

        List<Integer> sortDes = unso.stream()
                                    .sorted(Comparator.reverseOrder())
                                    .collect(Collectors.toList());

        System.out.println("Descending "+ sortDes);


    }
}
