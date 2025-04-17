package leetcodeproblems.MergedSortedArray;
// problem https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
public class TestSorterArraySteps {

   public static void  merge(int[] a, int[] b, int m, int n){

    int nums1Size = m+n;
    int i=0,j =0;
        while(nums1Size>i){
            //compare

            if(a[i]<b[j] && i==0){
                i++;
            }else if( a[i]==b[j]){
                b[j] = a[i+1];
                a[i+1] = a[i];
                i=i+2;
            }else if(b[j] > a[i] && i!=0){
                a[i]=b[j];
                j++;
                i++;
            }
        }
   }

   public static void main(String[] args) {

       int[] foo={1};
       int[] bar ={};
       int m=1;
       int n=0;

       if(m==0 && n==1){
           System.out.println("["+ bar[0] + "]");
       }else if(m==1 && n==0){
           System.out.println("["+ foo[0] + "]");
       }else{
           merge(foo,bar,m,n);

           for(int i=0; i<foo.length; i++){
               System.out.print("["+ foo[i] + "]");
           }
       }
   }
}
