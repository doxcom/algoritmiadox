import java.util.HashMap;

class SolutionTwoSum {
    // https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {

        int[] sumarray = { 3, 3 };
        //3,2,4  target 6

        twoSum(sumarray,6);
        System.out.println(twoSum(sumarray, 9));
    }
   // 2, 7, 11, 15   target 9+
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexStore = new HashMap<>();
      int numbCom1=-1;
      int numbCom2=-1;
      int [] pos =new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j >= 0; j--) {
              //   i++;
                 if(nums[i]+nums[j]==target){
                     pos= new int[]{i,j};

                     System.out.println("position "+ pos[i]+","+pos[j]);
                   //  return pos;
                 }
                }
            }

      //  System.out.println(pos[0]+","+pos[1]);
        return pos;

        }


    }

