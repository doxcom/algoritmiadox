public class ArrayExcercise {

    public static void main(String[] args) {


        int [] array =  {2,34,1,3,5,6,4,78,64,32}; //7

        for(int i=0; i<array.length; i++){
            for(int j=array.length-1; j>=0; j--){
                System.out.println("Left "+ array[i]);
                i++;
                System.out.println("Right "+array[j]);
            }
        }
    }
}
