package leetcodeproblems;

public class ValidPalindrome {
//https://leetcode.com/problems/valid-palindrome/?envType=study-plan-v2&envId=top-interview-150
    public boolean isPalindrome(String s){

        if(s==" ") return true;
  //usar regex pattern
        String s2=s.toLowerCase().replace(" ","");
        System.out.println("palindromo sin espacios : " + s2);
        for(int i=0,j=s2.length()-1; i<j ; i++,j--){
            if(s2.charAt(i) != s2.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){

        System.out.println(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }
}
