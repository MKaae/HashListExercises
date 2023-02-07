package dk.hashlistexercises.symmetricsetdiff11;

import java.util.HashSet;
import java.util.Set;

public class SymmetricSetDifference {
    static Set<Integer> firstSet = new HashSet<>(){{
       add(1);
       add(4);
       add(7);
       add(9);
    }};
    static Set<Integer> secondSet = new HashSet<>(){{
       add(2);
       add(4);
       add(5);
       add(6);
       add(7);
    }};
    public static void main(String[] args){
        System.out.println(symmetricSetDifference(firstSet, secondSet));
    }
    public static Set<Integer> symmetricSetDifference(Set<Integer> setOne, Set<Integer> setTwo){
        Set<Integer> symmetricDiffSet = new HashSet<>();
        for(Integer set1: setOne){
            if(!setTwo.contains(set1)){
                symmetricDiffSet.add(set1);
            }
        }
        for(Integer set2: setTwo){
            if(!setOne.contains(set2)){
                symmetricDiffSet.add(set2);
            }
        }
        return symmetricDiffSet;
    }
}
