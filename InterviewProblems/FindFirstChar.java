package InterviewProblems;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class FindFirstChar {

    public static Optional<Character> FindChar(String s){

        Map<Character,Integer> freq = new HashMap<>();
        String tolower = s.toLowerCase();
        //counting frequencies
        for(char c: tolower.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        //match first no repetitive char
        for(char c: tolower.toCharArray()){
            if(freq.get(c)==1){ //first match fetch 1
                return Optional.of(c);
            }
        }
    return Optional.empty();
    }

    public static void main(String[] args) {

        String word = "aAbBABac";
        Optional<Character> result = FindChar(word);

         if(result.isPresent()){
             System.out.println("'"+ result.get() +"'");
         }else{
             System.out.println("empty");
         }

    }
}
