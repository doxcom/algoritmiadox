package RomanToInteger;

import java.util.HashMap;

public class RomanToIntegerSolution {



    public static void main(String[] args) {
                //Key     Value
        HashMap<Character, Integer> romanToInt = new HashMap<>();
        //I, V, X, L, C, D, M, "III" 'I'
        // I String de valor 1
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        String roman= "MMMVIII";

        String romano="IV"; //String es una cadena de letras, es una cadena de caracteres
        String romanoB= "XIV";
        String nombre= "Julian";
        char nombreCorto = 'J';


        int suma =0;

        for(int i=0;i<romano.length();i++){

            if()
            char caracter = romano.charAt(i);
            suma=suma+romanToInt.get(caracter);


    }


        System.out.println("Numero Romano es " +suma);
}

}

