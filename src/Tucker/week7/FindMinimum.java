package Tucker.week7;

import java.util.Arrays;

public class FindMinimum {

    public static void main(String[] args){
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int[] arr2 = {254, 23, 9999, 1, 43, 72};

        System.out.println(findMin(arr));
        System.out.println(findMin(arr2));


    }

    public static int findMin(int[] array){

        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
return min;
    }

    public static int minNum2(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

}

/*
Write a method that can find the minimum number from an int
EX: int[] arr = {99, 12, 23, 32, 44, 57, 6}
--> returns: 6
 */