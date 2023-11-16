package JavaActivities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> colours = new HashMap<Integer, String>();
        colours.put(1, "Pink");
        colours.put(2, "Yellow");
        colours.put(3, "Red");
        colours.put(4, "Purple");
        colours.put(5, "Magenta");

        System.out.println("The Original map: " + colours);

        colours.remove(2);

        System.out.println("Removed Yellow: " + colours);

         if(colours.containsValue("Green")) {
            System.out.println("Green colour exists in the Map");
        } else {
            System.out.println("Green colour doesn't exist in the Map");
        }

        System.out.println("Number of colours in the Map is: " + colours.size());
    }
}