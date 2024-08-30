
class SolutionTwoSum {
    // https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {

        int[] sumarray = { 2, 7, 11, 15 };

        System.out.println(twoSum(sumarray, 9));

    }

    static int[] twoSum(int[] nums, int target) {

        int acum = 0;
        int[] indice = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] < target) && (acum < nums[i])) {
                acum = acum + nums[i];
                indice[i] = i;
                if (acum == target)
                    break;
            } else {
                i++;
            }

        }

        return indice;
    }
}