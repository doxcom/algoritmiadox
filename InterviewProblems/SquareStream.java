package InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareStream {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int numbersquare = numbers.stream()
                                            .map(n -> n * n) //Transforms each item
                                            .reduce(0,(a,b) -> a + b); //it does make the sum from first element
                                                                              //to last element

        System.out.println(numbersquare);

    }
}
