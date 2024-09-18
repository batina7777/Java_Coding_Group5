package Tucker.week9;

import java.util.Arrays;

public class Array_concat2Arrays {

    /*
        Write a return method that can concatenate two arrays.
     */

    public static void main(String[] args){
        /*
        int test
         */
        int[] intArr1 = {4, 1, 2, 7, 8};
        int[] intArr2 = {10, 5, 6, 23};
        concat2ArraysInt(intArr1, intArr2);

        /*
        String test
         */
      //  String[] StringArr1 = {"Joe", "Mohammed", "Djuna", "Felipe"};
       // String[] StringArr2 = {"Mike", "Hans", "Lee"};
       // concat2ArraysString(StringArr1, StringArr2);


    }

    public static void concat2ArraysInt(int[] arr1, int[] arr2){
        int length = arr1.length + arr2.length;

        int[] newArr = new int[length];

       // int index = 0; // Uncomment for the enhanced for-each loop
        /*
        Solving using the for-i loop
         */
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            newArr[i+arr1.length] = arr2[i];
        }

        /*
        Solving using the enhanced for each loop
         */

     /*   // FIRST array into new array
        for (int each : arr1){
            newArr[index] = each;
            index++;
        }

        // SECOND array into new array
        for (int each : arr2){
            newArr[index] = each;
            index++;
        }*/


        System.out.println(Arrays.toString(newArr));
        // Question: how to do this but return as an int[]?
    }

    public static void concat2ArraysString(String[] arr1, String[] arr2){
        int length = arr1.length + arr2.length;

        String[] newArr = new String[length];

        int index = 0;
        // FIRST array into new array
        for (String each : arr1){
            newArr[index] = each;
            index++;
        }

        // SECOND array into new array
        for (String each : arr2){
            newArr[index] = each;
            index++;
        }


        System.out.println(Arrays.toString(newArr));
        // Question: how to do this but return as String[]?
    }

}
