import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {


        HashMap<Integer, String> hashMapVariable = new HashMap<>();

        hashMapVariable.put(1,"one");

        System.out.println(hashMapVariable.get(1));
      //de puros integer
        HashMap<Integer, Integer> hashStore = new HashMap<>();

        hashStore.put(2,2);
        System.out.println(hashStore.get(2));

    }
}
