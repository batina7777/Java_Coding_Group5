package Tucker.week4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args){
        removeDup("AAAABBBBCCCCC");
        removeDup("GGHHANAAUGAAKAH");
        removeDup("does ThIs maintain the originAl OrdEr");

    }

    public static void removeDup(String str){

        /*
        Convert String into char array
         */
    char[] strChars = str.toCharArray();

        Set<Character> unique = new LinkedHashSet<>();

        for(char each : strChars){
            unique.add(each);
        }

        char[] uniqueChars = new char[unique.size()];
        int index = 0;

        for(char each : unique){ // read the values from the Set and assign into the array
            uniqueChars[index++] = each;
        }
        System.out.println(uniqueChars);
    }


}

/*
Write a return method that can remove the duplicated values from the String
EX: removeDup("AAAABBBBBCCCCC") --> ABC
 */