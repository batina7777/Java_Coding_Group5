package Tucker.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class List_RemoveNameAhmed {


    /*
        * Given a list of people named: "Ahmed", "John", "Eric", "Ahmed", "Aaron".....
        * Write a java operation that removes the name Ahmed
     */

    public static void main(String[] args){
        List<String> fullNames = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Aaron", "Ahmed", "Jillian", "Tyler", "Samantha"));

        System.out.println("removeAhmed(fullNames) = " + removeAhmed(fullNames));

    }

    public static List<String> removeAhmed(List<String> names){
          names.removeIf(name -> name.equals("Ahmed"));

        return names;
    }
}
