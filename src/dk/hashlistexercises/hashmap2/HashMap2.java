package dk.hashlistexercises.hashmap2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HashMap2 {
    static Map<String,Integer> storageMap = new HashMap<>();

    public static void main(String[] args) {
        generateWords();
        TreeMap<String, Integer> treeMap = new TreeMap<>(storageMap);
        System.out.println(treeMap);
    }
    public static void generateWords(){
        Scanner sc = new Scanner(System.in);
        String tempWords = "";
        int wordNumber = 0;
        while(!tempWords.equals("STOP")){
            tempWords = sc.next();
            if(!tempWords.equals("STOP")) {
                storageMap.put(tempWords, wordNumber);
                wordNumber++;
            }
        }
    }
}