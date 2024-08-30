public class MaxSubSumProblem {

    static int maxSubArraySum(int[] array) {

        int max_so_far = Integer.MIN_VALUE; // instead of use Zero as initial,we pick the lowest integer value
        // to make sure that the first negative element will be higher than max so far
        int maxEndingHere = 0;

        for (int i = 0; i < array.length; i++) {
            maxEndingHere += array[i]; // here start to do the sum

            System.out.println("Max ending here init: " + maxEndingHere);
            // -2, -3, 4, -1, -2, 1, 5, -3
            max_so_far = Math.max(max_so_far, maxEndingHere);

            System.out.println("Max so far here: " + max_so_far);

            maxEndingHere = Math.max(maxEndingHere, 0);

            System.out.println("Max ending here: " + maxEndingHere);
        }

        return max_so_far;

    }

    public static void main(String[] args) {

        int[] array = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum in array is : " + maxSubArraySum(array));
    }

}
