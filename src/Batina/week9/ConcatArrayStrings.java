package Batina.week9;


import java.util.Arrays;

public class ConcatArrayStrings {
    public static void main(String[] args) {

        String[] arr1 = {"Joe", "Mohammed", "Djuna", "Felipe"};
        String[] arr2 = {"Mike", "Hans", "Lee"};
        System.out.println(Arrays.toString(concatArrays(arr1, arr2)));
    }

    public static String[] concatArrays(String[] arr1, String[] arr2){

        String[] merged = new String[arr1.length + arr2.length]; // plussing two arrays length [0,0,0,0,0,0,0]
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
