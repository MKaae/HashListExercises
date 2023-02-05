package dk.hashlistexercises.containsthree12;

import java.util.HashMap;
import java.util.LinkedList;

public class ContainsThree {
    static LinkedList<String> strList = new LinkedList<>(){{
       add("Content");
       add("Something");
       add("Something");
       add("SomethingElse");
       add("SomethingElse");
       add("Something");
    }};
    public static void main(String[] args){
        System.out.println(contains3(strList));
    }
    public static boolean contains3(LinkedList<String> list){
        HashMap<String, Integer> tempHashMap = new HashMap<>();
        for(String listOfStrings: list){

            if(tempHashMap.containsKey(listOfStrings)){
                tempHashMap.put(listOfStrings, tempHashMap.get(listOfStrings) +1);

                if(tempHashMap.get(listOfStrings) == 3)
                    return true;
            }
            else{
                tempHashMap.put(listOfStrings, 1);
            }
        }
        return false;
    }
}
