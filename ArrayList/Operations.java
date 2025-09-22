import java.util.ArrayList;
import java.util.*;

public class Operations {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add operation
        list.add(1);
        list.add(2);
        list.add(3);
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(list);
        // Get operation
        System.out.println(list.get(2));
        // Remove operation
        list.remove(0);
        list.add(1);
        System.out.println(list);
        //check element is present or not 
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        //insert element
        System.out.println(list);
        list.add(1,9);
        System.out.println(list);

    }
}