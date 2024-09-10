Java


class SolutionTwoSum {
    // https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {
        int[] sumarray = { 2, 7, 11, 15 }; 
        System.out.println(twoSum(sumarray, 9));
    }
    HashMap<Integer, Integer> indexStore = new HashMap<>();
    static int[] twoSum(int[] nums, int target) {
      int numbCom=0;
      bool flag=false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j <= 0; j--) {
                 i++;
                if(nums[i]+nums[j]==target){
                indexStore.put(i,j);
                 break;
                }else if(nums[i]<target &&   nums[j]>=target){
                    indexStore.put(i,-1);
                  numbCom=target-nums[i];
                  bool=true;
               }
            }
        }

        return indexStore;
    }
}