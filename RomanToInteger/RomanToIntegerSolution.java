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

        String romano= "IV";
       //MMM CM XC IX  =3999
        /*
        * Input: s = "M C M X C I V"
         Output: 1994
         Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
         *
         * 1000-100 + 1000= 1900 -10= 1890+90=1980

 */

        int suma =0;
        int negative=0;


        for(int i=1;i<romano.length();i++) {

            if (romanToInt.get(romano.charAt(i))< romanToInt.get(romano.charAt(i-1))) {

               suma=suma-romanToInt.get(romano.charAt(i));
                System.out.println(suma);

            }else{
                suma+=romanToInt.get(romano.charAt(i));
                System.out.println("suma aqui "+suma);
            }

        }
        suma=suma+romanToInt.get(romano.charAt(0));


        System.out.println("Numero Romano es " +suma);
}

}

