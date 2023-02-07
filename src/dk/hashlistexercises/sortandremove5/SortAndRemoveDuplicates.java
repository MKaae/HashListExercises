package dk.hashlistexercises.sortandremove5;

import java.util.*;

public class SortAndRemoveDuplicates {
    static List<Integer> listOfNumebrs = new LinkedList<>(){{
        add(7);
        add(4);
        add(-9);
        add(4);
        add(15);
        add(8);
        add(27);
        add(7);
        add(11);
        add(-5);
        add(32);
        add(-9);
        add(-9);
    }};
    public static void main(String[] args){
        sortAndRemoveDuplicates(listOfNumebrs);
        System.out.println(listOfNumebrs);
    }
    public static void sortAndRemoveDuplicates(List<Integer> unsortedList){
        Set<Integer> removedDuplicates = new HashSet<>(unsortedList);
        listOfNumebrs.clear();
        listOfNumebrs.addAll(removedDuplicates);
        Collections.sort(listOfNumebrs);
    }
}
