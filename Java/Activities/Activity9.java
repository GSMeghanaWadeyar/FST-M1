package JavaActivities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Jan");
        myList.add("Feb");
        myList.add("Mar");


        myList.add(3, "April");
        myList.add(1, "May");

        System.out.println("Print All the Months added:");

        for(String a:myList){
            System.out.println(a);
        }

        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is May is in list: " + myList.contains("May"));
        System.out.println("Size of ArrayList: " + myList.size());

        myList.remove("Feb");

        System.out.println("New Size of ArrayList: " + myList.size());
    }
}