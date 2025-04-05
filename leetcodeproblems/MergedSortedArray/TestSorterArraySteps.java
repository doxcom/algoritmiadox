package leetcodeproblems.MergedSortedArray;

public class TestSorterArraySteps {

   public static void  merge(int[] a, int[] b, int m, int n){

    int nums1Size = m+n;
    int i=0,j =0;
    while(nums1Size>0){
     //compare

        if(a[i]<b[j] || a[i]==b[j]){
            if(a[i]==0){
                a[i]=b[j];
            }
            i++;
        }else if(a[i] > b[j]){
            a[i+1] = a[i];
            a[i] = b[j];
        }
      nums1Size--;
    }
   }

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
