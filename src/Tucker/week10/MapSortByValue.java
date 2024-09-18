package Tucker.week10;

import java.sql.Array;
import java.util.*;

public class MapSortByValue {

    public static void main(String[] args){

        Map<Integer, Integer> mapOne = new HashMap<>();
            mapOne.put(1, 5);
            mapOne.put(12, 2);
            mapOne.put(62, 3);
            mapOne.put(21, 7);
            mapOne.put(43, 1);
            mapOne.put(94, 4);
            mapOne.put(2, 6);

       // System.out.println("mapOne = " + mapOne);
        System.out.println("mapSort(mapOne) = " + mapSort(mapOne));



    }

/*
Map - sort the map by values
	- Write a method that can sort the Map by values.
 */


    public static Map<Integer, Integer> mapSort(Map<Integer, Integer> methMap){

        Map<Integer, Integer> tempMap = new LinkedHashMap<>();
        Map<Integer, Integer> sortedMap = new HashMap<>();

for(Map.Entry<Integer, Integer> each : methMap.entrySet()){
    tempMap.put(each.getValue(), each.getKey());
}


for(Map.Entry<Integer, Integer> each2 : tempMap.entrySet()){
    sortedMap.put(each2.getKey(), each2.getValue());
}


        return sortedMap;

// Can't get the Key's and Values to switch... solution?

    }

}


