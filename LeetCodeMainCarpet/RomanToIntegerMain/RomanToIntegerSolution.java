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



        for(int i=s.length()-1;i>0;i--) {

            if(romanToInt.get(s.charAt(i)) > romanToInt.get(s.charAt(i-1))) {
                //suma=0+5-1=4  i=6
                //i=4,suma= 4+ 100-10 =94
                //i=2,suma=94 +(1000-100=900)=994
                //i=0,

                suma=suma+(romanToInt.get(s.charAt(i))-romanToInt.get(s.charAt(i-1)));
                i--;  //i--, i=5
                //i--, i=3
                //i--, i=1
            }else{
                suma=suma+romanToInt.get(s.charAt(i));
            }

        }

        suma=suma+romanToInt.get(s.charAt(0));

        return  suma ;
    }


}

