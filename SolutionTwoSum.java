import java.util.HashMap;

class SolutionTwoSum {
    // https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {

        int[] sumarray = { 2,1,7,11,15};
        twoSum(sumarray,9);
        System.out.println(twoSum(sumarray, 9));
    }
   
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexStore = new HashMap<>();
      int numbCom1=Integer.MIN_VALUE;
      int numbCom2=Integer.MIN_VALUE;
      
      int [] pos =new int[2];
      
      
      int i,j;
      for( i=0,j =nums.length-1; i>=j; i++,j--) {
    	  
    	  if(nums[i]+nums[j]==target){
              pos[0]=i;
              pos[1]=j;
              break;
              
              //check for(j=1; j!=i && j<n; j++)
          }
       
      }
              
        return pos;
    }

}


