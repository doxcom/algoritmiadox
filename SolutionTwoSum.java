class SolutionTwoSum {
    // https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {
        int[] sumarray = { 2, 7, 11, 15 }; 
        System.out.println(twoSum(sumarray, 9));
    }
    HashMap<Integer, Integer> indexStore = new HashMap<>();
    static int[] twoSum(int[] nums, int target) {
      
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j <= 0; j--) {
                 i++;
                if(nums[i]+nums[j]==target){
                indexStore.put(i,j);
                 break;
                }else if(){
               }
            }
        }

        return indexStore;
    }
}