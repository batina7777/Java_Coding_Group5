package Batina.week9;

import java.util.Arrays;

public class ConcatArrayInt {
    /*
        Concat Arrays

        Create a method that will take two int arrays and concat them into one array. Concat the arrays by combining them into one array

        Ex:
            Input:
                [1, 4, 5], [8, 12, 5, 9]
            Output:
                [1, 4, 5, 8, 12, 5, 9]
     */
    public static void main(String[] args) {
        int [] arr1 = {1, 4, 5};
        int [] arr2 = {8, 12, 5, 9};

        System.out.println(Arrays.toString(concatArrays(arr1, arr2)));
        //Arrays.toString() print method prints string of array instead of hashcode.

        int [] test = (concatArrays(arr1, arr2));


    }
    public static int[] concatArrays(int[] arr1, int[] arr2){

        int[] merged = new int[arr1.length + arr2.length]; // plussing two arrays length [0,0,0,0,0,0,0]
        // i -> add to the merged array, also read from the arr1
        // y -> read the elements from the arr2

        for(int i = 0, y = 0; i < merged.length; i++){

            if(i < arr1.length){ // i -> [0] less than arr1.length -> [0,0,0]
                merged[i] = arr1[i];
                // arr1 [1, 4, 5]   ->  merged [1,4,5,0,0,0,0]
            } else {
                merged[i] = arr2[y++];
                // arr2 [8,12,5,9] -> merged [1,4,5,0,0,0,0] -> merged[1,4,5,8,12,5,9], y++ post increment is increments by 1.
            }

        }

        return merged; // returns  merged[1,4,5,8,12,5,9]
    }
}