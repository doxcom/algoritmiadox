package leetcodeproblems.MergedSortedArray;

public class SolutionMergedSortedArray {

    public void  merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==1 && n ==0){
            System.out.println("["+nums1[0]+"]");
        }else if(m==0 && n ==1){
          //  nums1[0] = nums2[0];
            System.out.println("["+nums1[nums2[0]]+"]");
        }

    }

    public static void main(String[] args) {

      int[] nums1={};
      int m=0;
      int[] nums2={1};
      int n=1;

       SolutionMergedSortedArray solution = new SolutionMergedSortedArray();
       solution.merge(nums1,m,nums2,n);
    }
}
