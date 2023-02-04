package dk.hashlistexercises.symmetricsetdiff;

import java.util.HashSet;

public class SymmetricSetDifference {
    static HashSet<Integer> firstSet = new HashSet<>(){{
       add(1);
       add(4);
       add(7);
       add(9);
    }};
    static HashSet<Integer> secondSet = new HashSet<>(){{
       add(2);
       add(4);
       add(5);
       add(6);
       add(7);
    }};
    public static void main(String[] args){
        System.out.println(firstSet);
    }
    public static HashSet<Integer> symmetricSetDifference(HashSet<Integer> setOne, HashSet<Integer> setTwo){
        HashSet<Integer> symmetricDiffSet = new HashSet<>();
        return symmetricDiffSet;
    }
}
