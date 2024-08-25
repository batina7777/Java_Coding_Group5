package Tucker.week7;

import java.util.*;

public class SortAscending {
    public static void main(String[] args){

        int[] arr = {10, 9, 8, 7};
        int[] arr2 = {564, 700, 65, 1, 0, 34, 155};
/*
NOT OPERATIONAL --> Needs to be looked over
 */
    }

    public static int[] sortAscending(int[] array){
     int[] result = Arrays.copyOfRange(array, 0, array.length);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if(result[i] < result[j]){
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
return array; //--> might be incorrect
    }

}

/*
Write a return method that can sort an array in ascending order without using the sort method of the Arrays class
EX: int[] arr = {10, 9, 8, 7};
arr = Sort(arr);
--> returns: {7, 8, 9, 19}
 */