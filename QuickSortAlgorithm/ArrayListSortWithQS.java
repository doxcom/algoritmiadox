package QuickSortAlgorithm;

import java.util.ArrayList;
//https://javarevisited.blogspot.com/2023/09/how-to-sort-arraylist-in-java-without.html#
public class ArrayListSortWithQS {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
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
                                                         //2       1
    public static void quicksort(ArrayList<Integer> list, int low, int high){
        System.out.println("low: " + low + ", high: " + high);

        if(low<high){ //2 < 6
                                         //2    6
            int pivotIndex = partition(list, low,high);//2

            //recursivamente ordenara cada sublista
            quicksort(list,low,pivotIndex-1);//2,1
            quicksort(list,pivotIndex+1,high);//3,6
        }

    }
  //2, 5 , 23, 44, 34 ,98, 190
    public static int partition(ArrayList<Integer> list, int low,int high){
                                                       //2            6
        int pivot=list.get(high);// 23

        int i= low - 1;//1
               //6    6<6
        for (int j=low; j<high; j++){
            // 98<23
            if(list.get(j)<pivot){
                i++; //0
                //swap elements at i and j
                int temp=list.get(i);// 34
                list.set(i,list.get(j)); //0,2
                list.set(j,temp); //4, 34
            }
        }

        //swap the pivot element with the element at (i+1)
        int temp= list.get(i+1);//190
        list.set(i+1, list.get(high));//2,23
        list.set(high,temp);//6,190

        return i+1;//2

    }




}
