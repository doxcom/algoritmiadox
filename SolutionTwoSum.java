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

          if(nums[i]+nums[j]==target){
              pos[0]=i;
              pos[1]=j;
              break;
          }
          if(indexStore.size()>=1 && nums[i]==numbCom1){ //if the two numb was found on the left side of the arry
              pos[0]=indexStore.get(target-nums[i]);//
              pos[1]=i;  //[-1,-2,-3,-4,-5] -8
                         //  0  1  2  3  4    i
                            //  1     3
              break;
          }else if(indexStore.size()>=1 && nums[j]==numbCom2){ //if the two numb was found on the right side of the arry
              pos[0]=indexStore.get(target-nums[j]);
              pos[1]=j;
              break;
          }else if(indexStore.size()>=1 && nums[j]==numbCom1){ //if the first numb was found on right and second on left side
             pos[0]=indexStore.get(target-nums[j]);
              pos[1]=j;
          }else if(indexStore.size()>=1 && nums[i]==numbCom2){//if the first numb was found on the left and 2nd on the right
              pos[0]=indexStore.get(target-nums[i]);
              pos[1]=i;
          }else{
              //[-1,-2,-3,-4,-5] -8
              //pos[0]=indexStore.get();
              //  0  1  2  3  4    i || j
          }
          if(nums[i]<target){  //left to right
              indexStore.put(nums[i],i);//-1,0pos
              indexStore.put(target-nums[i],i);//-7,0pos
              numbCom1=target-nums[i];

          }
          if(nums[j]<target){ //right to left,
              indexStore.put(nums[j],j); //-5,4pos
              indexStore.put(target-nums[j],j);//-3,4pos
              numbCom2=target-nums[j];
          }
       
      }
              
        return pos;
    }

}


