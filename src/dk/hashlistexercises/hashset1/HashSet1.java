package dk.hashlistexercises.hashset1;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> clients = new HashSet<>();
        clients.add("John");
        clients.add("John");
        clients.add("Matt");
        clients.add("Lars");
        clients.add("Peter");

        System.out.println(clients);
    }
}