package InterviewProblems;

public class LongestName {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Helena", "Polo", "Hernando","Diluvio", "zoe"};

        String longname = "";

        for(String name: names){
            if(name.length() > longname.length()){
                longname = name;
            }
        }

        System.out.println("longname is " + longname);
    }
    
}
