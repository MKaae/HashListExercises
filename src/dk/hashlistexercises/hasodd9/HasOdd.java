package dk.hashlistexercises.hasodd9;

import java.util.HashSet;

public class HasOdd {
    static HashSet<Integer> integerHashSet = new HashSet<>(){{
       add(2);
       add(4);
       add(6);
       add(8);
       add(10);
    }};
    public static void main(String[] args){
        System.out.println(hasOdd(integerHashSet));
    }
    public static boolean hasOdd(HashSet<Integer> intSet){
        if(intSet.isEmpty()){
            return false;
        }
        for(Integer numbers: intSet){
            if(numbers % 2 != 0){
                return false;
            }
        }
        return true;
    }
}
