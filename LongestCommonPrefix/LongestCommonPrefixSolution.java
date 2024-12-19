package LongestCommonPrefix;

public class LongestCommonPrefixSolution {


    public static void main(String[] args) {
        LongestCommonPrefixSolution lcps = new LongestCommonPrefixSolution();
        String[] str = {"flower", "flow", "flight"};
        lcps.longestCommonPrefix(str);
    }

    public String longestCommonPrefix(String[] strs) {

        int count=0;
        char[] prefix=new char[strs.length];


        for (int i = 0; i < strs.length; i++) {
            int j=0;
            prefix= new char[]{strs[i].charAt(j)};

        }


        prefix.toArrayString;
        return prefix;
    }
}
