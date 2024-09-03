package Batina.week9;

/*
 * Given a list of people named: "Ahmed", "John", "Eric", "Ahmed", "Aaron".....
 * Write a java operation that removes the name Ahmed
 * result should be:    "John", "Eric", "Aaron"
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemoveNameAhmed {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron"));
        System.out.println(removeAhmed(names));

    }

    public static List<String> removeAhmed(List<String> names){
        Iterator<String> iterator = names.iterator();
        /*
        Iterator object and iterator() method that  iterates(повторять) through a collection of elements one by one. It is a part of the Java Collections Framework and is commonly used with collection classes like ArrayList, HashSet, LinkedList,
         */

        // iterator is like a "pin" and hasNext() boolean method return true, false ensures that the iterator has not yet reached the end of the collection
        while(iterator.hasNext()){
            if(iterator.next().equals("Ahmed")){ // next() method to retrieve the next element
                iterator.remove();
            }
        }
        return names;
    }




    //Soulution2
    //lambda expression p->
    public static List<String> removeAhmed2(List<String> names) {
        names.removeIf(p -> p.equals("Ahmed"));
        return names;
    }
    }

