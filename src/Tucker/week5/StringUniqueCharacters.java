package Tucker.week5;

import javax.swing.*;
import java.util.*;

public class StringUniqueCharacters {
    public static void main(String[] args) {

        System.out.println(unique("AAAABBBCCCCDEF"));


    }

    public static String unique(String str) {
        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if (str.indexOf(current) == str.lastIndexOf(current)) {
                uniqueChars.append(current);
            }
        }
        return uniqueChars.toString();

    }
}

/*
String_UniqueCharacters
Write a return method that can find the unique characters from the String
EX: unique("AAAABBBCCCCDEF") --> "DEF"
 */