package QuickSortAlgorithm;

import java.util.ArrayList;
//https://javarevisited.blogspot.com/2023/09/how-to-sort-arraylist-in-java-without.html#
public class ArrayListSortWithQS {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(34);
        list.add(23);
        list.add(190);
        list.add(44);
        list.add(2);
        list.add(98);
        list.add(5);

        quicksort(list,0,list.size()-1);

        System.out.println(list);
    }

    public static void quicksort(ArrayList<Integer> list, int low, int high){

        if(low<high){
            //0 < 6                          0   , 6
            int pivotIndex = partition(list, low,high);
        }

    }

    public static int partition(ArrayList<Integer> list, int low,int high){


        int pivot=list.get(high);// 6

        int i= low - 1; // -1
                  //-1   -1<6
        for (int j=low; j<high; j++){
            if(list.get(j)<pivot){ // -1 < 6
                i++; //i=0
                //swap elements at i and j
                int temp=list.get(i);// 0
                list.set(i,list.get(j));
                list.set(j,temp);

            }
        }

        //swap the pivot element with the element at (i+1)
        int temp= list.get(i+1);
        list.set(i+1, list.get(high));
        list.set(high,temp);

        return i+1;

    }




}
