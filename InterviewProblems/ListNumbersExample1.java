package InterviewProblems;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListNumbersExample1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //stream to filter even numbers

        List<Integer> evenNumbers = numbers.stream() //turns the list into a stream( a pipeline)
                                           .filter(n -> n % 2 ==0) //
                                           .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
