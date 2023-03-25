package ArrayToList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class ArrayToList2 {
    void array_list() {
        System.out.println("Converting array to array list");
        int a[] = {1, 2, 3, 4, 5};
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            ar.add(a[i]);
        }
        System.out.println("Array list: " + ar);
        System.out.println("\n");
    }
    void array_list_2() {
    // array list into array
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            ar.add(i);
        }
        int a[] = new int[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            a[i] = ar.get(i);
        }
        System.out.println("Converting array list to array");
        System.out.println("Array: ");
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}