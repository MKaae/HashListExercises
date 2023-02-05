package dk.hashlistexercises.isunique13;

import java.util.HashMap;
import java.util.HashSet;

public class IsUnique {
    static HashMap<String,String> stringHashMap = new HashMap<>(){{
       put("Marty", "Stepp");
       put("Stuart", "Reges");
       put("Jessica", "Miller");
       put("Bruce", "Reges");
       put("Hal", "Perkins");
    }};
    public static void main(String[] args){
        System.out.println(isUnique(stringHashMap));
    }
    public static boolean isUnique(HashMap<String,String> hashMapInput){
        HashSet<String> tempSet = new HashSet<>(hashMapInput.values());
        if(tempSet.size() == hashMapInput.values().size()){
            return true;
        }
        return false;
    }
}
