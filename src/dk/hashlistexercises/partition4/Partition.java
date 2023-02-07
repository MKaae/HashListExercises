package dk.hashlistexercises.partition4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Partition {
    static List<Integer> listOfNumbers = new LinkedList<>() {{
        add(15);
        add(1);
        add(6);
        add(12);
        add(-3);
        add(4);
        add(8);
        add(21);
        add(2);
        add(30);
        add(-1);
        add(9);
    }};
    public static void main(String[] args) {
        int valueE = 5;
        System.out.println(listOfNumbers);
        partition(listOfNumbers, valueE);
        System.out.println(listOfNumbers);
    }
    public static void partition(List<Integer> inputList, int valueE){
        LinkedList<Integer> refactoredList = new LinkedList<>();
        Iterator<Integer> splitIterator = inputList.iterator();
        int nextIteration;
        while(splitIterator.hasNext()){
            nextIteration = splitIterator.next();
            if (nextIteration > valueE) {
                splitIterator.remove();
                refactoredList.addLast(nextIteration);
            }
            else{
                splitIterator.remove();
                refactoredList.addFirst(nextIteration);
            }
        }
        listOfNumbers = refactoredList;
    }
}
