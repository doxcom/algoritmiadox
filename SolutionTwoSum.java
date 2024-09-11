Java


class SolutionTwoSum {
    // https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {
<<<<<<< HEAD

        int[] sumarray = { 2, 7, 11, 15 };

        twoSum(sumarray,9);
=======
        int[] sumarray = { 2, 7, 11, 15 }; 
        System.out.println(twoSum(sumarray, 9));
>>>>>>> d3ba349941e403c8d559d7f8f3e4ea4320924f02
    }
    HashMap<Integer, Integer> indexStore = new HashMap<>();
    static int[] twoSum(int[] nums, int target) {
<<<<<<< HEAD

         for(int i=0; i<nums.length; i++){

         }


        return nums;
    }

=======
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
>>>>>>> d3ba349941e403c8d559d7f8f3e4ea4320924f02
    }
