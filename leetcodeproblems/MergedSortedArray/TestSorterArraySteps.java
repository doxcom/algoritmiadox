package leetcodeproblems.MergedSortedArray;
// problem https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
public class TestSorterArraySteps {

    public static void  merge(int[] nums1, int[] nums2, int m, int n){

        if(m==0 && n==1){
            System.out.println("["+ nums2[0] + "]");
        }else if(m==1 && n==0){
            System.out.println("["+ nums1[0] + "]");
        }else{
            int nums1Size = m+n;
            int i=0,j =0;
            while(nums1Size>i){
                if(nums1[i]<nums2[j] && i==0){
                    i++;
                }else if( nums1[i]==nums2[j]){
                    nums2[j] = nums1[i+1];
                    nums1[i+1] = nums1[i];
                    i=i+2;
                }else if(nums2[j] > nums1[i] && i!=0){
                    nums1[i]=nums2[j];
                    j++;
                    i++;
                }
            }
            System.out.print("[");
            System.out.print(nums1[0]);
            for(int k=1; k<nums1.length; k++){
                System.out.print("," + nums1[k]);
            }
            System.out.println("]");
        }


    }

    public static void main(String[] args) {

        int[] foo={0};
        int[] bar ={1};
        int m=0;
        int n=1;
        merge(foo,bar,m,n);


    }
}