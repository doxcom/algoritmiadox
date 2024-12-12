package RomanToInteger;

import java.util.HashMap;

public class RomanToIntegerSolution {



    public static void main(String[] args) {
                //Key     Value
        HashMap<Character, Integer> romanToInt = new HashMap<>();

        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        String romano= "MMMMXVIII";

        /*
        * Input: s = "MCMXCIV"
         Output: 1994
         Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
         *
         * 1000-100 + 1000= 1900 -10= 1890+90=1980

 */

        int suma =0;
        char caracter;

        for(int i=0;i<romano.length();i++) {

            if (romano.length()%2!=0) {


             //   caracter = romano.charAt(i);
              //  suma=suma+romanToInt.get(caracter)-romanToInt.get(romano.charAt(i-1));

            }




        }


        System.out.println("Numero Romano es " +suma);
}

}

