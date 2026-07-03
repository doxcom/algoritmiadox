package InterviewProblems;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class FindFirstChar {

    public static Optional<Object> firstcharnr(String s){

        Map<Character,Integer> freq = new HashMap<>();

        //count all freq:
        for(char c : s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0) +1);
        }

        //find 1 with first
        for(char c : s.toCharArray()){
            if(freq.get(c) == 1) {
                return Optional.of(c);
            }
        }
      return Optional.empty();
    }



    public static void main(String[] args) {

        String word = "Swiss";
         firstcharnr("word: " + word);

    }
}
