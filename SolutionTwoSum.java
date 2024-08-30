
class SolutionTwoSum {
    // https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {

        int[] sumarray = { 2, 7, 11, 15 };

        System.out.println(twoSum(sumarray, 9));
    }

    static int[] twoSum(int[] nums, int target) {
        int acumA = 0;
        int acumB = 0;
        int ntf = 0;
        int[] indice = new int[2];

        for (int i = 0; i < nums.length; i++) {
            // nums = [2,7,11,15], target = 9
            for (int j = nums.length; j = 0; j--) {
                if (nums[i] < target && ntf == 0) {
                    acumA = acumA + target - nums[i]; // 7
                    indice[0] = i;
                    ntf = acumA;
                } else if (nums[j] < target && ntf == 0) {
                    acumB = acumB + target - nums[j]; //
                    indice[1] = j;
                    ntf = acumB;

                } else if (nums[i] == ntf) {
                    indice[1] = i;
                    // indice[1] = j;
                    break;
                }

            }

        }

        return indice;
    }
}