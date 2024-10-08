import java.util.HashMap;

class SolutionTwoSum {
    /*
    https://leetcode.com/problems/two-sum/
    */
    public static void main(String[] args) {

        int[] sumarray = { 3,2,4};
        twoSum(sumarray,6);
        System.out.println(twoSum(sumarray, 9));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexStore = new HashMap<>();
      int numbCom1=Integer.MIN_VALUE;
      int numbCom2=Integer.MIN_VALUE;
      int [] pos =new int[2];
      int i,j;
      for( i=0,j =nums.length-1; i<=j; i++,j--) {
          //-3,4,3,90  0
          // 0 1 2 4
          if(nums[i]+nums[j]==target && nums.length==2){
              pos[0]=i;
              pos[1]=j;
              break;
          }
          if(indexStore.size()>=1 && nums[i]==numbCom1){
              pos[0]=indexStore.get(target-nums[i]);//me daria 2, y la posicion "0"
              pos[1]=i;
              break;
          }else if(indexStore.size()>=1 && nums[j]==numbCom2){
              pos[0]=indexStore.get(target-nums[j]);
              pos[1]=j;
              break;
          }else if(indexStore.size()>=1 && nums[j]==numbCom1){
             // pos[0]=indexStore.get(target-)
          }
          if(nums[i]<target){ // -3 si es menor que 0
              indexStore.put(nums[i],i);// -3,0
              numbCom1=target-nums[i];// 0 -(-3) -> 3

          }
          if(nums[j]<target){
              indexStore.put(nums[j],j);
            numbCom2=target-nums[j];
          }


       
      }
              
        return pos;
    }

}


