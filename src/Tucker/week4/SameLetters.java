package Tucker.week4;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "bac"));

        System.out.println(sameLetters("How does this work with spaces", "does this How spaces work with"));

    }

    public static boolean sameLetters(String str1, String str2) {

        /*
        removing whitespace from both Strings
         */
        str1.replaceAll(" ", "");
        str2.replaceAll(" ", "");

        /*
        Convert both Strings into chars
         */
        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();

        /*
        Sort the Arrays
         */
        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

       boolean confirmedSameLetters = false;

       /*
       Compare the Arrays
        */
        if (Arrays.equals(str1Chars, str2Chars)) {
            confirmedSameLetters = true;
        } else {
            confirmedSameLetters = false;
        }
return confirmedSameLetters;

    }
    /*
    Personal Note:
    After finishing this, I think there is an easier way in Collections
     */

}

/*
Write a return method that checks if a string is built out of the same letters as another string.
Ex: same ("abc"
, "cab"); ==> true
same ("abc", "abb"); ==> false
 */