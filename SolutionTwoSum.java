import java.util.HashMap;

class SolutionTwoSum {
    // https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {

        int[] sumarray = { 11,15,2,7};
        twoSum(sumarray,9);
        System.out.println(twoSum(sumarray, 9));
    }
   
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexStore = new HashMap<>();
      int numbCom1=Integer.MIN_VALUE;
      int numbCom2=Integer.MIN_VALUE;
      int [] pos =new int[2];
        for (int i = 0; i <nums.length; i++) {
            for (int j=nums.length-1; j>=0; j--){

                if(nums[i]+nums[j]==target){
                    pos[0]=i;
                    pos[1]=j;
                    break;
                }

                if(nums[i]==numbCom1 && indexStore.size()==1){ //num[i] = 7, i=1
                    pos[0]=indexStore.get(target-numbCom1);//0
                    pos[1]=i; //1
                    break;
                }else if(nums[j]==numbCom2 && indexStore.size()==1){
                    pos[0]=indexStore.get(target-numbCom2);
                    pos[1]=j;
                    break;
                }
                if(nums[i]<target){
                    //calculamos el numero a hallar
                    numbCom1=target-nums[i]; //9-2= 7
                    //guardamos en el hashtable
                    indexStore.put(nums[i], i); //key,value 2,0
                }else if(nums[j]<target){
                    numbCom2=target-nums[j];
                    indexStore.put(nums[j],j);
                }
            }
        }

        return pos;
    }

}



