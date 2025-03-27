package leetcodeproblems.MergedSortedArray;

import java.util.Arrays;

public class TestSortedArrayMerge {
    //merge with sort function

    public static void mergeArrays(int[] array1, int[] array2, int[] array3){

        int n1= array1.length;
        int n2= array2.length;

        for(int i=0; i<n1; i++){
            array3[i]=array1[i];
            array3[i+n2]=array2[i];
        }

        Arrays.sort(array3);
    }

    public static void main(String [] args){
    int[] arr1 = {1,3,5,7};
    int[] arr2 = {2,4,6,8};
    int[] arr3 = new int[arr1.length + arr2.length];
      mergeArrays(arr1, arr2, arr3);

      for(int value : arr3){
          System.out.print(value + " ");
      }
    }


}
