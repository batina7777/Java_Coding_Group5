package Tucker.week5;

import java.util.*;

public class StringReverse {
    public static void main(String[] args){

        System.out.println(stringReverse("ABCD"));

        System.out.println(stringReverse("The quick brown fox, jumped over the lazy Dog!"));

    }

    public static String stringReverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }


}


/*
Write a return method that can reverse a String
EX: reverse("ABCD"); --> DCBA
 */