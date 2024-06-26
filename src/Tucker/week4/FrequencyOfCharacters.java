package Tucker.week4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args){

        frequencyOfCharacter("Banana Apple Pie");
        System.out.println("---------");
        frequencyOfCharacter("Good Morning");


    }

    public static void frequencyOfCharacter(String str){

        /*
        key = each char, and the value is the frequency
         */
        Map<Character, Integer> counter = new HashMap<>();


        for(int i = 0; i < str.length(); i++){

            char key = str.charAt(i);

            /*
            This adds the first instance of the char
            -Its critical to start this as '0'
             */
            if(!counter.containsKey(key)){
                counter.put(key, 0);
            }
/*
.put() as an updater to the key, giving the count
 */
            counter.put(key, counter.get(key) + 1);

        }
        System.out.println(counter);

    }

}

/*
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars ("AAABBCDD" ) ==> A3B2C1D2
 */