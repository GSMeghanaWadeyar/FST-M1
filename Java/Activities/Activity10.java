package JavaActivities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        // Adding element to HashSet
        hs.add("M");
        hs.add("N");
        hs.add("O");
        hs.add("P");
        hs.add("Q");
        hs.add("M");

        System.out.println("Original HashSet: " + hs);

        System.out.println("Size of HashSet: " + hs.size());

        System.out.println("Removing A from HashSet: " + hs.remove("O"));

        if(hs.remove("A")) {
            System.out.println("A removed from the Set");
        } else {
            System.out.println("A is not present in the Set");
        }

        System.out.println("Checking if B is present: " + hs.contains("B"));

        System.out.println("Updated HashSet: " + hs);
    }
}
