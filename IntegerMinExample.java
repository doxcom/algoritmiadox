public class IntegerMinExample {
    public static void main(String[] args) {
        int max_value = Integer.MIN_VALUE;
        int[] arr = { 10, 69, 10300, 58968 };
        for (int i = 0; i < arr.length; i++) {
            if (max_value < arr[i]) {
                max_value = arr[i];

                System.out.println("Maximum at this time: " + max_value);
            }
        }
        System.out.println("maximum value is " + max_value);
    }
}

/*
 * In the above code as you can see we're initializing the max_value variable to
 * type int to a Integer.MIN_VALUE which sets a minimum base value upon which
 * elements in the array can be compared again and we can get the maximum valued
 * element
 */
