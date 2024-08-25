package Tucker.week9;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List_RemoveSomeValues {

    /*
        * Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300,...etc
        * Remove all values greater than 100.
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 101, 200, 300};

        int[] arr2 = {85, 1, 200, 110, 430, 1000000, 5, 43, 100, 5};

        System.out.println("removeUnderHundred(arr) = " + removeUnderHundred(arr));

        System.out.println("removeUnderHundred(arr2) = " + removeUnderHundred(arr2));

    }


    public static List<Integer> removeUnderHundred(int[] useInt){


            List<Integer> listToBeReturn = new ArrayList<>();

            for (int each : useInt){
                if(each <= 100){
                    listToBeReturn.add(each);
                }
            }

            return listToBeReturn;
        }




}
