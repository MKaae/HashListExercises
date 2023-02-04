import java.util.ArrayList;
import java.util.LinkedList;

public class RemoveInRange {
    static LinkedList<Integer> listOfNumbers = new LinkedList<>(){{
        add(0);
        add(0);
        add(2);
        add(0);
        add(4);
        add(0);
        add(6);
        add(0);
        add(8);
        add(0);
        add(10);
        add(0);
        add(12);
        add(0);
        add(14);
        add(0);
        add(16);
    }};
    public static void main(String[] args) {
        System.out.println(listOfNumbers);
        removeInRange(listOfNumbers, 0, 5, 13);
        System.out.println(listOfNumbers);
    }
    public static void removeInRange(LinkedList<Integer> list, int elementValue, int startingIndex, int endingIndex){
        ArrayList<Integer> tempList = new ArrayList<>();
        for(int index = startingIndex; index < endingIndex; index++){
            if(list.get(index) == elementValue){
                tempList.add(index);
            }
        }
        recursiveRemove(tempList.size(), tempList);
    }
    public static void recursiveRemove(int size, ArrayList<Integer> tempList){
        int tempSize = size-1;
        if(size == 0){
            return;
        }
        int temp = 0;
        temp = tempList.get(tempSize);
        listOfNumbers.remove(temp);
        size--;
        recursiveRemove(size, tempList);
    }
}