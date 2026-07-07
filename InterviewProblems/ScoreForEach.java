package InterviewProblems;

public class ScoreForEach {

    public static int scoreit(int[] scores){

        int total = 0;
        //add up all scores

        for(int score : scores) {
            total += score;
        }

        double average = (double) total / scores.length;

        System.out.println("scores above average: " + average);

        for(int score: scores){
            if(score > average){
                System.out.println(score + " ");
            }
        }
        return total;
    }


    public static void main(String[] args) {

        int[] scores = {85, 92,78,90,88,76,95};
        scoreit(scores);

    }
}
