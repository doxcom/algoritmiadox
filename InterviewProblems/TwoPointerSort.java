package InterviewProblems;

public class TwoPointerSort {

  static int[] sort(int[] array) {
       int left = 0, right = array.length - 1;
       while (left < right) {
           if (array[left] == 0) {
               left++;
           } else if (array[right] == 1) {
               right--;
           } else {
               int temp = array[left];
               array[left] = array[right];
               array[right] = temp;

               //keep moving pointers
               left++;
               right--;

           }

       }
      return array;
   }

        public static void main (String[] args){
            int[] zeroandone = {0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0};

          int[] result = sort(zeroandone);
          for (int i=0; i<result.length-1; i++){
              System.out.print(result[i]+",");
          }
        }

}
