package dk.hashlistexercises.intersect14;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Intersect {
    static Map<String,Integer> firstMap = new HashMap<>(){{
       put("Janet", 87);
       put("Logan", 62);
       put("Whitaker", 46);
       put("Alyssa", 100);
       put("Stefanie", 80);
       put("Jeff", 88);
       put("Kim", 52);
       put("Sylvia", 95);
    }};
    static Map<String,Integer> secondMap = new HashMap<>(){{
       put("Logan", 62);
       put("Kim", 52);
       put("Whitaker", 52);
       put("Jeff", 88);
       put("Stefanie", 80);
       put("Brian", 60);
       put("Lisa", 83);
       put("Sylvia", 87);
    }};
    public static <Map> void main(String[] args){
        HashMap<String,Integer> updatedMap = new HashMap<>(intersect(firstMap,secondMap));
        System.out.println(updatedMap);
    }
    public static HashMap<String,Integer> intersect(Map<String,Integer> map1, Map<String,Integer> map2){
        HashMap<String,Integer> newHashMap = new HashMap<>();
        for(String key: map1.keySet()){
            for(String key2: map2.keySet()){
                if(key.equals(key2)){
                    if(Objects.equals(map1.get(key), map2.get(key2)))
                        newHashMap.put(key, map1.get(key));
                }
            }
        }
        return newHashMap;
    }
}
