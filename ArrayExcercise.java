public class ArrayExcercise {

    public static void main(String[] args) {


        int [] array =  {1,2,3,4}; //7

        for(int i=0; i<array.length; i++){
            System.out.println("Left "+ array[i]);
            for(int j=array.length-1; j>=0; j--){

              //  i++;
                System.out.println("Right "+array[j]);
            }
        }
    }
}
