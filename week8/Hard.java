import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Hard {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(26);
        intList.add(73);
        intList.add(58);
        intList.add(99);
        intList.add(22);

        System.out.println(intList);
        sort(intList);
        System.out.println(intList);

        List<String> strList = new LinkedList<>();
        strList.add("Watermellon");
        strList.add("Dragonfruit");
        strList.add("Grapefruit");
        strList.add("Banana");
        strList.add("Apple");

        System.out.println(strList);
        sort(strList);
        System.out.println(strList);
    }

    // Bubble sort
    private static <T extends Comparable<T>> void sort(List<T> list) {
        // Keep sorting until no more swaps are required
        boolean swapped;
        do {
            swapped = false;

            // Iterate through elements
            for (int i = 0; i < list.size() - 1; i++) {
                // If two adjacent elements are out of order...
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    // Swap them
                    T temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);

                    swapped = true;
                }
            }

        } while (swapped);
    }
}
