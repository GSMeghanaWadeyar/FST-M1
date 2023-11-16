import java.util.Arrays;

class Activity4 {
    static void sortAscending(int array[]) {
        int size = array.length;

        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        int[] input = { 9, 5, 1, 4, 3 };

        for(int i = 0; i < input.length; i++) {
            System.out.println("ArrayElements before sorting: " + input[i]);
        }
        sortAscending(input);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(input));
    }
}