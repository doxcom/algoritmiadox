package InterviewProblems;
import java.util.*;
import java.util.stream.Collectors;

public class Stream2 {

    public static void main(String[] args) {

        List<Integer> listoriginal =  Arrays.asList(2, 3, 5, 105, 455, 35, 76, 98, 53, 7001, 4949, 9393, 645, 424);

        List<Integer> primenumbers = listoriginal.stream()
                                                 .filter(n -> {
                                                     if(n < 2) return false; //because 1 match with this condition only
                                                     for(int i=2; i * i <=n; i++){
                                                         if(n % i == 0) return false;
                                                     }
                                                     return true;
                                                 })
                                                .collect(Collectors.toList());

        System.out.println("prime numbers" + primenumbers);

    }
}
