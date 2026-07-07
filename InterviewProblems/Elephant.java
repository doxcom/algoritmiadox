package InterviewProblems;

public class Elephant {


    public static int count(String s){
        int vowelCount =0;
        for(char letter : s.toCharArray()){
            if(letter =='a' || letter == 'e'){
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        System.out.println("Vowels :" + count("elephant") );
    }
}
