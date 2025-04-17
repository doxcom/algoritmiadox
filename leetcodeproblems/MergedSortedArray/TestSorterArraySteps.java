package leetcodeproblems.MergedSortedArray;
// problem https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
public class TestSorterArraySteps {

   public static void  merge(int[] a, int[] b, int m, int n){

    int nums1Size = m+n;
    int i=0,j =0;
    while(nums1Size>0){
     //compare

        if(a[i]<b[j]  || a[i]==0){
            i++;
        }else if( a[i]==b[j]){
            b[j] = a[i+1];
            a[i+1] = a[i];
            i++;
        }else if(a[i] > b[j] ){

        }
      nums1Size--;
    }
   }
 // i0  i1  i2
//   1,  2 , 2  , 0,  0 , 0
//  j0
//   3,  5 , 6 ,

   public static void main(String[] args) {

       int[] foo={1,2,3,0,0,0};
       int[] bar ={2,5,6};
       int m=3;
       int n=3;

       merge(foo,bar,m,n);

       for(int i=0; i<foo.length; i++){
           System.out.print("["+ foo[i] + "]");
       }

   }


}
