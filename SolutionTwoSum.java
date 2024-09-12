import java.util.HashMap;

class SolutionTwoSum {
    // https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {

        int[] sumarray = { 2, 7, 11, 15 };
        //3,2,4  target 6

        twoSum(sumarray,9);
        System.out.println(twoSum(sumarray, 9));
    }
   // 2, 7, 11, 15   target 9
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexStore = new HashMap<>();
      int numbCom1=-1;
      int numbCom2=-1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j <= 0; j--) {
                 i++;
                if(nums[i]==numbCom1){
                    indexStore.put(i,nums[i]);//[1,7]
                return new int[] {indexStore.get(target-numbCom1),indexStore.get(nums[i])};//[0,1]
                 //break;
                }else if(nums[i]<target && indexStore.get(nums[i])!=null){
                    indexStore.put(i,nums[i]);//[0,3]
                  numbCom1=target-nums[i]; //3

               }else if(nums[j]<target ){
                    indexStore.put(j,nums[j]);//[2,4]
                    numbCom2=target-nums[j];//2
                }else if(nums[j]==numbCom2){
                    indexStore.put(j,nums[j]);
                    return new int[]{indexStore.get(target-numbCom2),indexStore.get(nums[j])};
                   // break;
                }
            }
        }


        return nums;
    }
}
