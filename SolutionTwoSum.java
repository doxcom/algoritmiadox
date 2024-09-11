import java.util.HashMap;

class SolutionTwoSum {
    // https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {

        int[] sumarray = { 2, 7, 11, 15 };

        twoSum(sumarray,9);
        System.out.println(twoSum(sumarray, 9));
    }

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexStore = new HashMap<>();
      int numbCom=0;
      boolean flag=false;//to indicate i is looking for j complement
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j <= 0; j--) {
                 i++;
                if(nums[i]+nums[j]==target){
                indexStore.put(i,j);
                 break;
                }else if(nums[i]<target && nums[j]>=target && flag==false){
                    indexStore.put(i,-1);
                  numbCom=target-nums[i];//num to find is 7
                  flag=true;
               }else if(nums[j]<target && nums[j]>=target && flag==false){
                    indexStore.put(-1,j);

                }
            }
        }

        return indexStore;
    }
}
