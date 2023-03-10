package dk.hashlistexercises.countunique6;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class CountUnique {
    static List<Integer> listOfNumbers = new LinkedList<>(){{
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
    public static void main(String[] args){
        System.out.println(countUnique(listOfNumbers));
    }
    public static int countUnique(List<Integer> numbersList){
        HashSet<Integer> tempSet = new HashSet<>(numbersList);
        return tempSet.size();
    }
}
