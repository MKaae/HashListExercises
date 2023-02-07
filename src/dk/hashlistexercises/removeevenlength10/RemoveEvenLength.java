package dk.hashlistexercises.removeevenlength10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveEvenLength {
    static Set<String> stringHashSet = new HashSet<>(){{
       add("ContentLengthEven1");
       add("ContentLengthOdd2");
       add("ContentLengthEven3");
       add("ContentLengthOdd4");
       add("ContentLengthEven5");
    }};
    public static void main(String[] args){
        System.out.println(stringHashSet);
        removeEvenLength(stringHashSet);
        System.out.println(stringHashSet);
    }
    public static void removeEvenLength(Set<String> strSet){
        Iterator<String> setIterator = strSet.iterator();
        String iteration;
        while(setIterator.hasNext()){
            iteration = setIterator.next();
            if(iteration.length() % 2 == 0){
                setIterator.remove();
            }
        }
    }
}
