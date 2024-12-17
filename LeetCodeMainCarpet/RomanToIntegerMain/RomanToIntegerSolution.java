package LeetCodeMainCarpet.RomanToIntegerMain;
import java.util.HashMap;
public class RomanToIntegerSolution {

    public static void main(String[] args) {

        int result= romanToInt("IV");

        System.out.println(result);
    }

    public static int romanToInt(String s) {

        //Key     Value
        HashMap<Character, Integer> romanToInt = new HashMap<>();

        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        //MMM CM XC IX  =3999
        /*
        * Input: s = "M C M X C I V"
        *             0 1 2 3 4 5 6
         Output: 1994
         Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
         *
         * 1000-100 + 1000= 1900 -10= 1890+90=1980
          */

        int suma =0;



        for(int i=0; i<s.length(); i++) {
   if(i>0 && romanToInt.get(s.charAt(i-1))<romanToInt.get(s.charAt(i))) {
       System.out.println("suma antes" + suma);
       suma = suma+romanToInt.get(s.charAt(i))- 2 * romanToInt.get(s.charAt(i-1));
       System.out.println("suma" + suma);
   }else{
       suma = suma+romanToInt.get(s.charAt(i));
   }


        }

        return  suma;
    }


}

