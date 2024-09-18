package Tucker.week10;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortDescending {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(65);
        list.add(8);
        list.add(22);
        list.add(4);
        list.add(909);
        list.add(5);
        list.add(3);
        list.add(18);
        list.add(1);
        list.add(9);
        list.add(15);
        list.add(22);
        list.add(1324);

        System.out.println("sortDescendingArrayList(list) = " + sortDescendingArrayList(list));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(38);
        list2.add(30);
        list2.add(15);
        list2.add(9);
        list2.add(1506);
        list2.add(4795);
        list2.add(63);
        list2.add(13);
        list2.add(6);
        list2.add(879);
        list2.add(915);
        list2.add(73);
        list2.add(167);

        System.out.println("sortDescendingArrayList(list2) = " + sortDescendingArrayList(list2));

    }
/*
    ArrayList - sort in descending order
	- Write a method that can sort the ArrayList in descending order without using the sort() method.
 */

public static ArrayList<Integer> sortDescendingArrayList(ArrayList<Integer> list){

    /*
    Collections.sort(list);
    Collections.reverse(list);
    return list;
    */

// Bubble Sort
    int n = list.size();
    for (int i = 0; i < n -1; i++) {
        for (int j = 0; j < n -i -1; j++) {
            if(list.get(j) < list.get(j+1)){ // only different is '<' or '>'
                // Swap list[j] and list[j+1]
                int temp = list.get(j);
                list.set(j, list.get(j+1));
                list.set(j+1, temp);
            }

        }

    }
    return list;

}


}
