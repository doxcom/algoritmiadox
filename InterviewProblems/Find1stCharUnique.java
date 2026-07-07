package InterviewProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Find1stCharUnique {

    public static Optional<Character> findChar(String s){

        Map<Character, Integer> freq = new HashMap<>();
        //turn s into lowcase
        String lowcase = s.toLowerCase();
        //find the frequencies
        for(char c: lowcase.toCharArray()){
         if(freq.containsKey(c)){
             freq.put(c, freq.get(c)+1);
         }else{
             freq.put(c,1);
         }
        }

        //find the first match
        for(char c: lowcase.toCharArray()){
            if(freq.get(c) == 1){
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        String word = "aAbBABac";
        Optional<Character> result = findChar(word);

        if(result.isPresent()){
            System.out.println("'"+ result.get() + "'");
        }else{
            System.out.println("empty");
        }
    }
}
