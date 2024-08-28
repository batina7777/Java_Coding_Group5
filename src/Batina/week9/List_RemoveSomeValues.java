package Batina.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
 */
public class List_RemoveSomeValues {

        public static void main(String[] args) {
            List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));
            System.out.println(removeMoreThan100(nums));

        }

        public static List<Integer> removeMoreThan100(List<Integer> nums){

            Iterator<Integer> it = nums.iterator(); // iterator is like a pin going to each element one at the time

            while(it.hasNext()){      //hasNext() it goes until there is no more elements left
                if(it.next() > 100){  //next() moves to the pin to the next and reads the value and returns the value the same time
                    it.remove();
                }
            }
            return nums;
        }
    }


