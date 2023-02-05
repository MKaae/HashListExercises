package dk.hashlistexercises.maxoccurrences15;

import java.util.HashMap;
import java.util.LinkedList;

public class MaxOccurrences {
    static LinkedList<Integer> listOfInts = new LinkedList<>(){{
       add(1);
       add(2);
       add(5);
       add(4);
       add(3);
       add(2);
       add(2);
       add(1);
    }};
    public static void main(String[] args){
        System.out.println(maxOccurrences(listOfInts));
    }
    public static int maxOccurrences(LinkedList<Integer> list){
        HashMap<Integer,Integer> tempHashMap = new HashMap<>();
        int mode = 0;

        for(Integer number: list){
            if(tempHashMap.containsKey(number)){
                tempHashMap.put(number, tempHashMap.get(number) +1);
            }
            else{
                tempHashMap.put(number, 1);
            }
            if(tempHashMap.get(number) > mode){
                mode = tempHashMap.get(number);
            }
        }

        return mode;
    }
}
