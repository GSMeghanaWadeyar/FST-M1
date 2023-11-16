package JavaActivities;

import java.util.*;

public class Activity13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        Random genIndex = new Random();

        System.out.print("Enter integers ");

        while(input.hasNextInt()) {
            list.add(input.nextInt());
        }

        Integer nums[] = list.toArray(new Integer[0]);
        int index = genIndex.nextInt(nums.length);

        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + nums[index]);

        input.close();
    }
}
