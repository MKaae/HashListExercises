package dk.hashlistexercises.countcommon7;

import java.util.HashSet;
import java.util.LinkedList;

public class CountCommon {
    static LinkedList<Integer> firstNumberList = new LinkedList<>(){{
       add(3);
       add(7);
       add(3);
       add(-1);
       add(2);
       add(3);
       add(7);
       add(2);
       add(15);
       add(15);
    }};
    static LinkedList<Integer> secondNumberList = new LinkedList<>(){{
       add(-5);
       add(15);
       add(2);
       add(-1);
       add(7);
       add(15);
       add(36);
    }};
    public static void main(String[] args){
        System.out.println(countCommon(firstNumberList, secondNumberList));
    }
    public static int countCommon(LinkedList<Integer> firstList, LinkedList<Integer> secondList){
        HashSet<Integer> firstSet = new HashSet<>(firstList);
        HashSet<Integer> secondSet = new HashSet<>(secondList);
        int commonCounter = 0;
        for(Integer numberCheck: firstSet){
            if(secondSet.contains(numberCheck)){
                commonCounter++;
            }
        }
        return commonCounter;
    }
}
