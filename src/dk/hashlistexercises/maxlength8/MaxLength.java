package dk.hashlistexercises.maxlength8;

import java.util.HashSet;
import java.util.Set;

public class MaxLength {
    static Set<String> setOfStrings = new HashSet<>(){{
       add("ContentLength0");
       add("ContentLength000");
       add("ContentLength00000");
       add("ContentLength0000");
       add("ContentLength00");
    }};
    public static void main(String[] args){
        System.out.println(maxLength(setOfStrings));
    }
    public static int maxLength(Set<String> stringSet){
        int tempStringLength = 0;
        if(stringSet.isEmpty()){
            return 0;
        }
        else{
            for(String str: stringSet){
                if(str.length() > tempStringLength){
                    tempStringLength = str.length();
                }
            }
        }
        return tempStringLength;
    }
}
