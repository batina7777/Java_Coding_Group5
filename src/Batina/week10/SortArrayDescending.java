package array;

import java.util.Arrays;

public class SortArrayDescending {
    /*
        Sort Array Descending

        Create a method that will sort the given array in descending order (largest to smallest).

        DO NOT USE any built in methods

        Ex:
            Input:
                [3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6]
            Output:
                [8, 6, 6, 5, 4, 3, 3, 2, 1, 1, -1]

     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortDescending(3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6)));
    }

    public static int[] sortDescending(int... arr){

        for(int i = 0; i < arr.length; i++){
            System.out.println("--------- i: " + i);
            for(int j = 0; j < arr.length - 1; j++){
                //    3    <    8
                if(arr[j] < arr[j + 1]){
                    System.out.println("Swapping " + arr[j] + " and " + arr[j+1]);
                    //  0         3
                    int temp = arr[j];
                    //  0         4
                    arr[j] = arr[j + 1];
                    //  0         3
                    arr[j + 1] = temp;
                }

                System.out.println("Array after j index of " + j + " | " + Arrays.toString(arr));
            }
        }
        return arr;
    }

}