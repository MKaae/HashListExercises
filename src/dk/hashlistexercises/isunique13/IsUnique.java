package dk.hashlistexercises.isunique13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class IsUnique {
    static Map<String,String> stringHashMap = new HashMap<>(){{
       put("Marty", "Stepp");
       put("Stuart", "Reges");
       put("Jessica", "Miller");
       put("Bruce", "Reges");
       put("Hal", "Perkins");
    }};
    public static void main(String[] args){
        System.out.println(isUnique(stringHashMap));
    }
    public static boolean isUnique(Map<String,String> hashMapInput){
        HashSet<String> tempSet = new HashSet<>(hashMapInput.values());
        if(tempSet.size() == hashMapInput.values().size()){
            return true;
        }
        return false;
    }
}
