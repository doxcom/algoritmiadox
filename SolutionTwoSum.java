import java.util.HashMap;
import java.util.Arrays;
class SolutionTwoSum {
    /*
    https://leetcode.com/problems/two-sum/
    */
    public static void main(String[] args) {

        int[] sumarray = { 2,7,11,15};
        twoSum(sumarray,9);

    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexStore = new HashMap<>();
      //int complement1;
        //[2,7,11,15] 9
      if(nums.length==2) return new int[]{0,1};

      for( int i=0; i<nums.length; i++) {
          int complement1 = target - nums[i];
          //9-2= 7 , 9-7=2
          if (indexStore.containsKey(complement1)) {
              return new int[]{indexStore.get(complement1), i};
          } else {
           indexStore.put(nums[i],i);
              //2,0  , 0
          }
      }
              
        return null;
    }



}


