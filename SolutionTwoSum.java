import java.util.HashMap;

class SolutionTwoSum {
    // https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {

        int[] sumarray = { 2,7,11,15};
        twoSum(sumarray,9);
        System.out.println(twoSum(sumarray, 9));
    }
   
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexStore = new HashMap<>();
      int numbCom1=-1;
      int numbCom2=-1;
      int [] pos =new int[2];
        for (int i = 0; i <nums.length; i++) {
            for (int j<nums.lengthe-1; j>=0; j--){
              if(indexStore.size(2) && indexStore.get(numbCom1))
               if(nums[i]<target &&  nums[j]>target){
                  numbCom1=target-nums[i]; //
                  indexStore.put(nums[i],i);  //2,0
                     }else if(nums[j]<target && nums[i]>target){
                     numbCom2=target-nums[j];
                     indexStore.put(j,nums[j]); 
                      }                    
                 }
                }
            }
   //  System.out.println(pos[0]+","+pos[1]);
        return pos;

        }


    }
