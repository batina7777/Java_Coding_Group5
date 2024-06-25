package Zeynep.week4;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        Map<Character, Integer> counter = new LinkedHashMap<>();

        /*
         b = 2
            c = `2`
         */

        for(int i = 0; i < str.length(); i++){
            char key = str.charAt(i);

            if(!counter.containsKey(key)){
                counter.put(key, 0);
            }

            counter.put(key, counter.get(key) + 1);

        }

//        for(int i = 0; i < str.length(); i++){
//            char key = str.charAt(i);
//
//            if(counter.containsKey(key)){
//                counter.put(key, counter.get(key) + 1);
//            } else {
//                counter.put(key, 1);
//            }
//        }

        System.out.println(counter);

    }
}

/*
4. Create a class named FrequencyOfCharacters and write a program that returns the frequency of each
character in a given string as a map, without using nested loops.
         Example:
               string = "bbcccaaaaa"

         Output:
               {b=2, c=3, a=5}
 */